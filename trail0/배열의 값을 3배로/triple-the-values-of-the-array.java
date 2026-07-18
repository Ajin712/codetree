import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aj[][] = new int[3][3];
        int x = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aj[i][j] = sc.nextInt();
            }
        } 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(aj[i][j] * 3 + " ");
            }
            System.out.println();
        } 
    }
}