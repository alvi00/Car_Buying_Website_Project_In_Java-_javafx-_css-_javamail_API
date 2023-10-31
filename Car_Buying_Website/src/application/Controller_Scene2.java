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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller_Scene2 {

	@FXML
	Label mylabel;
	
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	private MediaPlayer mediaPlayer;
	private Car car1;
	
	
	private String login_name;

//    @FXML
//    public void music_player() {
//        // Load and play background music
//        String mediaPath = getClass().getResource("mouse_click.mp3").toExternalForm();
//        Media media = new Media(mediaPath);
//        mediaPlayer = new MediaPlayer(media);
//        mediaPlayer.setAutoPlay(true);
//        //mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
//        mediaPlayer.setCycleCount(1);
//        //mediaPlayer.setOnEndOfMedia(() -> mediaPlayer.seek(Duration.ZERO));
//       // mediaPlayer.stop();
//    }
	
//    @FXML
//    public void music_player_main_menu() {
//        // Load and play background music
//        String mediaPath = getClass().getResource("scene1_song.mp3").toExternalForm();
//        Media media = new Media(mediaPath);
//        mediaPlayer = new MediaPlayer(media);
//        mediaPlayer.setStopTime(Duration.seconds(03));
//        mediaPlayer.setAutoPlay(true);
//        //mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
//        mediaPlayer.setCycleCount(1);
//        //mediaPlayer.setOnEndOfMedia(() -> mediaPlayer.seek(Duration.ZERO));
//       // mediaPlayer.stop();
//    }
//    
	
//	public void gotoscene1(ActionEvent event) throws IOException {
//		music_player();
//		music_player_main_menu();
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
//		root = loader.load();
//
//		// Controller_Scene2 controller2 = loader.getController();
//
//		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.show();
//	}
	
	public void textchangeto_Coming_soon() {
		mylabel.setText("COMING SOON...");
	}

	
	public void textchangeto_carbrands() {
		mylabel.setText("CAR BRANDS");
	}

	
	
	

//	public void gotoscene3(ActionEvent event) throws IOException {
//
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene3.fxml"));
//		root = loader.load();
//		// Controller_Scene2 controller2 = loader.getController();
//		car1 = new Car();
//		car1.setBrandName("BMW");
//		//System.out.println(car1.getBrandName());
//		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setUserData(car1);
//		stage.setScene(scene);
//		stage.show();
//	}
	
	
	
	
	
	public void get_the_login_name(String login_name) {
		this.login_name = login_name;
	}
	
	public void gotoscene4(ActionEvent event) throws IOException {
		//music_player();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene4.fxml"));
		root = loader.load();
		// Controller_Scene2 controller2 = loader.getController();
		car1 = new Car();
		car1.setBrandName("Porsche");
		car1.set_login_name(login_name);
//		System.out.println(car1.getBrandName());
//		System.out.println(car1.toString());
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setUserData(car1);
		stage.setScene(scene);
		stage.show();
	}
	

}