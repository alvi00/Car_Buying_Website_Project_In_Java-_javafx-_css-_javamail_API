package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Controller_for_pop_up_window {
	
	@FXML
	TextArea carInfoTextArea;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	private String car_model_name;
	
	public void name_of_the_model_of_the_car(String car_model_name) {
		this.car_model_name = car_model_name;
	}

	public void every_info_Show(ActionEvent event) throws IOException {
	    FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6_porshe911_gt3.fxml"));
	    root = loader.load();
	    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    Car car1 = (Car) stage.getUserData();
	    stage.setUserData(car1);

	    try {
	        FileReader fileReader;
	        if (car_model_name.equals("GT3")) {
	            fileReader = new FileReader("C:\\Users\\88014\\Desktop\\java\\Car_Buying_Website\\proshe_911_gt3.txt");
	        } else if (car_model_name.equals("GT3 Touring Pakcage")) {
	            fileReader = new FileReader("C:\\Users\\88014\\Desktop\\java\\Car_Buying_Website\\porshe_911_gt3_touring_package.txt");
	        }  else if (car_model_name.equals("GT3 RS")) {
	        	fileReader = new FileReader("C:\\Users\\88014\\Desktop\\java\\Car_Buying_Website\\porshe_911_gt3_rs.txt");
	        }else if (car_model_name.equals("TARGA 4")) {
	        	fileReader = new FileReader("C:\\Users\\88014\\Desktop\\java\\Car_Buying_Website\\porshe_911_targa4.txt");
	        }else if (car_model_name.equals("TARGA 4s")) {
	        	fileReader = new FileReader("C:\\Users\\88014\\Desktop\\java\\Car_Buying_Website\\porshe_911_targa4s.txt");
	        }else if (car_model_name.equals("TARGA 4 GTS")) {
	        	fileReader = new FileReader("C:\\Users\\88014\\Desktop\\java\\Car_Buying_Website\\porshe_911_targa4gts.txt");
	        }
	        else {
	            // other things
	            return;
	        }

	        BufferedReader bufferedReader = new BufferedReader(fileReader);

	        String line;
	        StringBuilder carInfo = new StringBuilder();

	        while ((line = bufferedReader.readLine()) != null) {
	            carInfo.append(line).append("\n");
	        }

	        bufferedReader.close();
	        fileReader.close();
	        carInfoTextArea.setText(carInfo.toString());

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
