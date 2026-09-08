import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}