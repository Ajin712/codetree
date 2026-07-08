import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (b > c) {
                System.out.println(b);
            } // a b c
            else {
                if (a > c) {
                    System.out.println(c);
                } // a c b
                else {
                    System.out.println(a);
                } // c a b
            }
        }
        else if (b > c) {
            if (c > a) {
                System.out.println(c);
            } // b c a 
            else {
                if (b > a) {
                    System.out.println(a);
                } // b a c
                else {
                    System.out.println(b);
                } // a b c
            }
        }
        else if (c > a) {
            if (a > b) {
                System.out.println(a);
            } // c a b
            else {
                System.out.println(b);
            } // c b a
        }
    }
}