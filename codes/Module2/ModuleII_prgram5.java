// Java program to add and subtract two
// complex numbers using Class

import java.util.*;

// User Defined Complex class
class Complex {

     // Declaring variables
     int real, imaginary;

     // Default Constructor
     Complex()
     {
       this.real=this.imaginary=0;
     }

     // Constructor to accept
     // real and imaginary part
     Complex(int tempReal, int tempImaginary)
     {
	real = tempReal;
	imaginary = tempImaginary;
     }

     // Defining addComp() method
     // for adding two complex number
     Complex addComp(Complex C1, Complex C2)
     {
	// creating temporary variable
	Complex temp = new Complex();

	// adding real part of complex numbers
	temp.real = C1.real + C2.real;

	// adding Imaginary part of complex numbers
	temp.imaginary = C1.imaginary + C2.imaginary;

	// returning the sum
	return temp;
     }

     // Defining subtractComp() method
     // for subtracting two complex number
     Complex subtractComp(Complex C1, Complex C2)
     {
	// creating temporary variable
	Complex temp = new Complex();

	// subtracting real part of complex numbers
	temp.real = C1.real - C2.real;

	// subtracting Imaginary part of complex numbers
	temp.imaginary = C1.imaginary - C2.imaginary;

	// returning the difference
	return temp;
      }
	
      // Defining multiComp() method
      // for multiplying two complex number
      Complex multiComp(Complex C1, Complex C2)
      { 
	// creating temporary variable
	Complex temp = new Complex();
	
	temp.real = C1.real*C2.real - C1.imaginary*C2.imaginary;

	temp.imaginary = C1.real*C2.imaginary + C1.imaginary*C2.real;

	return temp;
      }

      // Overriding toString() method of String class
      @Override
      public String toString() {
        return "( "+this.real + " + " + this.imaginary + "i )\n";
      }
}

// Main Class
class ComplexOpearions {

	// Main function
	public static void main(String[] args)
	{

		// First Complex number
		Complex C1 = new Complex(3, 2);

		// printing first complex number
		System.out.println(C1);

		// Second Complex number
		Complex C2 = new Complex(9, 5);

		// printing second complex number
		System.out.println(C2);

		// Object for Storing the sum
		Complex C3 = new Complex();

		// calling addComp() method
		C3 = C3.addComp(C1, C2);

		// printing the sum
		System.out.print("Sum is :"+C3);
		
		// calling subtractComp() method
		C3 = C3.subtractComp(C1, C2);

		// printing the difference
		System.out.print("Difference is: "+C3);
		
		//Calling multiComp() method
		C3 = C3.multiComp(C1,C2);
		
		// printing the multiplication
		System.out.print("Multiplication is: "+C3);
	}
}

