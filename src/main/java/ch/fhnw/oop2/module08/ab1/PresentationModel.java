package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class PresentationModel {
	private StringProperty appName = new SimpleStringProperty("Hello World Application");
	private StringProperty buttonName = new SimpleStringProperty("Hello World");
	
	public StringProperty getAppName() {
		return appName;
	}
	public void setAppName(StringProperty appName) {
		this.appName = appName;
	}
	
	public StringProperty getButtonName() {
		return buttonName;
	}
	public void setButtonName(StringProperty buttonName) {
		this.buttonName = buttonName;
	}
}
