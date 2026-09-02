import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        while (true) {
            int N = sc.nextInt();

            if (N < 20 || N >= 30) {
                break;
            }
            sum += N;
            cnt++;
        }
        System.out.printf("%.2f", ((double) sum / cnt));
    }
}