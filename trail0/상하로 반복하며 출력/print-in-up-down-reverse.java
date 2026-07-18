import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int aj[][] = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            int x = 1;
            if (i % 2 != 0) {
                for (int j = n - 1; j >= 0; j--) {
                    aj[j][i] = x++;
                }
            }
            else {
                for (int j = 0; j < n; j++) {
                    aj[j][i] = x++;
                }
            }
        }
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) {
                System.out.print(aj[i][j]);
            }
            System.out.println();
        }
    }
}