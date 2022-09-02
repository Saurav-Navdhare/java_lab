import java.util.Scanner;

public class A_06 {
    public static void main(String args[]) {
        System.out.println("Starting...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        int vowel = 0, consonant = 0;
        String myStr = line.toLowerCase();
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                    if("aeiou".indexOf(myStr.charAt(i))!=-1){
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        sc.close();
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}
