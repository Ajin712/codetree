import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.next();      
        String[] d = date.split("-");

        String mm = d[0];
        String dd = d[1];
        String yyyy = d[2];

        System.out.println(yyyy + "." + mm + "." + dd);
    }
}