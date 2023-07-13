import java.util.Scanner;
class Operations{
	private int input;
	public Operations(int num)
	{
	   input = num;
	}
    	public void fibonacciSeries()
	{
		int a = 0, b = 1;
            	System.out.print(a + " " + b);
                for (int i = 3; i <= input; i++) 
	    	{
                	int term = a + b;
                	System.out.print(" " + term);
                	a = b;
                	b = term;
            	}
            	
	}
	public int reverseNumber()
	{
		int rev = 0;
		int R;
		int number=input;
            	while (number != 0) 
		{
                	R = number%10;
                	rev = rev*10+R;
	     		number = number/10;
            	}
		return rev;
	}
 	
}
public class NumberOperation
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
	System.out.println("1. Fibonacci Series");
        System.out.println("2. Reverse of Number");
        System.out.print("Slect the operation: ");
        int ch = in.nextInt();
        System.out.print("Enter an input number to perform the operation on: ");
        int number = in.nextInt();
        Operations Ops = new Operations(number);
 	switch (ch) 
	{
            case 1:
            	{
            	Ops.fibonacciSeries();
		break;
		}
            case 2:
            	{
            	int rev=Ops.reverseNumber();
            	System.out.println("Reverse of number " +number+ " is " + rev);
            	break;
	    	}
            default:
            	System.out.println("Incorrect choice");
        }
    }
}
