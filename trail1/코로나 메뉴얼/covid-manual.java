import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_c = 0;

        for (int i = 0; i < 3; i++) {
            String a = sc.next();
            int b = sc.nextInt();

            if (a.equals("Y") && b >= 37) {
                a_c += 1;
            }
        }
        if (a_c >= 2) {
            System.out.print("E");
        }
        else {
            System.out.print("N");
        }
    }
}