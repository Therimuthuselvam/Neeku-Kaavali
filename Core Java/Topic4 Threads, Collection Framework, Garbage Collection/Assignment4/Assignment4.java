import java.util.*;
public class Assignment4{
public static void main(String args[])  
{  
Scanner sc=new Scanner(System.in);

HashMap<String,String> hm = new HashMap<String,String>();   
hm.put("Ravi","9851745690");  
hm.put("Prateek","9225899523");  
hm.put("Davesh","9747395415");    
hm.put("Kamal","9534223456");  
hm.put("Pawan","9573332143");  

System.out.println("Enter a name: ");
String name=sc.next();

Iterator <String> it = hm.keySet().iterator();  
   
while(it.hasNext())  
{  
String key=it.next(); 
if(name.equals(key))
System.out.println("Contact of " +name+ " : " +hm.get(name));  
} 

}  
}  