/*Write a program that implements simple example of Runtime 
 *Polymorphism with multilevel inheritance. (e.g., Animal or Shape)
*/

class Test {
 
    // Implementing a method
    public void method()
    {
        System.out.println("Method 1");
    }
}
 
// Defining a child class
public class B_10 extends Test {
 
    // Overriding the parent method
    public void method()
    {
        System.out.println("Method 2");
    }
 
    // Driver code
    public static void main(String args[])
    {
        Test test = new B_10();
 
        test.method();
    }
}