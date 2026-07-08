import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = new String[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.next();
        }

        for (int j = 9; j > -1; j--) {
            System.out.print(numbers[j]);
        }
    }
}