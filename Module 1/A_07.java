import java.util.Scanner;

public class A_07 {
    public static void main(String args[]) {
        System.out.println("Starting...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        int cap = 0;
        if (Character.isUpperCase(line.charAt(0))) cap++;

        for (int i = 1; i < line.length(); i++) {
            if (Character.isUpperCase(line.charAt(i)) && line.charAt(i - 1) == ' ') {
                cap++;
            }
        }
        sc.close();
        System.out.println("Capital Letters: " + cap);
    }
}
