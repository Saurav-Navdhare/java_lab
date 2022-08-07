import java.util.Scanner;

public class A_07 {
    public static void main(String args[]) {
        System.out.println("Starting...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        int cap = 0;
        for (int i = 0; i < line.length(); i++) {
            if(Character.isUpperCase(line.charAt(i))){
                cap++;
            }
        }
        sc.close();
        System.out.println("Capital Letters: " + cap);
    }
}
