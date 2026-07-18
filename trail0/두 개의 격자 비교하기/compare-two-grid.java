import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int aj[][] = new int[n][m];
        int aj2[][] = new int[n][m];
        int matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                aj[i][j] = sc.nextInt();
            }
        } 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                aj2[i][j] = sc.nextInt();
            }
        } 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (aj[i][j] != aj2[i][j]) {
                    matrix[i][j] = 1;
                }
            }
        } 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        } 
    }
}