import java.util.Scanner;

public class A_09 {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line default will be Stream: ");
        String line = sc.nextLine();
        line = line.replaceAll(" ", "");
        if (line.length() == 0) {
            line = "Stream";
        }
        sc.close();
        // letter pyramid
        for (int i = 0; i < line.length(); i++) {
            System.out.print(" ".repeat(line.length() - i));
            for (int j = 0; j < i + 1; j++) {
                System.out.print(line.substring(0, i + 1).charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
