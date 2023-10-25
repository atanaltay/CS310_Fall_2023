package main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import main.Book.Cover;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		Cover cover = new Book(). new Cover("Blue","Cover of the book");
		
		Book book1 = new Book("Grapes of Wrath", 1910, cover);
		
		
		Page introPage = new IntroPage("abstract text of intro page..");
		
		book1.addPage(introPage);
		
		
		book1.addPage(new Page() {
			//Anonymous inner class

			@Override
			public String getContent() {
				return "Page 1 - added anonymously";
			}
			
		});
		
		
		book1.addPage(new Page() {
			
			@Override
			public String getContent() {
				return "Page 2";
			}
		});
		
		Page page3 = new Page() {
			
			@Override
			public String getContent() {
				return "Page 3";
			}
		};
		
		book1.addPage(page3);
		
		
		
		System.out.println(book1);
		
		System.out.println("Pages:");
		
		for (Page page : book1.getPages()) {
			System.out.println(page.getContent());
		}
		
		//Lambda expressions
		book1.addPage(() -> {
			return "Page 4";
		});
		
		book1.addPage(() -> "Page 5");
		
		
		System.out.println("-----------");
		
		book1.getPages().forEach(new Consumer<Page>() {
			
			@Override
			public void accept(Page t) {
				System.out.println(t.getContent());
				
			}
			
		});
		
		
		System.out.println("----------------");
		
		book1.getPages().forEach(p -> p.getContent());
		
		
		System.out.println("-------------");
		
		List<String> names = new ArrayList<>();
		
		names.add("ali");
		names.add("ahmet");
		names.add("mehmet");
		names.add("hasan");
		
		
		names.forEach(s-> {
			System.out.println(s);
		});
		
		
	}

}
