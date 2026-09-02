import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean s = true;

        for (int i = 1; i <= 5; i++) {
            int N = sc.nextInt();
            
            if (N % 3 != 0) {
                s = false;
            }
        }
        if (s == true) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}