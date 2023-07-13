/* Write a menu driven Java program which will read a number and should implement the following
methods
1. factorial()
2. testArmstrong()
3. reversNumber()
4. testPrime()
5. fibonacciSeries()
6. Exit
*/
import java.util.Scanner;
class Operations{
	private int input;
	public Operations(int num)
	{
	   input = num;
	}
	public int testArmstrong()
	{
	   int digit,flag=0,num=input,cubeSum=0;
	   	
 	   if( num > 99 || num < 1000)
	   {
	     
             while (num != 0)
             {
            	digit=num%10;
            	cubeSum+=Math.pow(digit, 3);
            	num/=10;
		
             }
           }
	   
	   if(input == cubeSum)
	     flag=1;
	   else
              flag=0;
           return flag;
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
            	System.out.println("");
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
 	public int testPrime()
	{
		// Please complete this code	
	}
	public int factorial()
	{
		// Please complete this code	
	}	
}
public class NumberOperation
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
	do
	{
		System.out.println("1. Fibonacci Series");
        	System.out.println("2. Reverse of Number");
		System.out.println("3. Check for Armstrong Number");
		System.out.println("4. Exit");        	
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
		    case 3:
        	    	{
        	    	int flag=Ops.testArmstrong();
			if(flag==1)
			   System.out.println("Given number " +number+ " is an Armstrong number");
			else
			   System.out.println("Reverse of number " +number+ " is not an Armstrong number");
        	    	break;
		    	}
		    case 4:
			System.exit(0);	
		    //Add code to support all six operations	
        	    default:
        	    	System.out.println("Incorrect choice");
        	}
	}while(true);
    }
}

/*

$javac NumberOperation.java
$java NumberOperation 
1. Fibonacci Series
2. Reverse of Number
3. Check for Armstrong Number
4. Exit
Slect the operation: 1
Enter an input number to perform the operation on: 5
0 1 1 2 3
1. Fibonacci Series
2. Reverse of Number
3. Check for Armstrong Number
4. Exit
Slect the operation: 2
Enter an input number to perform the operation on: 435
Reverse of number 435 is 534
1. Fibonacci Series
2. Reverse of Number
3. Check for Armstrong Number
4. Exit
Slect the operation: 3
Enter an input number to perform the operation on: 153
Given number 153 is an Armstrong number
1. Fibonacci Series
2. Reverse of Number
3. Check for Armstrong Number
4. Exit
Slect the operation: 3
Enter an input number to perform the operation on: 143
Reverse of number 143 is not an Armstrong number
1. Fibonacci Series
2. Reverse of Number
3. Check for Armstrong Number
4. Exit
Slect the operation: 4
Enter an input number to perform the operation on: 43
*/
