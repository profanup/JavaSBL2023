/* Problem Statement:
Write a java programs to add n strings in a vector array. Input new string and check whether it is present
in the vector. If it is present don't add it otherwise add it to the vector.
*/

import java.util.*;
class vector
{
   public static void main(String args[])
   {
     Vector c= new Vector();
     Scanner obj=new Scanner(System.in); 
     int n;
     String str;
     System.out.println("Enter how many string you want in Vector.");
     n=obj.nextInt();
     obj.nextLine();
     int i=0;
     while(i<n)
     {
        System.out.println("\nEnter string to add in vector:");
        str = obj.nextLine();
        if(c.contains(str))
        {
           System.out.println("String already present in vector. Skip it");
        }
        else
        {
           c.addElement(str);	
           i++;
        }
     
     }
     Enumeration<String> strs = c.elements();  
     System.out.println("Content of the vector is :");
     while(strs.hasMoreElements())
     {
       System.out.println("" +strs.nextElement()); 
     }
  
   }
} 
