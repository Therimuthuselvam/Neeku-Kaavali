import java.util.*;
 class Document
 {
   String text="";
   
   void setString(String text)
   {
     this.text=text;
   }
   
   String toString1()
   {
     return text;
   }
 }
 
 class Email extends Document
 {
   String sender = "", recipient = "", title = "";
   
   String getSender()
   {
     return sender;
   }

   String getRecipient()
   {
     return recipient;
   }

   String getTitle()
   {
     return title;
   }

   String toString1()
   {
     text= sender+recipient+title;
     return text;
   }

   void setSender(String sender)
   {
     this.sender = sender;
   }

   void setRecipient(String recipient)
   {
     this.recipient = recipient;
   }

   void setTitle(String title)
   {
     this.title = title;
   }


 }

public class Assignment2{
  public static void main(String[] args)
  {
	Document d= new Document();
	d.setString("Sample text");
	System.out.println(d.toString1());

	Email mail=new Email();
	mail.setSender("Ramya");
	mail.setRecipient("Deepika");
	mail.setTitle("Doing Java Hands-on");

	System.out.println("Sender : " +mail.getSender());
	System.out.println("Recipient : "+mail.getRecipient());
	System.out.println("Title : " +mail.getTitle());
	System.out.println(" Body of Email : " +mail.toString1());

  }
}