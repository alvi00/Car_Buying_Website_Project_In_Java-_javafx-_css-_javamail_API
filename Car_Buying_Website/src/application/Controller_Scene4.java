package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller_Scene4 {


	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	Label labelcgange2;
	@FXML
	Label labelcgange3;
	
	public void gotoscene5_porshe911(ActionEvent event) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene5_porshe_911.fxml"));
		root = loader.load();
		
		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		car1.setBrandName("Porsche");
		car1.setCarName("911");
		stage.setUserData(car1);
//		System.out.println(car1.getBrandName());
		stage.setScene(scene);
		stage.show();
	}
	
	public void label_Change_2() {
		labelcgange2.setText("COMING SOON");
	}
	
	public void label_Change_3() {
		labelcgange3.setText("COMING SOON");
	}
	
	
	
	
	
	public void gotoscene2(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
		root = loader.load();

		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		car1.setBrandName("Not known yet");
		stage.setUserData(car1);
//		System.out.println(car1.getBrandName());
		System.out.println(car1.get_login_name());
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	
}
