package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class controller_Scene5_porshe911 {

	private Stage stage;
	private Scene scene;
	private Parent root;
	private String car_model_name;
	@FXML
	ImageView myimage1;
	@FXML
	ImageView myimage2;
	@FXML
	ImageView myimage3;
	@FXML
	ImageView myimage4;
	@FXML
	ImageView myimage5;
	
	@FXML
	ImageView myimage6;
	
	Image photo1 = new Image(getClass().getResourceAsStream("porshe_911_photo1.jpg"));
	Image photo2 = new Image(getClass().getResourceAsStream("porshe_911_photo2.jpg"));
	Image photo3 = new Image(getClass().getResourceAsStream("porshe_911_gt3_photo3.jpg"));
	Image photo4 = new Image(getClass().getResourceAsStream("porshe_911_gt3_photo4.jpg"));
	Image photo5 = new Image(getClass().getResourceAsStream("porshe_911_gt3_photo5.jpg"));
	Image photo6 = new Image(getClass().getResourceAsStream("porshe_911_gt3_photo6.jpg"));
	Image photo7 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_white_mainimage.jpg"));
	Image photo8 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_blue_mainimage.jpg"));
	Image photo9 = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_white_mainimage.jpg"));
	Image photo10 = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_blue_mainimage.jpg"));
	Image photo11 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_white_mainimage.jpg"));
	Image photo12 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_blue_mainimage.jpg"));

	public void photodisplay1() {
		myimage1.setImage(photo1);
	}

	public void photodisplay2() {
		myimage1.setImage(photo2);
	}
	public void photodisplay3() {
		myimage2.setImage(photo3);
	}

	public void photodisplay4() {
		myimage2.setImage(photo4);
	}
	public void photodisplay5() {
		myimage3.setImage(photo5);
	}

	public void photodisplay6() {
		myimage3.setImage(photo6);
	}
	
	public void photodisplay7() {
		myimage4.setImage(photo7);
	}

	public void photodisplay8() {
		myimage4.setImage(photo8);
	}
	
	public void photodisplay9() {
		myimage5.setImage(photo9);
	}

	public void photodisplay10() {
		myimage5.setImage(photo10);
	}
	
	public void photodisplay11() {
		myimage6.setImage(photo11);
	}

	public void photodisplay12() {
		myimage6.setImage(photo12);
	}
	
	
	public void gotoscene6_porshe911_gt3(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6_porshe911_gt3.fxml"));
		root = loader.load();

		// Controller_Scene2 controller2 = loader.getController();

		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		car1.setBrandName("Porsche");
		car1.setCarName("911");
		car1.setCarmodelname("GT3");
		stage.setUserData(car1);
		car_model_name=car1.getCarmodelname();
		Controller_Scene6_porsheo11_gt3 controller6=loader.getController();
		controller6.name_of_the_model_of_the_car(car_model_name);
//		System.out.println(car1.getBrandName());
		stage.setScene(scene);
		stage.show();
	}
	
	public void gotoscene6_porshe911_gt3_touring_package(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6_porshe911_gt3.fxml"));
		root = loader.load();

		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		car1.setBrandName("Porsche");
		car1.setCarName("911");
		car1.setCarmodelname("GT3 Touring Pakcage");
		stage.setUserData(car1);
		car_model_name=car1.getCarmodelname();
		Controller_Scene6_porsheo11_gt3 controller6=loader.getController();
		controller6.name_of_the_model_of_the_car(car_model_name);
//		System.out.println(car1.getBrandName());
		stage.setScene(scene);
		stage.show();
	}
	
	public void gotoscene6_porshe911_gt3_rs_(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6_porshe911_gt3.fxml"));
		root = loader.load();

		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		car1.setBrandName("Porsche");
		car1.setCarName("911");
		car1.setCarmodelname("GT3 RS");
		stage.setUserData(car1);
		car_model_name=car1.getCarmodelname();
		Controller_Scene6_porsheo11_gt3 controller6=loader.getController();
		controller6.name_of_the_model_of_the_car(car_model_name);
//		System.out.println(car1.getBrandName());
		stage.setScene(scene);
		stage.show();
	}
	
	public void gotoscene6_porshe911_targa_4(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6_porshe911_gt3.fxml"));
		root = loader.load();

		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		car1.setBrandName("Porsche");
		car1.setCarName("911");
		car1.setCarmodelname("TARGA 4");
		stage.setUserData(car1);
		car_model_name=car1.getCarmodelname();
		Controller_Scene6_porsheo11_gt3 controller6=loader.getController();
		controller6.name_of_the_model_of_the_car(car_model_name);
//		System.out.println(car1.getBrandName());
		stage.setScene(scene);
		stage.show();
	}

	public void gotoscene6_porshe911_targa_4gts(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6_porshe911_gt3.fxml"));
		root = loader.load();

		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		car1.setBrandName("Porsche");
		car1.setCarName("911");
		car1.setCarmodelname("TARGA 4 GTS");
		stage.setUserData(car1);
		car_model_name=car1.getCarmodelname();
		Controller_Scene6_porsheo11_gt3 controller6=loader.getController();
		controller6.name_of_the_model_of_the_car(car_model_name);
//		System.out.println(car1.getBrandName());
		stage.setScene(scene);
		stage.show();
	}
	
	
	public void gotoscene6_porshe911_targa_4s(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6_porshe911_gt3.fxml"));
		root = loader.load();

		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		car1.setBrandName("Porsche");
		car1.setCarName("911");
		car1.setCarmodelname("TARGA 4s");
		stage.setUserData(car1);
		car_model_name=car1.getCarmodelname();
		Controller_Scene6_porsheo11_gt3 controller6=loader.getController();
		controller6.name_of_the_model_of_the_car(car_model_name);
//		System.out.println(car1.getBrandName());
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	
	
	
	
	public void gotoscene4_porshe911(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene4.fxml"));
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
	
	
	
	
	
	

}
