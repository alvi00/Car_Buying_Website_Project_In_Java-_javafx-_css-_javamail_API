package application;

import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
			Scene scene = new Scene(root, 1500, 750);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(true);
			primaryStage.setTitle("Car Buying Website"); 
			Image icon = new Image(getClass().getResourceAsStream("porshe_logo.png"));

	        // Set the icon for the stage
	        primaryStage.getIcons().add(icon);

//	        // Set the music controller in the Scene1 controller
//	        Controller_Scene1 scene1Controller = loader.getController();
//	        scene1Controller.setPrimaryStage(primaryStage);
			primaryStage.show();
			primaryStage.setOnCloseRequest(event -> {
				event.consume();
				logout(primaryStage);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void logout(Stage primaryStage) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Exit");
		alert.setHeaderText("Do you wanna exit the website");
		alert.setContentText("Press Ok to exit  : ");

		if (alert.showAndWait().get() == ButtonType.OK) {
			primaryStage.close();
		}
	}

	public static void main(String[] args) {
		launch(args);

//		// Create a Sedan object
//	    Sedan sedanCar = new Sedan();
//	    
//	    // Set the attributes of the Sedan
//	    sedanCar.setBrandName("Toyota");
//	    sedanCar.setCarName("Camry");
//	    sedanCar.setCarColor("Blue");
//	    sedanCar.setCarPrice(25000.0);
//	    sedanCar.customize("red");
//	    // Create an SUV object
//	    SUV suvCar = new SUV();
//	    
//	    // Set the attributes of the SUV
//	    suvCar.setBrandName("Ford");
//	    suvCar.setCarName("Explorer");
//	    suvCar.setCarColor("Red");
//	    suvCar.setCarPrice(30000.0);
//	    suvCar.customize("black");
		// Access and display the car details
//	    System.out.println("Sedan Car Details:");
//	    System.out.println(sedanCar.toString());
//	    
//	    System.out.println("\nSUV Car Details:");
//	    System.out.println(suvCar.toString());
		// Launch the JavaFX application
	}
}
