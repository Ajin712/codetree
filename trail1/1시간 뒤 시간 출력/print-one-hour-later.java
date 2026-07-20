import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time = sc.next();     
        String[] t = time.split(":");

        int h = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);

        h = (h + 1) % 24;

        System.out.println(h + ":" + m);
    }
}