/* Write a Java program that prints all real solutions to the quadratic equation ax^2+bx+c = 0. Read in a, b, c and use the quadratic formula. If the discriminate b^2-4ac is negative, display a message stating that there are no real solutions
*/
import java.io.*;
class Quadratic
{
	public static void main(String args[])throws IOException
	{
		double x1,x2,disc,a,b,c;
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.println("Enter a,b,c values :");
		a=Double.parseDouble(br.readLine());
		b=Double.parseDouble(br.readLine());
		c=Double.parseDouble(br.readLine());
		disc=(b*b)-(4*a*c);
		if(disc==0)
		{
			System.out.println("roots are real and equal ");
			x1=x2=-b/(2*a);
			System.out.println("roots are "+x1+","+x2);
		}
		else if(disc>0)
		{
			System.out.println("roots are real and unequal");
			x1=(-b+Math.sqrt(disc))/(2*a);
			x2=(-b+Math.sqrt(disc))/(2*a);
			System.out.println("roots are "+x1+","+x2);
		}
		else
		{
			System.out.println("roots are imaginary");
		}
	}
}
/* OUTPUT
$javac Mod1_Code3_Quadratic.java 
$java Quadratic 
Enter a,b,c values :
2 
3
2
roots are imaginary
$java Quadratic 
Enter a,b,c values :
1
4
2
roots are real and unequal
roots are -0.5857864376269049,-0.5857864376269049
$java Quadratic 
Enter a,b,c values :
1
4
4
roots are real and equal 
roots are -2.0,-2.0

*/

