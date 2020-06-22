import java.util.Scanner;

public class Assignment6{  
public static void main(String args[]){ 
 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter array size:"); 
  int len=sc.nextInt();
  int arr[]=new int[len];

    System.out.println("Enter array elements:"); 
  for (int i=0;i<len;i++){
    arr[i]=sc.nextInt();
  }

    int max=arr[0];
    for(int i=0;i<len;i++)
      if(arr[i]>max)
      max=arr[i];
      
System.out.println("Largest: "+max);
}}  