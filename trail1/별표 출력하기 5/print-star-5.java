import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int j = n; j > 0; j--) {
            for (int i = j; i > 0; i--) {
                for (int z = 0; z < j; z++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}