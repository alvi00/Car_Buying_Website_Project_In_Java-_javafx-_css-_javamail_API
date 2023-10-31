module Car_Buying_Website {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.media;
	requires javafx.base;
	//this i add
	requires java.mail;
	opens application to javafx.graphics, javafx.fxml;
}
