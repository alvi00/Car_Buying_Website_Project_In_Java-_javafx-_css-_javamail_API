package application;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Controller_Gmail_Api {
    Session newSession = null;
    MimeMessage mimeMessage;

    public static void main(String[] args) throws MessagingException, AddressException, IOException {
        Controller_Gmail_Api mail = new Controller_Gmail_Api();
        mail.setupServerProperties();
        mail.draftEmail();
        mail.sendEmail();
    }

    private void setupServerProperties() {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        newSession = Session.getDefaultInstance(properties, null);
    }

    private MimeMessage draftEmail() throws AddressException, MessagingException, IOException {
        String[] emailRecipients = { "lovelyyeasminjesmin@gmail.com"};
        String emailSubject = "Thanks For Buying From our Website";
        String emailBody = "Your Car Informations are ";
        mimeMessage = new MimeMessage(newSession);
        for (int i = 0; i < emailRecipients.length; i++) {
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(emailRecipients[i]));
        }
        mimeMessage.setSubject(emailSubject);

        MimeBodyPart bodyPart = new MimeBodyPart();
        bodyPart.setContent(emailBody, "text/html");
        MimeMultipart multipart = new MimeMultipart();
        multipart.addBodyPart(bodyPart);
        mimeMessage.setContent(multipart);
        return mimeMessage;
    }

    private void sendEmail() throws NoSuchProviderException, MessagingException {
        String fromUser = "ahmadfahmid59@gmail.com";
        String fromUserPassword = "fqvb xkqs virs hmvj";
        String emailHost = "smtp.gmail.com";
        Transport transport = newSession.getTransport("smtp");
        transport.connect(emailHost, fromUser, fromUserPassword);
        transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
        transport.close();
        System.out.println("Email successfully sent");
    }
}
