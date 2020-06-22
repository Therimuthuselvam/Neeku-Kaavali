import java.util.*;
 class Book
 {
 	float price;
	long isbn;
	String title="";

 }

class Magazine extends Book
{
	String type="";
	Magazine(String title, String type, float price, long isbn)
	{
		this.title = title;
		this.type = type;
		this.price = price;
		this.isbn = isbn;
	}

	void displayMagazineDetails()
	{
		System.out.println("Magazine Title : " +title);
		System.out.println("Magazine Type : " +type);
		System.out.println("Magazine Price : " +price);
		System.out.println("Magazine Isbn : " +isbn);
	}
}

class Novel extends Book
{
	String author="";
	Novel(String title, String author, float price, long isbn)
	{
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}


	void displayNovelDetails()
	{
		System.out.println(" Novel Title : " +title);
		System.out.println(" Novel Author : " +author);
		System.out.println(" Novel Price : " +price);
		System.out.println(" Novel Isbn : " +isbn);
	}
}


public class Assignment3{
public static void main(String[] args)
{

Magazine magazine =new Magazine("Times", "Weekly", 55.0f, 3270);
Novel novel =new Novel("Secret", "Rhonda Byrne", 1250.0f, 9745);

magazine.displayMagazineDetails();
novel.displayNovelDetails();

}
}