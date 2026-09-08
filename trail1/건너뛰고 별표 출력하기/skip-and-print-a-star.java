import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        for (int j = n; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}