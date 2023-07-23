/* Problem Statement:
Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First
method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named
as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
*/

import java.util.Scanner;
// Class to store length and breadth of reactangle and compute area of rectangle 
class area{
    int length;
    int breadth;
    
    ///getter and setter methods for class member variables 
    public void setDim(int a, int b)
    {
         this.length = a;
         this.breadth = b;
    }
    public int getArea()
    {
        return length * breadth;
    }
}
class Rectangle{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the lenght of Recatangle");
        a = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the breadth of Recatangle");
        b = obj.nextInt();
        area rectangle1 = new area();
        rectangle1.setDim(a,b);
        System.out.println("Area = "+ rectangle1.getArea());
    }
}
