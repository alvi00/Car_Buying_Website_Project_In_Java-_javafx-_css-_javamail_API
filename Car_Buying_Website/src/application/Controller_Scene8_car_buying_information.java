package application;

import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.IOException;

public class Controller_Scene8_car_buying_information {
	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	private Label information_label;

	@FXML
	private TextField name_textfield;

	@FXML
	private TextField phone_textfield;

	@FXML
	private TextField country_textfield;

	@FXML
	private TextField zip_postal_textfield;

	@FXML
	private TextField credir_card_textfield;

	private String name;
	private String phone;
	private String country;
	private String zip_postal;
	private String credir_card;
	private String mail;
	private String mail_name;
	private String  mail_info;


	@FXML
	private Label delivery_label;
	@FXML
	private Label tax_label;
	@FXML
	private Label total_label;
	
	@FXML
	private Label  mylabel;
	
	@FXML
	private TextField email_textfield;
	

	public void extra_charges_info(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene8_car_buying_information.fxml"));
		root = loader.load();

		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Car car1 = (Car) stage.getUserData();
		stage.setUserData(car1);
		// System.out.println(car1.toString());
		delivery_label.setText("$1,650");
		tax_label.setText("$1,300");
		total_label.setText(car1.getCarPrice());

	}
	



	public void gotoscene9_car_buying_information(ActionEvent event) throws IOException {
		name = name_textfield.getText();
		phone = phone_textfield.getText();
		country = country_textfield.getText();
		zip_postal = zip_postal_textfield.getText();
		credir_card = credir_card_textfield.getText();
		mail=email_textfield.getText();
		
		
		

		if(name.isEmpty()||phone.isEmpty()||country.isEmpty()||zip_postal.isEmpty()||credir_card.isEmpty()||mail.isEmpty()) {
			mylabel.setText("Enter All information");
		}else if(!mail.endsWith("@gmail.com")) {
			mylabel.setText("Invalid Mail");
		}
		
		else {
			
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene9_last_page_congratulation.fxml"));
		root = loader.load();
		

		// Controller_Scene2 controller2 = loader.getController();
		

		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		
		
		car1.setUsername(name);
		car1.setPhonenumber(phone);
		car1.setCountryname(country);
		car1.setZipcode(zip_postal);
		car1.setCreditcardnumber(credir_card);
		car1.set_email(mail);

		stage.setUserData(car1);
		mail_name=car1.get_email();
		mail_info=car1.toString();
		Controller_Scene9_lastpage_congratulation controller9 = loader.getController();
		controller9.get_email_name(mail_name);
		controller9.get_email_info(mail_info);

		

//		System.out.println(car1.getBrandName());
		stage.setScene(scene);
		stage.show();

		try {
			// Create a FileWriter and specify the file path
			FileWriter fileWriter = new FileWriter(car1.get_login_name()+".txt",true);

			// Write the car information to the file
			fileWriter.write(car1.toString());

			// Close the FileWriter
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	}
	
	


}
