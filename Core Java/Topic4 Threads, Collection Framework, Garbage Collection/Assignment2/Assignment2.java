import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 
public class Assignment2 extends Thread{  
public void run()
{
for(int i=0;i<=10;i++)
{
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
   LocalDateTime now = LocalDateTime.now();
   System.out.println(dtf.format(now));
 try{
Thread.sleep(2000);
}
catch(InterruptedException e){System.out.println(e);} 
}
}
public static void main(String[] args) { 
Assignment2 ass= new Assignment2 ();
ass.start();
 }  
}  
