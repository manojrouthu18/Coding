import java.util.Scanner;

public class P6 {
  
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int largestFactor = 1;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                largestFactor = n / i;
                break; // first divisor gives largest factor
            }
        }

        System.out.println("Largest factor other than the number: " + largestFactor);
        sc.close();
    
    }
}
