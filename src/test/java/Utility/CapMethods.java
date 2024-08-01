package Utility;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

public class CapMethods {

    public static String getBase64Screenshot(String imageFilename) throws IOException {
        File fileName = new File("src\\main\\resources\\ScreenShots\\" + imageFilename + ".png");
        String encodedBase64 = null;

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            byte[] bytes = new byte[(int) fileName.length()];
            fileInputStream.read(bytes);
            encodedBase64 = new String(Base64.getEncoder().encode(bytes), "UTF-8");
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return encodedBase64;
    }

    public static void sendEmailWithAttachment() {
        String username = "";
        String password = "";

        Properties properties = new Properties();
        // Setup mail server
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("arslan.yasin@evampsaanga.com,arslan6718@gmail.com,arslan.yasin8625@gmail.com"));
            message.setSubject("Automation Test Report");

            Multipart emailcontent = new MimeMultipart();

            MimeBodyPart textbodypart = new MimeBodyPart();
            textbodypart.setText("Dear Owner; \nPlease find the attached test report.To view the test report first download the report then open it in your browser.");

            MimeBodyPart attachment = new MimeBodyPart();
            attachment.attachFile("C:\\Users\\Waleed Khan\\IdeaProjects\\SudaTel\\Spark.html");

            emailcontent.addBodyPart(textbodypart);
            emailcontent.addBodyPart(attachment);

            message.setContent(emailcontent);

            Transport.send(message);
            //System.out.println("Email Sent message");
        } catch (Exception ex) {
            System.out.println("This is exception" + ex);
        }
    }
}
