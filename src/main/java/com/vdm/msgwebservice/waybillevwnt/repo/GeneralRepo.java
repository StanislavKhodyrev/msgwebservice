package com.vdm.msgwebservice.waybillevwnt.repo;


import com.vdm.msgwebservice.waybillevwnt.data.AWB;
import com.vdm.msgwebservice.waybillevwnt.data.Routing;
import com.vdm.msgwebservice.waybillevwnt.data.Segments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GeneralRepo {
    private JdbcTemplate jdbcTemplateOne;

    @Autowired
    public GeneralRepo(JdbcTemplate jdbcTemplateOne) {
        this.jdbcTemplateOne = jdbcTemplateOne;
    }

    public AWB getAWB(String param) throws EmptyResultDataAccessException {
        String sql = "SELECT " +
                "  f.cd_awb_airline_prefix || '-' || f.cd_awb_serial_number AS Awb_num," +
                "  f.cd_awb_airport_origin AS AwbOrigin," +
                "  f.cd_awb_airport_destination AS AwbDestination," +
                "  f.cd_qtd_number_pieces AS AwbPieces," +
                "  f.cd_qtd_weight AS AwbWeight," +
                "  (SELECT dda.volume FROM mmsc.draft_dap_analysis dda WHERE dda.\"PREFIX\" = SUBSTRING" +
                "(? FROM 1 FOR 3) AND dda.serial = SUBSTRING(? FROM 4 FOR 11) LIMIT 1) AS Volume" +
                " FROM " +
                " mmsc.fsu f " +
                "WHERE " +
                "  f.cd_awb_airline_prefix = SUBSTRING(? FROM 1 FOR 3)" +
                "  AND f.cd_awb_serial_number = SUBSTRING(? FROM 4 FOR 11) " +
                "  AND f.fsu_id = (SELECT MAX(fsu_tmp.fsu_id) FROM mmsc.fsu fsu_tmp " +
                "WHERE fsu_tmp.cd_awb_airline_prefix = SUBSTRING(? FROM 1 FOR 3) " +
                "AND fsu_tmp.cd_awb_serial_number = SUBSTRING(? FROM 4 FOR 11))";

        return jdbcTemplateOne.queryForObject(sql, new Object[]{param, param, param, param, param, param}, new BeanPropertyRowMapper<>(AWB.class));
    }

    public List<Routing> getRouting(String param) {
        String sql = "WITH fsu_fsd_msg AS " +
                "(" +
                "  SELECT " +
                "    DISTINCT" +
                "    fsd.fsu_id," +
                "    fsd.mvd_airport_code_origin AS FlightOrigin," +
                "    fsd.mvd_airport_code_destination AS FlightDest," +
                "    fsd.mvd_carrier_code AS mvd_carrier_code, " +
                "    fsd.mvd_flight_number, " +
                "    fsd.mvd_carrier_code || fsd.mvd_flight_number AS FlightNum," +
                "    TO_CHAR(fsd.mvd_date, 'ddMONYY') AS FlightDate," +
                "    'KK' AS Alloc, " +
                "    fsd.qtd_number_pieces AS Pieces," +
                "    fsd.qtd_weight AS Weight," +
                "    (SELECT dda.volume FROM mmsc.draft_dap_analysis dda " +
                "    WHERE dda.\"PREFIX\" = SUBSTRING(? FROM 1 FOR 3) " +
                "    AND dda.serial = SUBSTRING(? FROM 4 FOR 11) LIMIT 1) AS Volume," +
                "    'F' AS FlightCat," +
                "    CASE fsd.tdi_type_of_indicator" +
                "    WHEN 'S' THEN 'Scheduled' " +
                "    WHEN 'E' THEN 'Estimated' " +
                "    WHEN 'A' THEN 'Actual'" +
                "    END AS TypeofDepartureTime," +
                "    TO_CHAR(fsd.mvd_date, 'ddMONYY') AS DepartureDate," +
                "    fsd.tdi_time AS DepartureTime," +
                "    CASE fsd.tai_type_of_indicator" +
                "    WHEN 'S' THEN 'Scheduled' " +
                "    WHEN 'E' THEN 'Estimated' " +
                "    WHEN 'A' THEN 'Actual'" +
                "    END AS TypeofArrivalTime," +
                "    TO_CHAR(fsd.mvd_date, 'ddMONYY') AS ArrivalDate," +
                "    fsd.tai_time AS ArrivalTime," +
                "    TO_CHAR(fsd.mvd_date, 'ddMONYY') AS EventDate," +
                "    fsd.mvd_actual_time AS EventTime," +
                "    fsd.status_code AS Status," +
                "    CASE fsd.status_code" +
                "    WHEN 'BKD' THEN 'Booked' " +
                "    WHEN 'DEP' THEN 'Departed' " +
                "    WHEN 'ARR' THEN 'Arrived'" +
                "    END AS StatusDesc," +
                "    CASE fsd.status_code" +
                "    WHEN 'BKD' THEN '1' " +
                "    WHEN 'DEP' THEN '2' " +
                "    WHEN 'ARR' THEN '3'" +
                "    END AS StatusType," +
                "    fsd.mvd_date " +
                "  FROM " +
                "  mmsc.fsu fsu," +
                "  mmsc.fsu_status_detail fsd " +
                "  WHERE " +
                "    fsu.cd_awb_airline_prefix = SUBSTRING(? FROM 1 FOR 3)" +
                "    AND fsu.cd_awb_serial_number = SUBSTRING(? FROM 4 FOR 11)" +
                "    AND fsd.fsu_id = fsu.fsu_id " +
                "    AND fsd.status_code IN ('DEP')" + // (, 'BKD', 'ARR')
                ")" +
                "SELECT " +
                "  fc.from_airport AS FlightOrigin," +
                "  fc.to_airport AS FlightDest, " +
                "  fsu_fsd_msg.FlightNum," +
                "  fsu_fsd_msg.FlightDate," +
                "  fsu_fsd_msg.Alloc," +
                "  fsu_fsd_msg.Pieces," +
                "  COALESCE(fsu_fsd_msg.Weight, (SELECT fsu.cd_qtd_weight FROM mmsc.fsu fsu " +
                "  WHERE fsu.fsu_id = fsu_fsd_msg.fsu_id)) AS Weight," +
                "  fsu_fsd_msg.Volume," +
                "  fsu_fsd_msg.FlightCat," +
                "  fsu_fsd_msg.TypeofDepartureTime," +
                "  TO_CHAR(fc.atd_utc_dtm, 'ddMONYY') AS DepartureDate, " +
                "  fc.atd_utc_dtm::TIME AS DepartureTime, " +
                "  fsu_fsd_msg.TypeofArrivalTime," +
                "  TO_CHAR(COALESCE(fc.block_on_utc_dtm, fc.ata_utc_dtm), 'ddMONYY') AS ArrivalDate, " +
                "  COALESCE(fc.block_on_utc_dtm, fc.ata_utc_dtm)::TIME AS ArrivalTime, " +
                "  fsu_fsd_msg.Status," +
                "  fsu_fsd_msg.StatusDesc" +
                "  FROM " +
                "  fsu_fsd_msg INNER JOIN mmsc.flight_control fc ON " +
                "  fsu_fsd_msg.mvd_carrier_code = fc.carrier_code" +
                "  AND fsu_fsd_msg.mvd_flight_number = fc.flight_number" +
                "  AND (DATE_TRUNC('day',fc.dep_sched_local_dt) = fsu_fsd_msg.mvd_date " +
                "OR DATE_TRUNC('day', fc.arr_sched_local_dt) = fsu_fsd_msg.mvd_date)" +
                "ORDER BY " +
                "  fc.flight_id, fsu_fsd_msg.StatusType, fsu_fsd_msg.mvd_date";
        List<Routing> result = new ArrayList<>();
        jdbcTemplateOne.query
                (sql, new Object[]{param, param, param, param}, (rs, rowNum) ->
                    result.add(new Routing(
                            rs.getString("flightorigin"),
                            rs.getString("flightdest"),
                            rs.getString("flightnum"),
                            rs.getString("flightdate"),
                            rs.getString("alloc"),
                            rs.getInt("pieces"),
                            rs.getInt("weight"),
                            rs.getInt("volume"),
                            rs.getString("flightcat"),
                            rs.getString("typeofdeparturetime"),
                            rs.getString("departuredate"),
                            rs.getTimestamp("departuretime"),
                            rs.getString("typeofarrivaltime"),
                            rs.getString("arrivaldate"),
                            rs.getTimestamp("arrivaltime"),
                            rs.getString("status"),
                            rs.getString("statusdesc"))));
        return result;
    }

    public List<Segments> getSegments(String param) {
        String sql = "WITH fsu_fsd_msg AS \n" +
                "(\n" +
                "  SELECT\n" +
                "    DISTINCT\n" +
                "    fsd.fsu_id,\n" +
                "    fsd.fsu_status_id,\n" +
                "    fsd.mvd_airport_code_origin AS FlightOrigin,\n" +
                "    fsd.mvd_airport_code_destination AS FlightDest,\n" +
                "    fsd.mvd_carrier_code AS mvd_carrier_code, --служебное поле\n" +
                "    fsd.mvd_flight_number, --служебное поле\n" +
                "    fsd.mvd_carrier_code || fsd.mvd_flight_number AS FlightNum,\n" +
                "    TO_CHAR(fsd.mvd_date, 'ddMONYY') AS FlightDate,\n" +
                "    fsd.qtd_number_pieces AS NumPieces,\n" +
                "    fsd.qtd_weight AS Weight,\n" +
                "    (SELECT dda.volume FROM mmsc.draft_dap_analysis dda " +
                "WHERE dda.\"PREFIX\" = SUBSTRING(? FROM 1 FOR 3) " +
                "AND dda.serial = SUBSTRING(? FROM 4 FOR 11) LIMIT 1) AS Volume,\n" +
                "    'F' AS FlightCat,\n" +
                "    CASE fsd.tdi_type_of_indicator\n" +
                "  \t  WHEN 'S' THEN 'Scheduled' \n" +
                "  \t  WHEN 'E' THEN 'Estimated' \n" +
                "  \t  WHEN 'A' THEN 'Actual'\n" +
                "    END AS TypeofDepartureTime,\n" +
                "    TO_CHAR(fsd.mvd_date, 'ddMONYY') AS DepartureDate,\n" +
                "    fsd.tdi_time AS DepartureTime,\n" +
                "    CASE fsd.tai_type_of_indicator\n" +
                "  \t  WHEN 'S' THEN 'Scheduled' \n" +
                "  \t  WHEN 'E' THEN 'Estimated' \n" +
                "  \t  WHEN 'A' THEN 'Actual'\n" +
                "    END AS TypeofArrivalTime,\n" +
                "    TO_CHAR(fsd.mvd_date, 'ddMONYY') AS ArrivalDate,\n" +
                "    fsd.tai_time AS ArrivalTime, \n" +
                "    TO_CHAR(fsd.mvd_date, 'ddMONYY') AS EventDate,\n" +
                "    fsd.mvd_actual_time AS EventTime,\n" +
                "    CASE fsd.status_code\n" +
                "  \t  WHEN 'BKD' THEN 'Booked' \n" +
                "  \t  WHEN 'DEP' THEN 'Departed'\n" +
                "  \t  WHEN 'RCS' THEN 'Received From Shipper'\n" +
                "  \t  WHEN 'ARR' THEN 'Arrived'\n" +
                "  \t  WHEN 'AWD' THEN 'Arrival documents delivered to Consignee/Agent'\n" +
                "  \t  WHEN 'MAN' THEN 'Manifested on Flight'\n" +
                "  \t  WHEN 'NFD' THEN 'Consignee/Agent notified of arrival'\n" +
                "  \t  WHEN 'RCF' THEN 'Received From Flight'\n" +
                "    END AS Status,\n" +
                "    CASE fsd.status_code\n" +
                "  \t  WHEN 'BKD' THEN '1' \n" +
                "  \t  WHEN 'RCS' THEN '2'\n" +
                "  \t  WHEN 'DEP' THEN '3' \n" +
                "  \t  WHEN 'MAN' THEN '4'\n" +
                "  \t  WHEN 'ARR' THEN '5'\n" +
                "  \t  WHEN 'RCF' THEN '6'\n" +
                "  \t  WHEN 'NFD' THEN '7'\n" +
                "  \t  WHEN 'AWD' THEN '8'\n" +
                "   END AS statustype, --служебное поле\n" +
                "    fsd.mvd_date, --служебное поле\n" +
                "    fsu.file_id,\n" +
                "    fsd.status_code\n" +
                "  FROM \n" +
                "    mmsc.fsu fsu,\n" +
                "\tmmsc.fsu_status_detail fsd \n" +
                "  WHERE \n" +
                "    fsu.cd_awb_airline_prefix = SUBSTRING(? FROM 1 FOR 3)\n" +
                "    AND fsu.cd_awb_serial_number = SUBSTRING(? FROM 4 FOR 11)\n" +
                "    AND fsd.fsu_id = fsu.fsu_id \n" +
                "    --AND fsd.status_code IN ('DEP', 'BKD', 'ARR')\n" +
                ")\n" +
                "SELECT  \n" +
                "  fsu_fsd_msg.fsu_id,\n" +
                "  fsu_fsd_msg.fsu_status_id,\n" +
                "  fsu_fsd_msg.file_id,\n" +
                "  fc.flight_id,\n" +
                "  fc.from_airport AS Origin,\n" +
                "  fc.to_airport AS Dest, \n" +
                "  fsu_fsd_msg.FlightNum,\n" +
                "  CASE \n" +
                "    WHEN fsu_fsd_msg.FlightNum IS NULL THEN NULL\n" +
                "    ELSE fsu_fsd_msg.FlightCat\n" +
                "  END AS FlightCat,\n" +
                "  fsu_fsd_msg.FlightDate,\n" +
                "  fsu_fsd_msg.ArrivalDate,\n" +
                "  COALESCE(fc.block_on_utc_dtm, fc.ea_utc_dtm)::TIME AS ArrivalTime,\n" +
                "  fsu_fsd_msg.NumPieces,\n" +
                "  COALESCE(fsu_fsd_msg.Weight, (SELECT fsu.cd_qtd_weight FROM mmsc.fsu fsu " +
                "WHERE fsu.fsu_id = fsu_fsd_msg.fsu_id)) AS Weight,\n" +
                "  fsu_fsd_msg.Volume,\n" +
                "  fsu_fsd_msg.Status,\n" +
                "  '' AS EventDate,\n" +
                "  '' AS EventTime,\n" +
                "  fsu_fsd_msg.status_code AS StatusCode\n" +
                "FROM \n" +
                "  fsu_fsd_msg LEFT JOIN mmsc.flight_control fc ON \n" +
                "  fsu_fsd_msg.mvd_carrier_code = fc.carrier_code\n" +
                "  AND fsu_fsd_msg.mvd_flight_number = fc.flight_number\n" +
                "  AND (DATE_TRUNC('day',fc.dep_sched_local_dt) = fsu_fsd_msg.mvd_date " +
                "OR DATE_TRUNC('day', fc.arr_sched_local_dt) = fsu_fsd_msg.mvd_date)\n" +
                "ORDER BY \n" +
                "  fsu_fsd_msg.fsu_id";
        List<Segments> result = new ArrayList();
        jdbcTemplateOne.query(sql, new Object[]{param,param,param,param}, (rs, rowNum) ->
                result.add(new Segments (
                        rs.getString("origin"),
                        rs.getString("dest"),
                        rs.getString("flightnum"),
                        rs.getString("flightcat"),
                        rs.getString("flightdate"),
                        rs.getString("arrivaldate"),
                        rs.getTimestamp("arrivaltime"),
                        rs.getInt("numpieces"),
                        rs.getInt("weight"),
                        rs.getInt("volume"),
                        rs.getString("status"),
                        rs.getString("eventdate"),
                        rs.getString("eventtime"),
                        rs.getString("statuscode"))));
        return result;
    }

}