package ab2;

import javafx.collections.FXCollections;
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
		hwButton.setOnAction(event -> pm.toggle());
	}
	
	private void layoutControls() {
		this.getChildren().add(hwButton);
	}
	
}
