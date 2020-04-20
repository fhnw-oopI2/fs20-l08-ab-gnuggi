package ab2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class PresentationModel {
	private StringProperty appName = new SimpleStringProperty("Hello World Application");
	private StringProperty buttonName = new SimpleStringProperty(ToggleState.OFF.state);
	
	private ToggleState ts = ToggleState.OFF;
	
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
	
	public void toggle() {
		if (ts == ToggleState.OFF) {
			buttonName.setValue(ToggleState.ON.state);
			ts = ToggleState.ON;
		}
		else if(ts == ToggleState.ON) {
			buttonName.setValue(ToggleState.OFF.state);
			ts = ToggleState.OFF;
		}
	}
	
	
	
	private enum ToggleState {
		ON("ON"), OFF("OFF");
		private String state;
		
		private ToggleState(String state) {
			this.state = state;
		}
	}
}
