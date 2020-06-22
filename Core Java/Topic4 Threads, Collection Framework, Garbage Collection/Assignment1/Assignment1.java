import java.lang.Math;
class Thread1 implements Runnable
{  
int num; 
public Thread1(int num){
this.num=num;
}
public void run(){ 
System.out.println("Number : "+num);  
 }  
}
class Thread2 implements Runnable{  
int num1; 
public Thread2(int num1){
this.num1=num1;
}
public void run(){ 
int fact=1;
 for(int i=1;i<=num1;i++){    
      fact=fact*i;    
  }  
System.out.println("Factorial of "+num1+ " : "+fact);  
 }
}    

public class Assignment1
{
public static void main(String[] args)
{
for(int i=0;i<5;i++){
int a =(int)Math.random();
Thread t1=new Thread(new Thread1(a));  
t1.start();  
 Thread t2=new Thread(new Thread2(a));  
t2.start();  
}
 }
}