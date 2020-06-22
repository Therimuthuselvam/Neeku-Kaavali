import java.util.*;
 class Book{
  float price;
  long isbn;
  String author="";
  String title="";

  Book(long isbn,String title,String author, float price)
  {
    this.price=price;
    this.isbn=isbn;
    this.title=title;
    this.author=author;
  }

  public void displaydetails() {
    System.out.println("Title="+title);
    System.out.println("Author="+author);
    System.out.println("price="+price);
    System.out.println("Isbn="+isbn);
  }

  public void discountedprice(int discountpercent)
  {
    float finalprice=price-(price*discountpercent/100);
    System.out.println("Finalprice=" +finalprice);
  }
}  

public class Assignment1{
  public static void main(String[] args)
  {
    Book b=new Book(12345,"Core Java","James Gosling",700);
    b.displaydetails();
    b.discountedprice(10);
  }
}