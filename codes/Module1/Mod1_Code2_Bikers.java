/* Five Bikers Compete in a race such that they drive at a constant speed which may or may not be the same as
the other. To qualify the race, the speed of a racer must be more than the average speed of all 5 racers. 
Write a Java program to take as input the speed of each racer and print back the speed of qualifying racers.
*/
import java.io.*;
import java.util.*;
class Bikers
{
  static float S1,S2,S3,S4,S5;
  static float AvgSpeed;
  public static void main(String args[ ])
  {
    Scanner input = new Scanner(System.in);
    System.out.println(" Enter Speed of five Bike Racer");
    S1 = input.nextInt();
    S2 = input.nextInt();
    S3 = input.nextInt();
    S4 = input.nextInt();
    S5 = input.nextInt();
    AvgSpeed=(S1+S2+S3+S4+S5)/5;
    if( S1>AvgSpeed)
         System.out.println("The Speed of Qualifying Racer is "+S1);
    if( S2>AvgSpeed)
         System.out.println(" The Speed of Qualifying Racer is "+S2);
    if( S3>AvgSpeed)
         System.out.println(" The Speed of Qualifying Racer is "+S3);
    if( S4>AvgSpeed)
         System.out.println(" The Speed of Qualifying Racer is "+S4);
    if( S5>AvgSpeed)
         System.out.println(" The Speed of Qualifying Racer is "+S5);
  }
}
/* Output
$javac Mod1_Code2_Bikers.java 
$java Bikers 
 Enter Speed of five Bike Racer
12 232 343 21 334
 The Speed of Qualifying Racer is 232.0
 The Speed of Qualifying Racer is 343.0
 The Speed of Qualifying Racer is 334.0
*/
