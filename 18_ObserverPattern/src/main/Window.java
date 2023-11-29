package main;

import java.time.LocalDateTime;

public class Window {

	Button btn1;
	
	
	public Window() {
		btn1 = new Button();
		btn1.addListener(time->{
			System.out.println("Button clicked at " + time);
		});
	}
	
	public void testButtonClick() {
		btn1.clickButton();
	}
	
	
}
