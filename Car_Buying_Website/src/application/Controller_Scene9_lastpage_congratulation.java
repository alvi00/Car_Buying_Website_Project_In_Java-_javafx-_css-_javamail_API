package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.*;
import java.util.Properties;

public class Controller_Scene9_lastpage_congratulation {
    @FXML
    private TextArea carInfoTextArea;

    @FXML
    private AnchorPane scenePane;

    @FXML
    private Button logoutbutton;

    Stage primaryStage;
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String mail_name;
    private String mail_info;

    @FXML
    ImageView myimage;
    Image mainimage = new Image(getClass().getResourceAsStream("last_page.gif"));


    public void get_email_name(String mail_name) {
    	this.mail_name = mail_name;
       
    }

    public void get_email_info(String mail_info) {
    	this.mail_info = mail_info;
        
    }

    public void logout(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("LOGOUT");
        alert.setHeaderText("You're about to Exit!");
        alert.setContentText("If You Wanna Exit Press Ok");

        if (alert.showAndWait().get() == ButtonType.OK) {
            primaryStage = (Stage) scenePane.getScene().getWindow();
            primaryStage.close();
        }
    }

    public void every_info_Show(ActionEvent event) throws IOException {
        //System.out.print("the mail id ");
        //System.out.print(mail_name);
        // Load the car information from the file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene9_last_page_congratulation.fxml"));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Car car1 = (Car) stage.getUserData();
        stage.setUserData(car1);

        try {
            FileReader fileReader = new FileReader("car_info.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            StringBuilder carInfo = new StringBuilder();

            while ((line = bufferedReader.readLine()) != null) {
                carInfo.append(line).append("\n");
            }

            carInfoTextArea.setText(car1.toString());

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleEmailButtonAction(ActionEvent event) {
        try {
            sendEmail();
            myimage.setImage(mainimage);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendEmail() throws MessagingException {
        // This part will work with server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session newSession = Session.getDefaultInstance(properties, null);

        // This part will draft the mail
        String[] emailRecipients = {mail_name};
        String emailSubject = "Thanks For Buying From our Website";
        String emailBody = mail_info;

        MimeMessage mimeMessage = new MimeMessage(newSession);
        for (int i = 0; i < emailRecipients.length; i++) {
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(emailRecipients[i]));
        }
        mimeMessage.setSubject(emailSubject);

        MimeBodyPart bodyPart = new MimeBodyPart();
        bodyPart.setContent(emailBody, "text/html");

        MimeMultipart multipart = new MimeMultipart();
        multipart.addBodyPart(bodyPart);
        mimeMessage.setContent(multipart);

        // This part will send e-mail
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
