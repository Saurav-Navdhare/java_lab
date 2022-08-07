import java.util.Scanner;
public class A_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting...");
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter num3: ");
        int num3 = sc.nextInt();
        sc.close();
        if(num1>num2 && num1>num3){
            System.out.println("Largest: "+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Largest: "+num2);
        }
        else{
            System.out.println("Largest: "+num3);
        }
    }
}
