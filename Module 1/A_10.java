import java.util.Scanner;
public class A_10 {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of lines: ");
        int n = sc.nextInt();
        sc.close();
        // for (int i = 0; i < 2*n-1; i++) {
        //     System.out.print(" ".repeat((i<=n)?n-i:i-n));
        //     System.out.println("*".repeat((i<=n)?i:2*n-i));
        // }
        for(int i=0; i<n;i++){
            System.out.print(" ".repeat(n-i));
            System.out.println("* ".repeat(i+1));
        }
        for(int i=n-1; i>0;i--){
            System.out.print(" ".repeat(n-i+1));
            System.out.println("* ".repeat(i));
        }
    }
}