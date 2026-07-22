import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = a == 100 ? 0 : 1;
        
        if (s == 0) {
            System.out.print("pass");
        }
        else {
            System.out.print("failure");
        }
    }
}