import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aj = a % b;

        System.out.print(a / b + ".");
        for (int i = 0; i < 20; i++) {
            aj *= 10;
            System.out.print(aj / b);
            aj %= b;
        }
    } 
}