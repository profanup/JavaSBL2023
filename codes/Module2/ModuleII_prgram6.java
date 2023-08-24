 /* Problem Statement:
    Print Reverse Array list in java by writing our own function.
*/
import java.util.*;
class ReverseArrayList {  
    public static void main(String[] args) {  
    
        // Create Array list ATD in Java
        List<String> l = new ArrayList<String>();
        
        //Add strings in Array List of strings using add method  
        l.add("Mango");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple");  
        
        //Print Aray List elments before reversing
        System.out.println("Before Reversing");  
        System.out.println(l.toString());  
        
        //Reversing and displaying the reverse list of Strings  
        Collections.reverse(l);  
        System.out.println("After Reversing");  
        System.out.println(l);  
    }  
}  
