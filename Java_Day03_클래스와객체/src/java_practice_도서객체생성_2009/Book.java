package java_practice_도서객체생성_2009;

public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	
	Book(){

	}

	Book(String isbn, String title, String author, String publisher, int price, String desc){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
	
	public String toString(){
		return isbn + " \t| " + title + " \t| " + author + " \t| " + publisher + " \t| " + price + " \t| " + desc;
	}
}
