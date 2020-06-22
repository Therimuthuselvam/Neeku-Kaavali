import java.util.*;
public class Assignment3
{
public static void main(String[] args)
{

try
{
if(args.length==5)
System.out.println("Average of 5 numbers :");
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);
int d = Integer.parseInt(args[3]);
int e = Integer.parseInt(args[4]);

float avg=(a+b+c+d+e)/5;

System.out.println(avg);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
}
}