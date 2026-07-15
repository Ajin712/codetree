import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int t = 0;

        for (int i = s; i <= e; i++) {
            int a = 0;  
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    a += 1;
                }
            }
            if (a == 3) {
                t += 1;
            }
       }
       System.out.println(t);
    }
}