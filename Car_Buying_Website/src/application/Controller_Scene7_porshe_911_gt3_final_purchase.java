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

public class Controller_Scene7_porshe_911_gt3_final_purchase {

	private Stage stage;
	private Scene scene;
	private Parent root;
	private String lastselectedcolor;
	private String car_model_name;

	@FXML
	ImageView myimage;

	Image mainimage1_yellow = new Image(getClass().getResourceAsStream("porshe_911_gt3_final_purchase_photo1.png"));
	Image mainimage1_white = new Image(getClass().getResourceAsStream("porshe_911_gt3_final_purchase_photo2.png"));
	Image mainimage1_red = new Image(getClass().getResourceAsStream("porshe_911_gt3_final_purchase_photo3.png"));
	Image mainimage1_black = new Image(getClass().getResourceAsStream("porshe_911_gt3_final_purchase_photo4.png"));

	Image mainimage1_yellow_911_gt3_touring_package = new Image(
			getClass().getResourceAsStream("porshe_911_gt3_touring_package_final_purchase_photo1.png"));
	Image mainimage1_white_911_gt3_touring_package = new Image(
			getClass().getResourceAsStream("porshe_911_gt3_touring_package_final_purchase_photo2.png"));
	Image mainimage1_red_911_gt3_touring_package = new Image(
			getClass().getResourceAsStream("porshe_911_gt3_touring_package_final_purchase_photo3.png"));
	Image mainimage1_black_911_gt3_touring_package = new Image(
			getClass().getResourceAsStream("porshe_911_gt3_touring_package_final_purchase_photo4.png"));

	Image mainimage1_yellow_911_gt3_rs = new Image(
			getClass().getResourceAsStream("porshe_911_gt3_rs_final_purchase_photo1.png"));
	Image mainimage1_white_911_gt3_rs = new Image(
			getClass().getResourceAsStream("porshe_911_gt3_rs_final_purchase_photo2.png"));
	Image mainimage1_red_911_gt3_rs = new Image(
			getClass().getResourceAsStream("porshe_911_gt3_rs_final_purchase_photo3.png"));
	Image mainimage1_black_911_gt3_rs = new Image(
			getClass().getResourceAsStream("porshe_911_gt3_rs_final_purchase_photo4.png"));
	
	//targa
	Image mainimage1_yellow_911_gt3_tagra_4= new Image(
			getClass().getResourceAsStream("t4.png"));
	Image mainimage1_white_911_gt3_tagra_4 = new Image(
			getClass().getResourceAsStream("t1.png"));
	Image mainimage1_red_911_gt3_tagra_4 = new Image(
			getClass().getResourceAsStream("t3.png"));
	Image mainimage1_black_911_gt3_tagra_4= new Image(
			getClass().getResourceAsStream("t2.png"));
	
	//targa 4s
	Image mainimage1_yellow_911_gt3_tagra_4s= new Image(
			getClass().getResourceAsStream("ts1.png"));
	Image mainimage1_white_911_gt3_tagra_4s = new Image(
			getClass().getResourceAsStream("ts2.png"));
	Image mainimage1_red_911_gt3_tagra_4s = new Image(
			getClass().getResourceAsStream("ts3.png"));
	Image mainimage1_black_911_gt3_tagra_4s= new Image(
			getClass().getResourceAsStream("ts4.png"));
	
	
	//targa 4 gts
	
	Image mainimage1_yellow_911_gt3_tagra_4gts= new Image(
			getClass().getResourceAsStream("gts1.png"));
	Image mainimage1_white_911_gt3_tagra_4gts = new Image(
			getClass().getResourceAsStream("gts2.png"));
	Image mainimage1_red_911_gt3_tagra_4gts = new Image(
			getClass().getResourceAsStream("gts3.png"));
	Image mainimage1_black_911_gt3_tagra_4gts= new Image(
			getClass().getResourceAsStream("gts4.png"));
	
	public void lastcolorofthecar(String lastselectedcolor) {
		this.lastselectedcolor = lastselectedcolor;
	}

	public void name_of_the_model_of_the_car(String car_model_name) {
		this.car_model_name = car_model_name;
	}

	public void seeyourcar() {
		
		//yellow
		if (lastselectedcolor.equals("Yellow") && car_model_name.equals("GT3")) {
			myimage.setImage(mainimage1_yellow);
		}

		if (lastselectedcolor.equals("Yellow") && car_model_name.equals("GT3 Touring Pakcage")) {
			myimage.setImage(mainimage1_yellow_911_gt3_touring_package);
		}
		if (lastselectedcolor.equals("Yellow") && car_model_name.equals("GT3 RS")) {
			myimage.setImage(mainimage1_yellow_911_gt3_rs);
		}if (lastselectedcolor.equals("Yellow") && car_model_name.equals("TARGA 4")) {
			myimage.setImage(mainimage1_yellow_911_gt3_tagra_4);
		}if (lastselectedcolor.equals("Yellow") && car_model_name.equals("TARGA 4s")) {
			myimage.setImage(mainimage1_yellow_911_gt3_tagra_4s);
		}if (lastselectedcolor.equals("Yellow") && car_model_name.equals("TARGA 4 GTS")) {
			myimage.setImage(mainimage1_yellow_911_gt3_tagra_4gts);
		}
		
		//white
		if (lastselectedcolor.equals("White") && car_model_name.equals("GT3")) {
			myimage.setImage(mainimage1_white);
		}

		if (lastselectedcolor.equals("White") && car_model_name.equals("GT3 Touring Pakcage")) {
			myimage.setImage(mainimage1_white_911_gt3_touring_package);
		}
		if (lastselectedcolor.equals("White") && car_model_name.equals("GT3 RS")) {
			myimage.setImage(mainimage1_white_911_gt3_rs);
		}
		if (lastselectedcolor.equals("White") && car_model_name.equals("TARGA 4")) {
			myimage.setImage(mainimage1_white_911_gt3_tagra_4);
		}
		if (lastselectedcolor.equals("White") && car_model_name.equals("TARGA 4s")) {
			myimage.setImage(mainimage1_white_911_gt3_tagra_4s);
		}
		if (lastselectedcolor.equals("White") && car_model_name.equals("TARGA 4 GTS")) {
			myimage.setImage(mainimage1_white_911_gt3_tagra_4gts);
		}

		
		//red
		if (lastselectedcolor.equals("red") && car_model_name.equals("GT3")) {
			myimage.setImage(mainimage1_red);
		}

		if (lastselectedcolor.equals("red") && car_model_name.equals("GT3 Touring Pakcage")) {
			myimage.setImage(mainimage1_red_911_gt3_touring_package);
		}
		if (lastselectedcolor.equals("red") && car_model_name.equals("GT3 RS")) {
			myimage.setImage(mainimage1_red_911_gt3_rs);
		}
		if (lastselectedcolor.equals("red") && car_model_name.equals("TARGA 4")) {
			myimage.setImage(mainimage1_red_911_gt3_tagra_4);
		}
		if (lastselectedcolor.equals("red") && car_model_name.equals("TARGA 4s")) {
			myimage.setImage(mainimage1_red_911_gt3_tagra_4s);
		}if (lastselectedcolor.equals("red") && car_model_name.equals("TARGA 4 GTS")) {
			myimage.setImage(mainimage1_red_911_gt3_tagra_4gts);
		}
		
		
		//black
		if (lastselectedcolor.equals("black") && car_model_name.equals("GT3")) {
			myimage.setImage(mainimage1_black);
		}

		if (lastselectedcolor.equals("black") && car_model_name.equals("GT3 Touring Pakcage")) {
			myimage.setImage(mainimage1_black_911_gt3_touring_package);
		}
		if (lastselectedcolor.equals("black") && car_model_name.equals("GT3 RS")) {
			myimage.setImage(mainimage1_black_911_gt3_rs);
		}
		if (lastselectedcolor.equals("black") && car_model_name.equals("TARGA 4")) {
			myimage.setImage(mainimage1_black_911_gt3_tagra_4);
		}
		if (lastselectedcolor.equals("black") && car_model_name.equals("TARGA 4s")) {
			myimage.setImage(mainimage1_black_911_gt3_tagra_4s);
		}
		if (lastselectedcolor.equals("black") && car_model_name.equals("TARGA 4 GTS")) {
			myimage.setImage(mainimage1_black_911_gt3_tagra_4gts);
		}
		
		

	}

	public void gotoscene8_car_buying_information(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene8_car_buying_information.fxml"));
		root = loader.load();

		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		car1.setBrandName("Porsche");
		car1.setCarName("911");
		// System.out.print(car1.get_login_name());

		car1.setCarmodelname(car_model_name);
		car1.setCarColor(lastselectedcolor);

		if (lastselectedcolor.equals("Yellow") && car_model_name.equals("GT3")) {
			car1.setCarPrice("$186,850");
		}
		if (lastselectedcolor.equals("red") && car_model_name.equals("GT3")) {
			car1.setCarPrice("$186,850");
		}
		if (lastselectedcolor.equals("White") && car_model_name.equals("GT3")) {
			car1.setCarPrice("$185,850");
		}
		if (lastselectedcolor.equals("black") && car_model_name.equals("GT3")) {
			car1.setCarPrice("$185,850");
		}
		
		
		

		if (lastselectedcolor.equals("Yellow") && car_model_name.equals("GT3 Touring Pakcage")) {
			car1.setCarPrice("$187,250");
		}
		if (lastselectedcolor.equals("red") && car_model_name.equals("GT3 Touring Pakcage")) {
			car1.setCarPrice("$187,250");
		}
		if (lastselectedcolor.equals("White") && car_model_name.equals("GT3 Touring Pakcage")) {
			car1.setCarPrice("$186,250");
		}
		if (lastselectedcolor.equals("black") && car_model_name.equals("GT3 Touring Pakcage")) {
			car1.setCarPrice("$186,250");
		}

		if (lastselectedcolor.equals("Yellow") && car_model_name.equals("GT3 RS")) {
			car1.setCarPrice("$245,650");
		}
		if (lastselectedcolor.equals("red") && car_model_name.equals("GT3 RS")) {
			car1.setCarPrice("$245,650");
		}
		if (lastselectedcolor.equals("White") && car_model_name.equals("GT3 RS")) {
			car1.setCarPrice("$244,650");
		}
		if (lastselectedcolor.equals("black") && car_model_name.equals("GT3 RS")) {
			car1.setCarPrice("$244,650");
		}

		
		//targa 4
		
		if (lastselectedcolor.equals("Yellow") && car_model_name.equals("TARGA 4")) {
			car1.setCarPrice("$137,150");
		}
		if (lastselectedcolor.equals("red") && car_model_name.equals("TARGA 4")) {
			car1.setCarPrice("$137,150");
		}
		if (lastselectedcolor.equals("White") && car_model_name.equals("TARGA 4")) {
			car1.setCarPrice("$136,150");
		}
		if (lastselectedcolor.equals("black") && car_model_name.equals("TARGA 4")) {
			car1.setCarPrice("$136,150");
		}
		
		//targa 4s
		
		if (lastselectedcolor.equals("Yellow") && car_model_name.equals("TARGA 4s")) {
			car1.setCarPrice("$154,050");
		}
		if (lastselectedcolor.equals("red") && car_model_name.equals("TARGA 4s")) {
			car1.setCarPrice("$154,050");
		}
		if (lastselectedcolor.equals("White") && car_model_name.equals("TARGA 4s")) {
			car1.setCarPrice("$153,050");
		}
		if (lastselectedcolor.equals("black") && car_model_name.equals("TARGA 4s")) {
			car1.setCarPrice("$153,050");
		}
		
		//targa 4 ts
		
		if (lastselectedcolor.equals("Yellow") && car_model_name.equals("TARGA 4 GTS")) {
			car1.setCarPrice("$173,650");
		}
		if (lastselectedcolor.equals("red") && car_model_name.equals("TARGA 4 GTS")) {
			car1.setCarPrice("$173,650");
		}
		if (lastselectedcolor.equals("White") && car_model_name.equals("TARGA 4 GTS")) {
			car1.setCarPrice("$172,650");
		}
		if (lastselectedcolor.equals("black") && car_model_name.equals("TARGA 4 GTS")) {
			car1.setCarPrice("$172,650");
		}
		
		
		stage.setUserData(car1);
//		System.out.println(car1.getBrandName());

		stage.setScene(scene);
		stage.show();

	}

//	public void gotoscene6_porshe911_gt3(ActionEvent event) throws IOException {
//
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6_porshe911_gt3.fxml"));
//		root = loader.load();
//
//		// Controller_Scene2 controller2 = loader.getController();
//		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		Car car1 = (Car) stage.getUserData();
//		car1.setBrandName("Porsche");
//		car1.setCarName("911");
//		car1.setCarPrice("");
//		stage.setUserData(car1);
//		System.out.println(car1.getBrandName());
//		stage.setScene(scene);
//		stage.show();
//	}

}
