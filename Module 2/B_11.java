/*
 * Write a program to show the difference between public and private 
 *access specifiers. The program should also show that primitive  data 
 *types are passed by value and objects are passed by reference and to 
 *learn use of final keyword
 */
class Distance {

    public int feet, inches;
    private int meters, centimeters;
    public final int kilo = 1000;//final keyword
  
    Distance(int f, int i) {
      meters = 100;
      centimeters = 50;
      this.feet = f;
      this.inches = i;
    }
  
    void display() {
      System.out.println("feet = " + feet);
      System.out.println("inches =  " + inches);
      System.out.println("metres = " + meters);
      System.out.println("centimeters = " + centimeters);
  
    }
  
    void addDistance(Distance d3) {
      // kilo=2000; //because of final value can't be assigned
      d3.feet = d3.feet + kilo;
      d3.inches = d3.inches + kilo;
  
    }
  }
  
  public class B_11 {
  
    public static void main(String args[]) {
  
      Distance d1 = new Distance(10, 20);
      Distance d3 = new Distance(20, 30);
  
      d1.display();
      // System.out.println("metres= "+d1.meters);
      // meters can't be accessed because of private access specifier
      // System.out.println("centimeters= "+d1.centimeters);
      // centimeters can't be accessed because of private access specifier
      d1.addDistance(d3);
      d3.display();
  
    }
  }