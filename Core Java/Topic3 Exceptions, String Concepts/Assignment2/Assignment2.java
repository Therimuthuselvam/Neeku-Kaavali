import java.util.*;
public class Assignment2
{
public static void main(String[] args)
{
	String name1 = args[0];
	String name2 = args[1];

	try{
	int sub1 = Integer.parseInt(args[2]);
	int sub2 = Integer.parseInt(args[3]);
	int sub3 = Integer.parseInt(args[4]);
	int s1 = Integer.parseInt(args[5]);
	int s2 = Integer.parseInt(args[6]);
	int s3 = Integer.parseInt(args[7]);
	float avg1= (sub1+sub2+sub3)/3;
	float avg2 = (s1+s2+s3)/3;

	System.out.println("Average marks of " +name1+ " : " +avg1 );
	System.out.println("Average marks of " +name2+ " : " +avg2 );
	} 
	catch(NumberFormatException e){
	System.out.println(e);
	}
}
}