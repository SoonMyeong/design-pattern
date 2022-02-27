package com.soon.design._10_facade._01_before;


import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


//ex. send email
public class BeforeClient {
    public static void main(String[] args) {
        String to = "soonmyeong91@gmail.com";
        String from = "ggod128@gmail.com";
        String host = "127.0.0.1";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host",host);

        Session session = Session.getDefaultInstance(properties);

        MimeMessage message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Test Mail");
            message.setText("Message");

            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
