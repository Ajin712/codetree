import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String[] d = a.split("\\.");

        System.out.println(d[1] + "-" + d[2] + "-" + d[0]);
    }
}