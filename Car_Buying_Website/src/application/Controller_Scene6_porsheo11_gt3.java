package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controller_Scene6_porsheo11_gt3 {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	Button car_Spec_button;
	
	@FXML
	Label car_price_label;
	
	@FXML
	ImageView mainmyimage1;

	@FXML
	ImageView submyimage1;
	@FXML
	ImageView submyimage2;
	@FXML
	ImageView submyimage3;
	@FXML
	ImageView submyimage4;

	@FXML
	Button yellowbutton;
	@FXML
	Button whitebutton;
	@FXML
	Button redbutton;
	@FXML
	Button blackbutton;
	
	@FXML
	Label car_name_label;

	private boolean isSceneOpen = false;
	private Stage customStage;

	private String lastClickedButton;
	private String car_model_name;

	
	//1st car 911 gt3 
	
	Image mainimage1_yellow = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_var_main_photo.jpg"));
	Image subimage1_yellow = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_var_sub_photo1.jpg"));
	Image subimage2_yellow = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_var_sub_photo2.jpg"));
	Image subimage3_yellow = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_var_sub_photo3.jpg"));
	Image subimage4_yellow = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_var_sub_photo4.jpg"));

	Image mainimage1_white = new Image(getClass().getResourceAsStream("scene6_white_gt3_var_main_photo.jpg"));
	Image subimage1_white = new Image(getClass().getResourceAsStream("scene6_white_gt3_var_sub_photo1.jpg"));
	Image subimage2_white = new Image(getClass().getResourceAsStream("scene6_white_gt3_var_sub_photo2.jpg"));
	Image subimage3_white = new Image(getClass().getResourceAsStream("scene6_white_gt3_var_sub_photo3.jpg"));
	Image subimage4_white = new Image(getClass().getResourceAsStream("scene6_white_gt3_var_sub_photo4.jpg"));

	Image mainimage1_red = new Image(getClass().getResourceAsStream("scene6_red_gt3_var_main_photo.jpg"));
	Image subimage1_red = new Image(getClass().getResourceAsStream("scene6_red_gt3_var_sub_photo1.jpg"));
	Image subimage2_red = new Image(getClass().getResourceAsStream("scene6_red_gt3_var_sub_photo2.jpg"));
	Image subimage3_red = new Image(getClass().getResourceAsStream("scene6_red_gt3_var_sub_photo3.jpg"));
	Image subimage4_red = new Image(getClass().getResourceAsStream("scene6_red_gt3_var_sub_photo4.jpg"));

	Image mainimage1_black = new Image(getClass().getResourceAsStream("scene6_black_gt3_var_main_photo.jpg"));
	Image subimage1_black = new Image(getClass().getResourceAsStream("scene6_black_gt3_var_sub_photo1.jpg"));
	Image subimage2_black = new Image(getClass().getResourceAsStream("scene6_black_gt3_var_sub_photo2.jpg"));
	Image subimage3_black = new Image(getClass().getResourceAsStream("scene6_black_gt3_var_sub_photo3.jpg"));
	Image subimage4_black = new Image(getClass().getResourceAsStream("scene6_black_gt3_var_sub_photo4.jpg"));
	
	
	
	
	//911 gt3 touring package
	
	Image mainimage1_yellow_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_touring_package_var_main_photo.jpg"));
	Image subimage1_yellow_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_touring_packagevar_sub_photo1.jpg"));
	Image subimage2_yellow_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_touring_packagevar_sub_photo2.jpg"));
	Image subimage3_yellow_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_touring_packagevar_sub_photo3.jpg"));
	Image subimage4_yellow_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_touring_packagevar_sub_photo4.jpg"));

	Image mainimage1_white_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_white_gt3_touring_package_var_main_photo.jpg"));
	Image subimage1_white_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_white_gt3_touring_packagevar_sub_photo1.jpg"));
	Image subimage2_white_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_white_gt3_touring_packagevar_sub_photo2.jpg"));
	Image subimage3_white_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_white_gt3_touring_packagevar_sub_photo3.jpg"));
	Image subimage4_white_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_white_gt3_touring_packagevar_sub_photo4.jpg"));

	Image mainimage1_red_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_red_gt3_touring_package_var_main_photo.jpg"));
	Image subimage1_red_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_red_gt3_touring_packagevar_sub_photo1.jpg"));
	Image subimage2_red_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_red_gt3_touring_packagevar_sub_photo2.jpg"));
	Image subimage3_red_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_red_gt3_touring_packagevar_sub_photo3.jpg"));
	Image subimage4_red_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_red_gt3_touring_packagevar_sub_photo4.jpg"));

	Image mainimage1_black_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_black_gt3_touring_package_var_main_photo.jpg"));
	Image subimage1_black_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_black_gt3_touring_packagevar_sub_photo1.jpg"));
	Image subimage2_black_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_black_gt3_touring_packagevar_sub_photo2.jpg"));
	Image subimage3_black_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_black_gt3_touring_packagevar_sub_photo3.jpg"));
	Image subimage4_black_gt3_touring_package = new Image(getClass().getResourceAsStream("scene6_black_gt3_touring_packagevar_sub_photo4.jpg"));
	
	
	
	
	//911 gt3 rs
	
	
	Image mainimage1_yellow_gt3_rs = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_rs_var_main_photo.jpg"));
	Image subimage1_yellow_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_rs_var_sub_photo1.jpg"));
	Image subimage2_yellow_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_rs_var_sub_photo2.jpg"));
	Image subimage3_yellow_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_rs_var_sub_photo3.jpg"));
	Image subimage4_yellow_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_yellow_gt3_rs_var_sub_photo4.jpg"));

	Image mainimage1_white_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_white_gt3_rs_var_main_photo.jpg"));
	Image subimage1_white_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_white_gt3_rs_var_sub_photo1.jpg"));
	Image subimage2_white_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_white_gt3_rs_var_sub_photo2.jpg"));
	Image subimage3_white_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_white_gt3_rs_var_sub_photo3.jpg"));
	Image subimage4_white_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_white_gt3_rs_var_sub_photo4.jpg"));

	Image mainimage1_red_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_red_gt3_rs_var_main_photo.jpg"));
	Image subimage1_red_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_red_gt3_var_rs_sub_photo1.jpg"));
	Image subimage2_red_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_red_gt3_var_rs_sub_photo2.jpg"));
	Image subimage3_red_gt3_rs = new Image(getClass().getResourceAsStream("scene6_red_gt3_var_rs_sub_photo3.jpg"));
	Image subimage4_red_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_red_gt3_var_rs_sub_photo4.jpg"));

	Image mainimage1_black_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_black_gt3_rs_var_main_photo.jpg"));
	Image subimage1_black_gt3_rs  = new Image(getClass().getResourceAsStream("scene6_black_gt3_rs_var_sub_photo1.jpg"));
	Image subimage2_black_gt3_rs = new Image(getClass().getResourceAsStream("scene6_black_gt3_rs_var_sub_photo2.jpg"));
	Image subimage3_black_gt3_rs = new Image(getClass().getResourceAsStream("scene6_black_gt3_rs_var_sub_photo3.jpg"));
	Image subimage4_black_gt3_rs = new Image(getClass().getResourceAsStream("scene6_black_gt3_rs_var_sub_photo4.jpg"));

	
	//gt3 targa 4
	
	
	Image mainimage1_yellow_gt3_targa4 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_yellow_mainimage.jpg"));
	Image subimage1_yellow_gt3_targa4  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_yellow_subimage1.jpg"));
	Image subimage2_yellow_gt3_targa4  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_yellow_subimage2.jpg"));
	Image subimage3_yellow_gt3_targa4 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_yellow_subimage3.jpg"));
	Image subimage4_yellow_gt3_targa4  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_yellow_subimage4.jpg"));

	Image mainimage1_white_gt3_targa4  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_white_mainimage.jpg"));
	Image subimage1_white_gt3_targa4  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_white_subimage1.jpg"));
	Image subimage2_white_gt3_targa4 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_white_subimage2.jpg"));
	Image subimage3_white_gt3_targa4 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_white_subimage3.jpg"));
	Image subimage4_white_gt3_targa4  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_white_subimage4.jpg"));

	Image mainimage1_red_gt3_targa4  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_red_mainimage.jpg"));
	Image subimage1_red_gt3_targa4 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_red_subimage1.jpg"));
	Image subimage2_red_gt3_targa4 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_red_subimage2.jpg"));
	Image subimage3_red_gt3_targa4 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_red_subimage3.jpg"));
	Image subimage4_red_gt3_targa4  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_red_subimage4.jpg"));

	Image mainimage1_black_gt3_targa4 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_black_mainimage.jpg"));
	Image subimage1_black_gt3_targa4 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_black_subimage1.jpg"));
	Image subimage2_black_gt3_targa4 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_black_subimage2.jpg"));
	Image subimage3_black_gt3_targa4 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_black_subimage3.jpg"));
	Image subimage4_black_gt3_targa4 = new Image(getClass().getResourceAsStream("porshche_911_targa_4_black_subimage4.jpg"));
	
	
	//gt3 targa 4s
	
	Image mainimage1_yellow_gt3_targa4s = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_yellow_mainimage.jpg"));
	Image subimage1_yellow_gt3_targa4s  = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_yellow_subimage1.jpg"));
	Image subimage2_yellow_gt3_targa4s  = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_yellow_subimage2.jpg"));
	Image subimage3_yellow_gt3_targa4s= new Image(getClass().getResourceAsStream("porshche_911_targa_4s_yellow_subimage3.jpg"));
	Image subimage4_yellow_gt3_targa4s  = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_yellow_subimage4.jpg"));

	Image mainimage1_white_gt3_targa4s  = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_white_mainimage.jpg"));
	Image subimage1_white_gt3_targa4s  = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_white_subimage1.jpg"));
	Image subimage2_white_gt3_targa4s = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_white_subimage2.jpg"));
	Image subimage3_white_gt3_targa4s = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_white_subimage3.jpg"));
	Image subimage4_white_gt3_targa4s  = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_white_subimage4.jpg"));

	Image mainimage1_red_gt3_targa4s  = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_red_mainimage.jpg"));
	Image subimage1_red_gt3_targa4s = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_red_subimage1.jpg"));
	Image subimage2_red_gt3_targa4s = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_red_subimage2.jpg"));
	Image subimage3_red_gt3_targa4s = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_red_subimage3.jpg"));
	Image subimage4_red_gt3_targa4s  = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_red_subimage4.jpg"));

	Image mainimage1_black_gt3_targa4s = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_black_mainimage.jpg"));
	Image subimage1_black_gt3_targa4s = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_black_subimage1.jpg"));
	Image subimage2_black_gt3_targa4s = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_black_subimage2.jpg"));
	Image subimage3_black_gt3_targa4s = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_black_subimage3.jpg"));
	Image subimage4_black_gt3_targa4s = new Image(getClass().getResourceAsStream("porshche_911_targa_4s_black_subimage4.jpg"));
	
	//gt3 targa 4gts
	
	Image mainimage1_yellow_gt3_targa4gts = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_yellow_mainimage.jpg"));
	Image subimage1_yellow_gt3_targa4gts  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_yellow_subimage1.jpg"));
	Image subimage2_yellow_gt3_targa4gts  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_yellow_subimage2.jpg"));
	Image subimage3_yellow_gt3_targa4gts= new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_yellow_subimage3.jpg"));
	Image subimage4_yellow_gt3_targa4gts  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_yellow_subimage4.jpg"));

	Image mainimage1_white_gt3_targa4gts  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_white_mainimage.jpg"));
	Image subimage1_white_gt3_targa4gts  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_white_subimage1.jpg"));
	Image subimage2_white_gt3_targa4gts = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_white_subimage2.jpg"));
	Image subimage3_white_gt3_targa4gts = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_white_subimage3.jpg"));
	Image subimage4_white_gt3_targa4gts  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_white_subimage4.jpg"));

	Image mainimage1_red_gt3_targa4gts  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_red_mainimage.jpg"));
	Image subimage1_red_gt3_targa4gts = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_red_subimage1.jpg"));
	Image subimage2_red_gt3_targa4gts = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_red_subimage2.jpg"));
	Image subimage3_red_gt3_targa4gts = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_red_subimage3.jpg"));
	Image subimage4_red_gt3_targa4gts  = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_red_subimage4.jpg"));

	Image mainimage1_black_gt3_targa4gts = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_black_mainimage.jpg"));
	Image subimage1_black_gt3_targa4gts= new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_black_subimage1.jpg"));
	Image subimage2_black_gt3_targa4gts = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_black_subimage2.jpg"));
	Image subimage3_black_gt3_targa4gts = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_black_subimage3.jpg"));
	Image subimage4_black_gt3_targa4gts = new Image(getClass().getResourceAsStream("porshche_911_targa_4_gts_black_subimage4.jpg"));
	
	public void name_of_the_model_of_the_car(String car_model_name) {
		this.car_model_name=car_model_name;
		//System.out.print(car_model_name);
	}
	
	
	

	public void alvi(ActionEvent e) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6_porshe911_gt3.fxml"));
		root = loader.load();
		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		stage.setUserData(car1);
		
		if(car1.getCarmodelname().equals("GT3")) {
			car_name_label.setText("911 GT3");
		}else if(car1.getCarmodelname().equals("GT3 Touring Pakcage")) {
			car_name_label.setText(" 911 GT3 Touring Pakcage");
		}else if(car1.getCarmodelname().equals("GT3 RS")) {
			car_name_label.setText("911 GT3 RS");
		}else if(car1.getCarmodelname().equals("TARGA 4")) {
			car_name_label.setText("911 TARGA 4");
		}else if(car1.getCarmodelname().equals("TARGA 4s")) {
			car_name_label.setText("911 TARGA 4s");
		}else if(car1.getCarmodelname().equals("TARGA 4 GTS")) {
			car_name_label.setText("911 TARGA GTS");
		}
		
		
		yellowbutton.setOnAction(event -> {
			//System.out.print(car1.getCarmodelname());
			if(car1.getCarmodelname().equals("GT3")) {
			mainmyimage1.setImage(mainimage1_yellow);
			submyimage1.setImage(subimage1_yellow);
			submyimage2.setImage(subimage2_yellow);
			submyimage3.setImage(subimage3_yellow);
			submyimage4.setImage(subimage4_yellow);
			lastClickedButton = "Yellow";
			car_price_label.setText("$186,850");
			//System.out.println(car1.getCarmodelname());
		}		else if(car1.getCarmodelname().equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(mainimage1_yellow_gt3_touring_package);
			submyimage1.setImage(subimage1_yellow_gt3_touring_package);
			submyimage2.setImage(subimage2_yellow_gt3_touring_package);
			submyimage3.setImage(subimage3_yellow_gt3_touring_package);
			submyimage4.setImage(subimage4_yellow_gt3_touring_package);
			lastClickedButton = "Yellow";
			car_price_label.setText("$187,250");
		}  	else if(car1.getCarmodelname().equals("GT3 RS")) {
			mainmyimage1.setImage(mainimage1_yellow_gt3_rs);
			submyimage1.setImage(subimage1_yellow_gt3_rs);
			submyimage2.setImage(subimage2_yellow_gt3_rs);
			submyimage3.setImage(subimage3_yellow_gt3_rs);
			submyimage4.setImage(subimage4_yellow_gt3_rs);
			lastClickedButton = "Yellow";
			car_price_label.setText("$245,650");
		}   	else if(car1.getCarmodelname().equals("TARGA 4")) {
			mainmyimage1.setImage(mainimage1_yellow_gt3_targa4);
			submyimage1.setImage(subimage1_yellow_gt3_targa4);
			submyimage2.setImage(subimage2_yellow_gt3_targa4);
			submyimage3.setImage(subimage3_yellow_gt3_targa4);
			submyimage4.setImage(subimage4_yellow_gt3_targa4);
			lastClickedButton = "Yellow";
			car_price_label.setText("$137,150");
		}     	else if(car1.getCarmodelname().equals("TARGA 4s")) {
			mainmyimage1.setImage(mainimage1_yellow_gt3_targa4s);
			submyimage1.setImage(subimage1_yellow_gt3_targa4s);
			submyimage2.setImage(subimage2_yellow_gt3_targa4s);
			submyimage3.setImage(subimage3_yellow_gt3_targa4s);
			submyimage4.setImage(subimage4_yellow_gt3_targa4s);
			lastClickedButton = "Yellow";
			car_price_label.setText("$154,050");
		}
		    	else if(car1.getCarmodelname().equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(mainimage1_yellow_gt3_targa4gts);
			submyimage1.setImage(subimage1_yellow_gt3_targa4gts);
			submyimage2.setImage(subimage2_yellow_gt3_targa4gts);
			submyimage3.setImage(subimage3_yellow_gt3_targa4gts);
			submyimage4.setImage(subimage4_yellow_gt3_targa4gts);
			lastClickedButton = "Yellow";
			car_price_label.setText("$173,650");
		}
			
			
		});


		whitebutton.setOnAction(event -> {
			if(car1.getCarmodelname().equals("GT3")) {
			mainmyimage1.setImage(mainimage1_white);
			submyimage1.setImage(subimage1_white);
			submyimage2.setImage(subimage2_white);
			submyimage3.setImage(subimage3_white);
			submyimage4.setImage(subimage4_white);
			lastClickedButton = "White";
			car_price_label.setText("$185,850");
			}		else if(car1.getCarmodelname().equals("GT3 Touring Pakcage")) {
				mainmyimage1.setImage(mainimage1_white_gt3_touring_package);
				submyimage1.setImage(subimage1_white_gt3_touring_package);
				submyimage2.setImage(subimage2_white_gt3_touring_package);
				submyimage3.setImage(subimage3_white_gt3_touring_package);
				submyimage4.setImage(subimage4_white_gt3_touring_package);
				lastClickedButton = "White";
				car_price_label.setText("$186,250");
			}    	else if(car1.getCarmodelname().equals("GT3 RS")) {
				mainmyimage1.setImage(mainimage1_white_gt3_rs);
				submyimage1.setImage(subimage1_white_gt3_rs);
				submyimage2.setImage(subimage2_white_gt3_rs);
				submyimage3.setImage(subimage3_white_gt3_rs);
				submyimage4.setImage(subimage4_white_gt3_rs);
				lastClickedButton = "White";
				car_price_label.setText("$244,650");
			}     	else if(car1.getCarmodelname().equals("TARGA 4")) {
				mainmyimage1.setImage(mainimage1_white_gt3_targa4);
				submyimage1.setImage(subimage1_white_gt3_targa4);
				submyimage2.setImage(subimage2_white_gt3_targa4);
				submyimage3.setImage(subimage3_white_gt3_targa4);
				submyimage4.setImage(subimage4_white_gt3_targa4);
				lastClickedButton = "White";
				car_price_label.setText("$136,150");
			}      	else if(car1.getCarmodelname().equals("TARGA 4s")) {
				mainmyimage1.setImage(mainimage1_white_gt3_targa4s);
				submyimage1.setImage(subimage1_white_gt3_targa4s);
				submyimage2.setImage(subimage2_white_gt3_targa4s);
				submyimage3.setImage(subimage3_white_gt3_targa4s);
				submyimage4.setImage(subimage4_white_gt3_targa4s);
				lastClickedButton = "White";
				car_price_label.setText("$153,050");
			}    	else if(car1.getCarmodelname().equals("TARGA 4 GTS")) {
				mainmyimage1.setImage(mainimage1_white_gt3_targa4gts);
				submyimage1.setImage(subimage1_white_gt3_targa4gts);
				submyimage2.setImage(subimage2_white_gt3_targa4gts);
				submyimage3.setImage(subimage3_white_gt3_targa4gts);
				submyimage4.setImage(subimage4_white_gt3_targa4gts);
				lastClickedButton = "White";
				car_price_label.setText("$172,650");
			}
		});

		redbutton.setOnAction(event -> {
			if(car1.getCarmodelname().equals("GT3")) {
			mainmyimage1.setImage(mainimage1_red);
			submyimage1.setImage(subimage1_red);
			submyimage2.setImage(subimage2_red);
			submyimage3.setImage(subimage3_red);
			submyimage4.setImage(subimage4_red);
			lastClickedButton = "red";
			car_price_label.setText("$186,850");
			} 	else if(car1.getCarmodelname().equals("GT3 Touring Pakcage")) {
				mainmyimage1.setImage(mainimage1_red_gt3_touring_package);
				submyimage1.setImage(subimage1_red_gt3_touring_package);
				submyimage2.setImage(subimage2_red_gt3_touring_package);
				submyimage3.setImage(subimage3_red_gt3_touring_package);
				submyimage4.setImage(subimage4_red_gt3_touring_package);
				lastClickedButton = "red";
				car_price_label.setText("$187,250");
			}    	else if(car1.getCarmodelname().equals("GT3 RS")) {
				mainmyimage1.setImage(mainimage1_red_gt3_rs);
				submyimage1.setImage(subimage1_red_gt3_rs);
				submyimage2.setImage(subimage2_red_gt3_rs);
				submyimage3.setImage(subimage3_red_gt3_rs);
				submyimage4.setImage(subimage4_red_gt3_rs);
				lastClickedButton = "red";
				car_price_label.setText("$245,650");
			}       	else if(car1.getCarmodelname().equals("TARGA 4")) {
				mainmyimage1.setImage(mainimage1_red_gt3_targa4);
				submyimage1.setImage(subimage1_red_gt3_targa4);
				submyimage2.setImage(subimage2_red_gt3_targa4);
				submyimage3.setImage(subimage3_red_gt3_targa4);
				submyimage4.setImage(subimage4_red_gt3_targa4);
				lastClickedButton = "red";
				car_price_label.setText("$137,150");
			}     	else if(car1.getCarmodelname().equals("TARGA 4s")) {
				mainmyimage1.setImage(mainimage1_red_gt3_targa4s);
				submyimage1.setImage(subimage1_red_gt3_targa4s);
				submyimage2.setImage(subimage2_red_gt3_targa4s);
				submyimage3.setImage(subimage3_red_gt3_targa4s);
				submyimage4.setImage(subimage4_red_gt3_targa4s);
				lastClickedButton = "red";
				car_price_label.setText("$154,050");
			}    	else if(car1.getCarmodelname().equals("TARGA 4 GTS")) {
				mainmyimage1.setImage(mainimage1_red_gt3_targa4gts);
				submyimage1.setImage(subimage1_red_gt3_targa4gts);
				submyimage2.setImage(subimage2_red_gt3_targa4gts);
				submyimage3.setImage(subimage3_red_gt3_targa4gts);
				submyimage4.setImage(subimage4_red_gt3_targa4gts);
				lastClickedButton = "red";
				car_price_label.setText("$173,650");
			}
		});

		blackbutton.setOnAction(event -> {
			if(car1.getCarmodelname().equals("GT3")) {
			mainmyimage1.setImage(mainimage1_black);
			submyimage1.setImage(subimage1_black);
			submyimage2.setImage(subimage2_black);
			submyimage3.setImage(subimage3_black);
			submyimage4.setImage(subimage4_black);
			lastClickedButton = "black";
			car_price_label.setText("$185,850");
			}  	else if(car1.getCarmodelname().equals("GT3 Touring Pakcage")) {
				mainmyimage1.setImage(mainimage1_black_gt3_touring_package);
				submyimage1.setImage(subimage1_black_gt3_touring_package);
				submyimage2.setImage(subimage2_black_gt3_touring_package);
				submyimage3.setImage(subimage3_black_gt3_touring_package);
				submyimage4.setImage(subimage4_black_gt3_touring_package);
				lastClickedButton = "black";
				car_price_label.setText("$186,250");
			} 	else if(car1.getCarmodelname().equals("GT3 RS")) {
				mainmyimage1.setImage(mainimage1_black_gt3_rs);
				submyimage1.setImage(subimage1_black_gt3_rs);
				submyimage2.setImage(subimage2_black_gt3_rs);
				submyimage3.setImage(subimage3_black_gt3_rs);
				submyimage4.setImage(subimage4_black_gt3_rs);
				lastClickedButton = "black";
				car_price_label.setText("$244,650");
			}      	else if(car1.getCarmodelname().equals("TARGA 4")) {
				mainmyimage1.setImage(mainimage1_black_gt3_targa4);
				submyimage1.setImage(subimage1_black_gt3_targa4);
				submyimage2.setImage(subimage2_black_gt3_targa4);
				submyimage3.setImage(subimage3_black_gt3_targa4);
				submyimage4.setImage(subimage4_black_gt3_targa4);
				lastClickedButton = "black";
				car_price_label.setText("$136,150");
			}   	else if(car1.getCarmodelname().equals("TARGA 4s")) {
				mainmyimage1.setImage(mainimage1_black_gt3_targa4s);
				submyimage1.setImage(subimage1_black_gt3_targa4s);
				submyimage2.setImage(subimage2_black_gt3_targa4s);
				submyimage3.setImage(subimage3_black_gt3_targa4s);
				submyimage4.setImage(subimage4_black_gt3_targa4s);
				lastClickedButton = "black";
				car_price_label.setText("$153,050");
			}
			else if(car1.getCarmodelname().equals("TARGA 4 GTS")) {
				mainmyimage1.setImage(mainimage1_black_gt3_targa4gts);
				submyimage1.setImage(subimage1_black_gt3_targa4gts);
				submyimage2.setImage(subimage2_black_gt3_targa4gts);
				submyimage3.setImage(subimage3_black_gt3_targa4gts);
				submyimage4.setImage(subimage4_black_gt3_targa4gts);
				lastClickedButton = "black";
				car_price_label.setText("$172,650");
			}
		});

	}
	
	


	public void  mainphotochnage1()  {
		
		
		if (lastClickedButton.equals("Yellow")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage1_yellow);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage1_yellow_gt3_touring_package);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage1_yellow_gt3_rs);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage1_yellow_gt3_targa4);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage1_yellow_gt3_targa4s);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage1_yellow_gt3_targa4gts);
		}
		
		
		if (lastClickedButton.equals("White")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage1_white);
		} else if(lastClickedButton.equals("White")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage1_white_gt3_touring_package);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage1_white_gt3_rs);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage1_white_gt3_targa4);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage1_white_gt3_targa4s);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage1_white_gt3_targa4gts);
		}
		
		
		if (lastClickedButton.equals("red")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage1_red);
		} else if(lastClickedButton.equals("red")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage1_red_gt3_touring_package);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage1_red_gt3_rs);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage1_red_gt3_targa4);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage1_red_gt3_targa4s);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage1_red_gt3_targa4gts);
		}
		
		
		if (lastClickedButton.equals("black")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage1_black);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage1_black_gt3_touring_package);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage1_black_gt3_rs);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage1_black_gt3_targa4);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage1_black_gt3_targa4s);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage1_black_gt3_targa4gts);
		}
	}
	

	public void mainphotochnage2() {
		
		if (lastClickedButton.equals("Yellow")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage2_yellow);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage2_yellow_gt3_touring_package);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage2_yellow_gt3_rs);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage2_yellow_gt3_targa4);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage2_yellow_gt3_targa4s);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage2_yellow_gt3_targa4gts);
		}
		
		
		if (lastClickedButton.equals("White")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage2_white);
		} else if(lastClickedButton.equals("White")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage2_white_gt3_touring_package);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage2_white_gt3_rs);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage2_white_gt3_targa4);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage2_white_gt3_targa4s);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage2_white_gt3_targa4gts);
		}
		
		
		if (lastClickedButton.equals("red")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage2_red);
		} else if(lastClickedButton.equals("red")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage2_red_gt3_touring_package);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage2_red_gt3_rs);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage2_red_gt3_targa4);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage2_red_gt3_targa4s);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage2_red_gt3_targa4gts);
		}
		
		
		if (lastClickedButton.equals("black")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage2_black);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage2_black_gt3_touring_package);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage2_black_gt3_rs);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage2_black_gt3_targa4);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage2_black_gt3_targa4s);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage2_black_gt3_targa4gts);
		}
	}
	
	
	
	
	
	public void mainphotochnage3()  {
		
		if (lastClickedButton.equals("Yellow")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage3_yellow);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage3_yellow_gt3_touring_package);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage3_yellow_gt3_rs);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage3_yellow_gt3_targa4);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage3_yellow_gt3_targa4s);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage3_yellow_gt3_targa4gts);
		}
		
		
		if (lastClickedButton.equals("White")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage3_white);
		} else if(lastClickedButton.equals("White")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage3_white_gt3_touring_package);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage3_white_gt3_rs);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage3_white_gt3_targa4);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage3_white_gt3_targa4s);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage3_white_gt3_targa4gts);
		}
		
		
		if (lastClickedButton.equals("red")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage3_red);
		} else if(lastClickedButton.equals("red")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage3_red_gt3_touring_package);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage3_red_gt3_rs);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage3_red_gt3_targa4);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage3_red_gt3_targa4s);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage3_red_gt3_targa4gts);
		}
		
		
		if (lastClickedButton.equals("black")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage3_black);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage3_black_gt3_touring_package);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage3_black_gt3_rs);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage3_black_gt3_targa4);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage3_black_gt3_targa4s);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage3_black_gt3_targa4gts);
		}
	}
	
	
	
	public void mainphotochnage4()  {
		
		if (lastClickedButton.equals("Yellow")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage4_yellow);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage4_yellow_gt3_touring_package);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage4_yellow_gt3_rs);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage4_yellow_gt3_targa4);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage4_yellow_gt3_targa4s);
		}else if(lastClickedButton.equals("Yellow")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage4_yellow_gt3_targa4gts);
		}
		
		
		if (lastClickedButton.equals("White")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage4_white);
		} else if(lastClickedButton.equals("White")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage4_white_gt3_touring_package);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage4_white_gt3_rs);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage4_white_gt3_targa4);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage4_white_gt3_targa4s);
		}else if(lastClickedButton.equals("White")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage4_white_gt3_targa4gts);
		}
		
		
		if (lastClickedButton.equals("red")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage4_red);
		} else if(lastClickedButton.equals("red")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage4_red_gt3_touring_package);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage4_red_gt3_rs);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage4_red_gt3_targa4);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage4_red_gt3_targa4s);
		}else if(lastClickedButton.equals("red")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage4_red_gt3_targa4gts);
		}
		
		
		if (lastClickedButton.equals("black")&&car_model_name.equals("GT3")) {
			mainmyimage1.setImage(subimage4_black);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("GT3 Touring Pakcage")) {
			mainmyimage1.setImage(subimage4_black_gt3_touring_package);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("GT3 RS")) {
			mainmyimage1.setImage(subimage4_black_gt3_rs);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("TARGA 4")) {
			mainmyimage1.setImage(subimage4_black_gt3_targa4);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("TARGA 4s")) {
			mainmyimage1.setImage(subimage4_black_gt3_targa4s);
		}else if(lastClickedButton.equals("black")&&car_model_name.equals("TARGA 4 GTS")) {
			mainmyimage1.setImage(subimage4_black_gt3_targa4gts);
		}
	}
	
	
    public void car_spec_button_opener(ActionEvent event) {
        if (isSceneOpen) {
            closeScene();
        } else {
            openScene();
        }
    }

    private void openScene() {
        // Load the FXML file for the new scene and set its controller
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pop_up_window.fxml"));
            root = loader.load();
            
            Controller_for_pop_up_window newController = loader.getController();
            
            Controller_for_pop_up_window pop_up_window_controller=loader.getController();
            pop_up_window_controller.name_of_the_model_of_the_car(car_model_name);
    		
            //System.out.print(car_model_name);
            // Create a new stage and set the scene
            customStage = new Stage();
            customStage.setScene(new Scene(root));
            customStage.setX(600);
            customStage.setY(200);

            // Set the isOpen flag to true
            isSceneOpen = true;

            // Show the new stage
            customStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeScene() {
        if (customStage != null) {
            // Close the custom stage
            customStage.close();
            isSceneOpen = false;
        }
    }

	


	
	
	public void gotoscene7_porshe911(ActionEvent event) throws IOException {

		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene7_porshe911_gt3_final_purchase.fxml"));
		root = loader.load();
		Controller_Scene7_porshe_911_gt3_final_purchase controller7=loader.getController();
		controller7.lastcolorofthecar(lastClickedButton);
		controller7.name_of_the_model_of_the_car(car_model_name);
		// Controller_Scene2 controller2 = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		Car car1 = (Car) stage.getUserData();
		car1.setBrandName("Porsche");
		car1.setCarName("911");
		car1.setCarColor(lastClickedButton);
		car1.setCarmodelname(car_model_name);
		stage.setUserData(car1);
		//System.out.println(car1.toString());
		
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	
	
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
	
	

	

}
