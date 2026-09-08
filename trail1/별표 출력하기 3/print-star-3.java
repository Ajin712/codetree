import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n*2 - 1;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j*2; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n-j*2; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}