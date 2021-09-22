//package com.vdm.msgwebservice.repository;
//
//import com.vdm.msgwebservice.entity.Message;
//import com.vdm.msgwebservice.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.sql.Timestamp;
//import java.util.List;
//
//@Repository
//public class MessageRepository extends JpaRepository<Message, Long> {
//    private JdbcTemplate jdbcTemplateOne;
//
//    @Autowired
//    public MessageRepository(JdbcTemplate jdbcTemplateOne) {
//        this.jdbcTemplateOne = jdbcTemplateOne;
//    }
//
//    public List<Message> index() {
//        return jdbcTemplateOne.query("SELECT * FROM messages", new BeanPropertyRowMapper<>(Message.class));
//    }
//
//    public void save(Message message) {
//        String sqlQuery = "INSERT INTO messages(org_id, user_id, " +
//                " transmissionchannel, typemsg, msgbody) VALUES (?, ? , ?, ?, ?, ?)";
//
//        jdbcTemplateOne.update(sqlQuery,
//                message.getOrgId()==0? null : message.getOrgId(), message.getUsername(), message.getPassword(),
//                message.getTransmissionChannel(), message.getTypemsg(), message.getMsgbody());
//        message.setId(getLastId());
//        message.setTimestamp(getLastTimestamp());
//    }
//
//
//    public Integer getLastId() {
//        return jdbcTemplateOne.queryForObject("SELECT id FROM messages ORDER BY id DESC LIMIT 1", Integer.class);
//    }
//
//    public Timestamp getLastTimestamp() {
//        return jdbcTemplateOne.queryForObject("SELECT Timestamp FROM messages ORDER BY id DESC LIMIT 1", Timestamp.class);
//    }
//}
