import java.util.Scanner;
public class A_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting...");
        System.out.print("Enter number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2 : ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Subtraction: "+(num1-num2));
        System.out.println("Multiplication: "+(num1*num2));
        if(num2==0){
            System.out.println("Division and remainder not possible");
            return;
        }
        System.out.println("Division: "+(num1/num2));
        System.out.println("Remainder: "+(num1%num2));
    }
}
