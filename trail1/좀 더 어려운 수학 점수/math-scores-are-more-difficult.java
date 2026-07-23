import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A_m = sc.nextInt();
        int A_e = sc.nextInt();
        int B_m = sc.nextInt();
        int B_e = sc.nextInt();

        if (A_m == B_m) {
            if (A_e > B_e) {
                System.out.print("A");
            }
            else {
                System.out.print("B");
            }
        }
        else if (A_m > B_m) {
            System.out.print("A");
        }
        else {
                System.out.print("B");
            }
    }
}