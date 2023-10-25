package main;

public class IntroPage implements Page{

	
	private String abstractText;
	
	public IntroPage() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public IntroPage(String abstractText) {
		super();
		this.abstractText = abstractText;
	}



	@Override
	public String getContent() {
		return "Intro Page - " + " abstract: " + abstractText;
	}



	@Override
	public String toString() {
		return "IntroPage [abstractText=" + abstractText + "]";
	}
	
	

}
