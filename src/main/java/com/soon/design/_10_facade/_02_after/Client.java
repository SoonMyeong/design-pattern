package com.soon.design._10_facade._02_after;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailMessage emailMessage = new EmailMessage();

        emailMessage.setFrom("soonmyeong91@gmail.com");
        emailMessage.setTo("ggod128@gmail.com");
        emailMessage.setSubject("java mail test");
        emailMessage.setText("message");

        EmailSender emailSender = new EmailSender(emailSettings);

        emailSender.sendEmail(emailMessage);
    }
}
