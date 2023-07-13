/*Write a java program to calculate gross salary & net salary taking the following data.
Input:empno,empname,basic
 Process: DA=50% of basic, HRA=25% of basic, CCA=Rs 240/-, PF=10% of basic, PT=Rs100/-*/
import java.util.*;

class Employee
{
  public static void main(String   []args)
  {
        float DA,HRA,PF,gr_sal,net_sal;
        float CCA=240f,PT=100f;
       
        Scanner  a= new Scanner(System.in);
        System.out.println("Enter employee no=");
        int empno=a.nextInt();
        System.out.println("Enter employee name="); 
        String empname=a.next();
	System.out.println("Enter your basic ");
        float basic=a.nextFloat();
        
	DA=(0.5f)*basic;
 	HRA=(0.25f)*basic;
 	PF=(0.1f)*basic;
 
 	gr_sal=(basic + DA + HRA);
 	net_sal=(gr_sal - CCA - PT - PF);
 	
 	System.out.println("Employee no   : " + empno);
 	System.out.println("Employee name : " + empname);
 	System.out.println("Employee Basic: " + basic);
 	System.out.println("Your Gross Salary : " + gr_sal);
 	System.out.println("Your Net Salary   : " + net_sal);
  }
}
/* Output
$javac Mod1_Code1_Employee.java 
$java Employee
Enter employee no=
904
Enter employee name=
Ramesh
Enter your basic 
20000
Employee no   : 904
Employee name : Ramesh
Employee Basic: 20000.0
Your Gross Salary : 35000.0
Your Net Salary   : 32660.0

*/ 	
