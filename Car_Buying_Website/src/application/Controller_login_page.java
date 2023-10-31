package application;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller_login_page {

	protected String check = "";
//	protected int count=0;
	// private String scene2_checker;
//	public void music_play_check(int count) {
//		this.count = count;
//	}

//	public void submit() throws IOException {
//	    signup_name = sign_up_text_field_name.getText();
//	    signup_password = sign_up_password_field.getText();
//	    login_name = login_text_field_name.getText();
//	    login_password = login_password_field.getText();
//
//	    if (signup_name.equals(login_name) && signup_password.equals(login_password)) {
//	        check = "YES"; // Set check to "YES" before closing the scene
//	        label.setText("Successful, Press login button again");
//	    } else {
//	        label.setText("Not a match");
//	    }
////		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
////		root = loader.load();
////		
////		Controller_Scene1 controller1=loader.getController();
////		controller1.get_the_login_name(login_name);
////		controller1.get_check_name(check);
////		controller1.music_play_check1(count);
//	    
//	}

	// this is the main code

	@FXML
	private TextField login_field;

	@FXML
	private PasswordField login_pass;

	@FXML
	private Label login_label;

	private Stage stage;
	private Scene scene;
	private Parent root;

	private String login_name;
	private String password;
	private String check_login = "";

	public void get_the_login_check(String check_login) {
		this.check_login = check_login;
	}

	public void login() {
		login_name = login_field.getText();
		password = login_pass.getText();

		if (login_name.isEmpty() || password.isEmpty()) {
			login_label.setText("Not Entered");
			return;
		}

		boolean userFound = checkUserInfo(login_name, password);

		if (userFound) {
			login_label.setText("Login successful!");
			check = "YES";
		} else {
			login_label.setText("Login failed");
		}
	}

	private boolean checkUserInfo(String name, String password) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("user_info.txt"));
			String line;

			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length == 2 && parts[0].equals(name) && parts[1].equals(password)) {
					return true; // User found
				}
			}

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false; // User not found
	}

	public void goto_scene1(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
		root = loader.load();

		Controller_Scene1 controller1 = loader.getController();
		controller1.get_the_login_name(login_name);
		controller1.get_check_name(check);
		controller1.get_the_login_check(check_login);
//		controller1.music_play_check1(count);

//		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
////		Controller_Scene1 c1 = (Controller_Scene1) stage.getUserData();
////		c1.setcountnumber(1);
//		stage.setUserData(c1);

		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
//		System.out.println(car1.getBrandName());
		stage.setScene(scene);
		stage.show();
	}

}
