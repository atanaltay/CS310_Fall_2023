package main;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private String title;
	private int year;
	private Cover cover;
	private List<Page> pages = new ArrayList<>();
	
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	


	public Book(String title, int year) {
		super();
		this.title = title;
		this.year = year;
	}




	public Book(String title, int year, Cover cover) {
		super();
		this.title = title;
		this.year = year;
		this.cover = cover;
	}

	public void addPage(Page page) {
		
		this.pages.add(page);
		
		
	}
	
	public List<Page> getPages() {
		return pages;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	public void setCover(Cover cover) {
		this.cover = cover;
	}
	
	public Cover getCover() {
		return cover;
	}
	
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", year=" + year + ", cover=" + cover + "]";
	}


	//Non-static member class
	class Cover{
		
		private String color;
		private String text;
		
		
		public Cover() {
			
			
			
		}
		
		


		public Cover(String color, String text) {
			super();
			this.color = color;
			this.text = text;
		}




		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public String getText() {
			return text;
		}


		public void setText(String text) {
			this.text = text;
		}


		@Override
		public String toString() {
			return "Cover [color=" + color + ", text=" + text + "]";
		}
		
		
		
		
	}
	
	
	
	
	
	
}
