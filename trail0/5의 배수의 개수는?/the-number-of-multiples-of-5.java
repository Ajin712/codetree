import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int aj[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                aj[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (aj[i][j] % 5 == 0) {
                    cnt += 1;  
                }
            }
        }
        System.out.println(cnt);
    }
}