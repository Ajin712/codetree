import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A_a = sc.nextInt();
        String A_s = sc.next();
        int B_a = sc.nextInt();
        String B_s = sc.next();

        if ((A_a >= 19 && A_s.equals("M")) || B_a >= 19 && B_s.equals("M")) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}