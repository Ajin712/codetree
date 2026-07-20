import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();         
        String[] arr = num.split("-");

        System.out.println(arr[0] + arr[1]);
    }
}