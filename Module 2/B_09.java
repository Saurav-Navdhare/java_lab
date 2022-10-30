//Write a program in Java in which a subclass constructor invokes the constructor of the super class and instantiate the values

class A_09
{
    int a;
    A_09(int x)
    {
        a=x;
    }
}
class MyClass extends A_09
{
    int b;
    MyClass(int x,int y)
    {
        super(x);
        b=y;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
public class B_09
{
    public static void main(String args[])
    {
        MyClass obj=new MyClass(10,20);
        obj.display();
    }
}