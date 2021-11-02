package com.vdm.msgwebservice.waybillevwnt.xml;

import com.vdm.msgwebservice.waybillevwnt.data.AWB;
import com.vdm.msgwebservice.waybillevwnt.data.Routing;
import com.vdm.msgwebservice.waybillevwnt.data.Segments;
import org.jdom2.Document;
import com.vdm.msgwebservice.waybillevwnt.repo.GeneralRepo;
import org.jdom2.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class XmlCreator {
    private GeneralRepo generalRepo;

    @Autowired
    public XmlCreator(GeneralRepo generalRepo) {
        this.generalRepo = generalRepo;
    }

    public Document createDocument(String param) {
        Document document = new Document();
        document.setProperty("standalone", "yes");

        Element rootElement = new Element("Cargo");

        Element awbElement = createAWMPart(param);
        Element routingElement = createRoutingPart(param);
        List<Element> segmentsElement = createSegmentsPart(param);

        awbElement.addContent(routingElement);
        awbElement.addContent(segmentsElement);
        rootElement.addContent(awbElement);

        document.setRootElement(rootElement);

        return document;
    }

    private Element createAWMPart(String param) {

        AWB awb = generalRepo.getAWB(param);
        Element awbElement = new Element("Awb")
                .setAttribute("num", awb.getAwb_num());
        Element awbOriginElement = new Element("AwbOrigin").setText(awb.getAwborigin());
        Element awbDestinationElement = new Element("AwbDestination").setText(awb.getAwbdestination());
        Element awbPiecesElement = new Element("AwbPieces")
                .setText(String.valueOf(awb.getAwbpieces()).equals("null") ? "" : String.valueOf(awb.getAwbpieces()));
        Element awbWeightElement = new Element("AwbWeight")
                .setText(String.valueOf(awb.getAwbweight()).equals("null") ? "" : String.valueOf(awb.getAwbweight()));
        Element awbVolumeElement = new Element("AwbVolume")
                .setText(String.valueOf(awb.getVolume()).equals("null") ? "" : String.valueOf(awb.getVolume()));
        awbElement.addContent(awbOriginElement);
        awbElement.addContent(awbDestinationElement);
        awbElement.addContent(awbPiecesElement);
        awbElement.addContent(awbWeightElement);
        awbElement.addContent(awbVolumeElement);

        return awbElement;
    }

    private Element createRoutingPart(String param) {

        List<Routing> routingList = generalRepo.getRouting(param);
        int i = 1;
        Element routingElement = new Element("Routing");
        for (Routing r : routingList) {
            Element line = new Element("line")
                    .setAttribute("sequence", String.valueOf(i));
            i++;
            Element flightOrigin = new Element("FlightOrigin").setText(r.getFlightorigin());
            Element flightDest = new Element("FlightDest").setText(r.getFlightdest());
            Element flightNum = new Element("FlightNum").setText(r.getFlightnum());
            Element flightDate = new Element("FlightDate").setText(r.getFlightdate());
            Element alloc = new Element("Alloc").setText(r.getAlloc());
            Element pieces = new Element("Pieces").setText(r.getPieces().toString());
            Element weight = new Element("Weight").setText(r.getWeight().toString());
            Element volume = new Element("Volume").setText(r.getVolume().toString());
            Element flightCat = new Element("FlightCat").setText(r.getFlightcat());
            Element typeofDepartureTime = new Element("TypeofDepartureTime").setText(r.getTypeofdeparturetime());
            Element departureDate = new Element("DepartureDate").setText(r.getDeparturedate());
            Element departureTime = new Element("DepartureTime").setText(r.getDeparturetime().toString());
            Element typeofArrivalTime = new Element("TypeofArrivalTime").setText(r.getTypeofarrivaltime());
            Element arrivalDate = new Element("ArrivalDate").setText(r.getArrivaldate());
            Element arrivalTime = new Element("ArrivalTime").setText(r.getArrivaltime().toString());
            Element status = new Element("Status").setText(r.getStatus());
            Element c = new Element("StatusDesc").setText(r.getStatusdesc());

            line.addContent(flightOrigin);
            line.addContent(flightDest);
            line.addContent(flightNum);
            line.addContent(flightDate);
            line.addContent(alloc);
            line.addContent(pieces);
            line.addContent(weight);
            line.addContent(volume);
            line.addContent(flightCat);
            line.addContent(typeofDepartureTime);
            line.addContent(departureDate);
            line.addContent(departureTime);
            line.addContent(typeofArrivalTime);
            line.addContent(arrivalDate);
            line.addContent(arrivalTime);
            line.addContent(status);
            routingElement.addContent(line);
        }

        return routingElement;
    }

    private List<Element> createSegmentsPart(String param) {
        List<Element> result = new ArrayList<>();
        List<Segments> segmentsList = generalRepo.getSegments(param);
        int i = 1;
        for (Segments s : segmentsList) {
            Element segmentsElement = new Element("Segment")
                    .setAttribute("sequence", String.valueOf(i));
            i++;
            Element origin = new Element("Origin").setText(s.getOrigin());
            Element dest = new Element("Dest").setText(s.getDest());
            Element flightNum = new Element("FlightNum").setText(s.getFlightNum());
            Element flightCat = new Element("FlightCat").setText(s.getFlightCat());
            Element flightDate = new Element("FlightDate").setText(s.getFlightDate());
            Element arrivalDate = new Element("ArrivalDate").setText(s.getArrivalDate());
            Element numPieces = new Element("NumPieces").setText(String.valueOf(s.getNumPieces()));
            Element weight = new Element("Weight").setText(String.valueOf(s.getWeight()));
            Element volume = new Element("Volume").setText(String.valueOf(s.getVolume()));
            Element status = new Element("Status").setText(s.getStatus());
            Element eventDate = new Element("EventDate").setText(s.getEventDate());
            Element eventTime = new Element("EventTime").setText(s.getEventTime());
            Element statusCode = new Element("StatusCode").setText(s.getStatusCode());

            segmentsElement.addContent(origin);
            segmentsElement.addContent(dest);
            segmentsElement.addContent(flightNum);
            segmentsElement.addContent(flightCat);
            segmentsElement.addContent(flightDate);
            segmentsElement.addContent(arrivalDate);
            segmentsElement.addContent(numPieces);
            segmentsElement.addContent(weight);
            segmentsElement.addContent(volume);
            segmentsElement.addContent(status);
            segmentsElement.addContent(eventDate);
            segmentsElement.addContent(eventTime);
            segmentsElement.addContent(statusCode);
            result.add(segmentsElement);
        }

        return result;
    }

    public Document createNullDocument(String param) {
        String awbNum = param.substring(0, 3) + "-" + param.substring(3);
        Document document = new Document();
        document.setProperty("standalone", "yes");

        Element rootElement = new Element("Cargo");
        Element awbElement = new Element("Awb")
                .setAttribute("num", awbNum);
        Element error = new Element("ErrorMessage").setText
                ("Could not find AWB " + awbNum + ". Please check your request and try again.");
        rootElement.addContent(awbElement);
        rootElement.addContent(error);
        document.setRootElement(rootElement);
        return document;
    }
}


