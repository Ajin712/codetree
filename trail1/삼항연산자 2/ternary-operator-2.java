import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a == 1 ? 1 : 0;

        if (b == 1) {
            System.out.print('t');
        }
        else {
            System.out.print('f');
        }
    }
}