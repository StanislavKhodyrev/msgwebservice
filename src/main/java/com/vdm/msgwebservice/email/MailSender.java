package com.vdm.msgwebservice.email;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;

public class MailSender {
    private final Properties properties = new Properties();


    public void sendEmail() throws MessagingException, IOException {

        properties.load(MailSender.class.getClassLoader().getResourceAsStream("email.properties"));

        Session mailSession = Session.getDefaultInstance(properties);
        MimeMessage message = new MimeMessage(mailSession);
        message.setFrom(new InternetAddress("myemail@mail.com"));
        message.addRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress("youremail@mail.com")});
        message.setSubject("error");
        message.setText("description");

        Transport transport = mailSession.getTransport();
        transport.connect(null, "123");
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
}
