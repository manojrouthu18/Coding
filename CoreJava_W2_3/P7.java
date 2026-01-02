import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();

        int re = 0;
        while (n > 0) {
            re = re * 10 + (n % 10);
            n /= 10;
        }
        System.out.println("The reverese of num" + re);
    }
}
