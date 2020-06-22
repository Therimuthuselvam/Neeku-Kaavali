import java.util.*; 

public class Assignment5{  
 public static void main(String args[]){  
    HashSet<String> set=new HashSet();  
           set.add("Ramya");    
           set.add("Deepika");    
           set.add("Anu");   
           set.add("Teja");  
           set.add("Roshni"); 
 
           Iterator<String> i=set.iterator(); 
            System.out.println ("Employees: ");

           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  
