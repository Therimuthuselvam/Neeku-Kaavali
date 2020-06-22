import java.util.*;
class InvalidFormatException extends Exception{  
 InvalidFormatException(String s){  
  super(s);  
 }  
}  

public class Assignment1
{
public static void main(String[] args) throws InvalidFormatException
{
	if(args.length!=2)
	throw new InvalidFormatException("Invalid no. of arguments : Please enter name and age");
	
	String name=args[0];
	int age=Integer.parseInt(args[1]);

	if(age>=18 && age<60)
	{
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
	}
	else  throw new InvalidFormatException("Invalid Age : Please enter age greater than or equal to 18 and less than 60");
}
}