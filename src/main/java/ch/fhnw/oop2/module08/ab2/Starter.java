package ch.fhnw.oop2.module08.ab2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application{
	
	public void start(Stage primaryStage) {
		
		PresentationModel pm = new PresentationModel();
		Parent rootPanel = new ApplicationUI(pm);
		
		Scene scene = new Scene(rootPanel);
		
		primaryStage.titleProperty().bind(pm.getAppName());
		primaryStage.setScene(scene);
		
		primaryStage.setWidth(400);
		primaryStage.setHeight(300);
		primaryStage.centerOnScreen();
		
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
