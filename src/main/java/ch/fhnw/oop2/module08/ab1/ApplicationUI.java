package ch.fhnw.oop2.module08.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {
	
	private Button hwButton;
	
	public ApplicationUI(PresentationModel pm) {
		initializeControls(pm);
		layoutControls();
	}
	
	private void initializeControls(PresentationModel pm) {
		hwButton = new Button();
		hwButton.textProperty().bind(pm.getButtonName());
	}
	
	private void layoutControls() {
		this.getChildren().add(hwButton);
	}
}
