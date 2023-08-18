/* Problem Statement: Create a Teacher class and derive Professor class from Teacher class. Define appropriate constructor for all the classes. Define a method to display information of Teacher. Make necessary assumptions as required. */

class Teacher  {    
String teacherName;     
int teacherId;      

public Teacher(String teacherName, int teacherId)      
{          
this.teacherName = teacherName;           
this.teacherId = teacherId;       
}          
public void display()      
{          
System.out.println("\n Name = "+teacherName);          
System.out.println("\n Id = "+teacherId);
 }   
}  
class Professor extends Teacher  
{      
String Specialization;      
      
public Professor(String Specialization, String teacherName, int teacherId)      
{          
super(teacherName, teacherId);          
this.Specialization = Specialization;           
}
@Override       
public void display()      
{          
System.out.println("\n Specilization = "+Specialization);          
System.out.println("\n Name = "+this.teacherName);          
System.out.println("\n Id = "+this.teacherId);      
}        
}  
class Run 
{      
public static void main(String [] args)      
{          
Professor P1 = new Professor("IT","Professor", 101);          
P1.display();                 
}  
}
