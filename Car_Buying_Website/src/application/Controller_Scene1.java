package application;

import java.io.IOException;

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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller_Scene1 {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Stage customStage;
	private boolean isSceneOpen = false; // Initialize to false

	@FXML
	TextField sign_up_text_field_name;
	@FXML
	PasswordField sign_up_password_field;
	@FXML
	TextField login_text_field_name;
	@FXML
	PasswordField login_password_field;
	@FXML
	Label label;
	@FXML
	Label label_scene2_checker;
	@FXML
	Button submit_button;
	@FXML
	ImageView myimage;
	
	Image mainimage = new Image(getClass().getResourceAsStream("scene_1_photo_2-01.png"));
	private String login_name;
	private String signup_name;
	private String check = "";
	private String check_login = "";
	private String check_signup = "";
	private String compare = "YES";
	// public int count;
//	private MediaPlayer mediaPlayer;
//	
//    private boolean hasSignedUp = false;
//    private boolean hasLoggedin = false;
//	private MediaPlayer mediaPlayerScene1;
//	private MediaPlayer mediaPlayerScene2;

//	
//	Controller_Scene1(){
//		this.count=0;
//	}
//	
//
//	public void setcountnumber(int count) {
//		this.count = count;
//	}
//
//
//	public int getcountnumber() {
//		return count;
//	}

	public void get_the_login_name(String login_name) {
		this.login_name = login_name;
	}

	public void get_check_name(String check) {
		this.check = check;
		// System.out.print(check);
	}

	public void get_the_login_check(String check_login) {
		this.check_login = check_login;
	}

	public void get_the_signup_check(String check_signup) {
		this.check_signup = check_signup;
	}
//	public void music_play_check1(int count) {
//		this.count = count;
//	}

//	@FXML
//	public void music_player() {
////		if(count==0) {
//		this.count++;
//		// Load and play background music
//		String mediaPath = getClass().getResource("mouse_click.mp3").toExternalForm();
//		Media media = new Media(mediaPath);
//		mediaPlayer = new MediaPlayer(media);
//		mediaPlayer.setAutoPlay(true);
//		// mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
//		mediaPlayer.setCycleCount(10);
//		// mediaPlayer.setOnEndOfMedia(() -> mediaPlayer.seek(Duration.ZERO));
//		// mediaPlayer.stop();
//		System.out.print(count);
//		}
////	}
	public void goto_scene_login_page(ActionEvent event) throws IOException {
//		if(this.count!=0) {
//		mediaPlayer.stop();
//		}
		if (!check_signup.equalsIgnoreCase(compare)) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_login.fxml"));
			root = loader.load();
			//check_login = "YES";
//		hasLoggedin=true;
			Controller_login_page controller_login = loader.getController();
//		controller_login.music_play_check(count);
			controller_login.get_the_login_check(check_login);

			// Controller_Scene2 controller2 = loader.getController();
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root);
//		System.out.println(car1.getBrandName());
			stage.setScene(scene);
			stage.show();
		} else {
			label_scene2_checker.setText("You've already signed up ");
		}
	}

	public void goto_scene_sign_up_page(ActionEvent event) throws IOException {
//		if(this.count!=0) {
//		mediaPlayer.stop();
//		}
		if (!check_login.equalsIgnoreCase(compare)) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_sign_up.fxml"));
			root = loader.load();
//		hasSignedUp = true;
			check_signup = "YES";
			// Controller_login_page controller_login=loader.getController();
//		controller_login.music_play_check(count);

			Controller_sign_up_page controller2 = loader.getController();
			controller2.get_the_signup_check(check_signup);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root);
//		System.out.println(car1.getBrandName());
			stage.setScene(scene);
			stage.show();
		} else {

			label_scene2_checker.setText("You've already logged in.");
		}
	}

//	
//	public void gotologin(ActionEvent event) {
//		Controller_login_page a = new Controller_login_page();
//		String anas = a.check;
//		if (isSceneOpen) {
//			closeScene();
//			if (anas.equals("YES")) {
//				label_scene2_checker.setText("THANKS FOR LOGIN");
//			}
//		} else {
//			openScene();
//		}
//	}
//
//	private void openScene() {
//		try {
//			FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_login.fxml"));
//			root = loader.load();
//			customStage = new Stage();
//			customStage.setScene(new Scene(root));
//			customStage.setX(600);
//			customStage.setY(200);
//			isSceneOpen = true;
//			customStage.show();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	private void closeScene() {
//		if (customStage != null) {
//			// Close the custom stage
//			customStage.close();
//			isSceneOpen = false;
//		}
//	}

	public void gotoscene2(ActionEvent event) throws IOException {
		//myimage.setImage(mainimage);
		// mediaPlayerScene1.stop();
		// music_player_main_menu();
		// System.out.print(count);
		if (this.check.equals("YES")) {
			//System.out.print(login_name);
			// Stop the music
//			if(this.count!=0) {
//		    mediaPlayer.stop();
//			}
			// Load scene2
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
			root = loader.load();
			Controller_Scene2 controller2 = loader.getController();
			controller2.get_the_login_name(login_name);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} else {
			label_scene2_checker.setText("LOGIN or sign up FIRST");

		}
	}
}