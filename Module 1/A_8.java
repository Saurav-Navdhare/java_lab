import java.util.*;

class A_8 {
    public static int a, e, i, o, u;

    public static void main(String m[]) {

        Scanner sc = new Scanner(System.in);
        String s = new String();
        while (true) {
            int ta = 0, te = 0, ti = 0, to = 0, tu = 0;
            System.out.println("Enter A line (quit to exit:");
            s = sc.nextLine();
            if (s.equals("quit")) {
                break;
            } else {
                int n = s.length() - 1;
                for (int x = 0; x <= n; x++) {
                    switch (Character.toLowerCase(s.charAt(x))) {
                        case 'a':
                            a++;
                            ta++;
                            break;
                        case 'e':
                            e++;
                            te++;
                            break;
                        case 'i':
                            i++;
                            ti++;
                            break;
                        case 'o':
                            o++;
                            to++;
                            break;
                        case 'u':
                            u++;
                            tu++;
                            break;
                    }

                }
                System.out.println("\n\n In this statement:");
                System.out.println("a comes: " + ta + " times");
                System.out.println("e comes :" + te + " times");
                System.out.println("i comes :" + ti + " times");
                System.out.println("o comes: " + to + " times");
                System.out.println("u comes :" + tu + " times");
            }
        }
        sc.close();
        System.out.println("\n\n Total numbers of the vowels:");
        System.out.println("a comes " + a + " times");
        System.out.println("e comes " + e + " times");
        System.out.println("i comes " + i + " times");
        System.out.println("o comes " + o + " times");
        System.out.println("u comes " + u + " times");
    }
}