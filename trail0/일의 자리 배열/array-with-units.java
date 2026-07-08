import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aj = new int[10];
        aj[0] = sc.nextInt();
        aj[1] = sc.nextInt();

        for (int i = 2; i < 10; i++) {
            aj[i] = (aj[i-2] + aj[i-1]) % 10;
        }

        for (int j = 0; j < 10; j++) {
            System.out.print(aj[j] + " ");
        }
    }
}