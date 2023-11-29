package main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//Subject
public class Button {
	
	private List<ButtonClickListener> listeners =
			new ArrayList<>();
	
	
	public void addListener(ButtonClickListener listener) {
		this.listeners.add(listener);
	}
	
	
	public void clickButton() {
		
		LocalDateTime eventTime = LocalDateTime.now();
		
		for (ButtonClickListener buttonClickListener : listeners) {
			buttonClickListener.buttonClicked(eventTime);
		}
		
		
	}
	

}
