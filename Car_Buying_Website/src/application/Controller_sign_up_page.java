package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class Controller_sign_up_page {

	@FXML
	private TextField sign_up_field;

	@FXML
	private PasswordField sign_up_pass_field;

	@FXML
	private Label sign_up_label;

	private String sign_up_name;
	private String password;
	protected String check = "";
	protected String check_signup = "";
	private Stage stage;
	private Scene scene;
	private Parent root;

	public void get_the_signup_check(String check_signup) {
		this.check_signup = check_signup;
	}

	public void signUp() {
		sign_up_name = sign_up_field.getText();
		password = sign_up_pass_field.getText();

		// Validate user input
		if (sign_up_name.isEmpty() || password.isEmpty()) {
			sign_up_label.setText("Not Entered");
		} else {
			// Save user info to a file
			saveUserInfo(sign_up_name, password);
			check = "YES";
			sign_up_label.setText("Sign-up successful!");
		}
	}

	private void saveUserInfo(String name, String password) {
		try {
			File file = new File("user_info.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

			// Append user info to the file
			writer.write(name + "," + password);
			writer.newLine();

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void goto_scene1(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
		root = loader.load();

		Controller_Scene1 controller1 = loader.getController();
		controller1.get_the_login_name(sign_up_name);
		controller1.get_check_name(check);
		controller1.get_the_signup_check(check_signup);
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
