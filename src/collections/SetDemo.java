package collections;
import java.util.*;  

class SetDemo{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();  
list.add("rahul");  
list.add("jai");  
//list.add(32);//compile time error  
  
String s=list.get(1);//type casting is not required  
System.out.println("element is: "+s); 
        
        System.out.println("afer tree st addding :"+list);
       
        
        
    }
}
