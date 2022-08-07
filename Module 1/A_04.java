import java.util.Scanner;
public class A_04 {
    public static void main(String[] args){
        System.out.println("Starting...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Students (out of 100):");
        System.out.print("Marks of Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Marks of Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Marks of Subject 3: ");
        int m3 = sc.nextInt();
        System.out.print("Marks of Subject 4: ");
        int m4 = sc.nextInt();
        System.out.print("Marks of Subject 5: ");
        int m5 = sc.nextInt();
        System.out.print("Marks of Subject 6: ");
        int m6 = sc.nextInt();
        sc.close();
        float avg = (m1+m2+m3+m4+m5+m6)/6;
        System.out.println("Average Marks: "+avg + "%");
    }
}
