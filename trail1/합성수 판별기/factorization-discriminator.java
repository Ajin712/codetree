import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean s = false;

        for (int i = 2; i <= (N - 1); i++) {
            if (N % i == 0) {
                s = true;
                break;
            }
        }
        if (s == true) {
            System.out.print("C");
        }
        else {
            System.out.print("N");
        }
    }
}