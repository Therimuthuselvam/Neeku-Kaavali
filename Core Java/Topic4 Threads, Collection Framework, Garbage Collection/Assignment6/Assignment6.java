import java.util.*;
import java.lang.*;
class A
{
        public static int count=0;
	protected void finalize()
	{
	count++;
	System.out.println("Finalize method called");
	System.out.println("Finalize method is called " +count+ " times");
               
	}
}

public class Assignment6
{
public static void main(String[] args)
{
	A a=new A();
	a=new A();
	a=new A();	
 	Runtime r=Runtime.getRuntime(); 
	System.gc();
	System.out.println("Free memory is : " +r.freeMemory());
}
}