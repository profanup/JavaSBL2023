/* Problem Statement:
Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". 
It has two members with the same name 'setInfo'. 
First method has two parameters for name and age it sets the same whereas the second method has three
parameters which are assigned to name, age and address respectively. 
Print the name, age and address of 10 students. 
Hint - Use array of objects.	
*/
import java.util.Scanner;
class student{
   String name;
   int age;
   String address;
   //Default Constructor
   student()
   {
     this.name="unknown";
     this.age=0;
     this.address="not available";
   }
   //setInfo method1 with 2 parameters
   public void setInfo(String name, int age)
   {
     this.name=name;
     this.age=age;
   }
   //setInfo method with 3 parameters
   public void setInfo(String name, int age, String address)
   {
     this.name=name;
     this.age=age;
     this.address=address;
   } 
   public void getInfo()
   {
     System.out.println(this.name+"\t"+this.age+"\t"+this.address);	   
   }
}
class studentDetails{
   public static void main(String [] args){

   String name, address;
   int age;
 
   student [] s = new student[10];
   Scanner obj = new Scanner(System.in);	   
   for(int i=0;i<10;i++){
     System.out.println("Enter name of Student");
     name = obj.nextLine();
     System.out.println("Enter age of Student");
     age = obj.nextInt();
     obj.nextLine();
     System.out.println("Enter address of Student");
     address = obj.nextLine();
     s[i] = new student();
     s[i].setInfo(name,age,address);
   }
   System.out.println("Name\tAge\tAddress");
   for(int i=0;i<10;i++)
     s[i].getInfo(); 
   }
}   
