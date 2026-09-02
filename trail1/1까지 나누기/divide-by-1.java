import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int i = 1;

        while (N > 1) {
            N /= i;
            cnt++;
            i++;
        }
        System.out.print(cnt);
    }
}