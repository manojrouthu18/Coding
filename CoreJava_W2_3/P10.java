import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
 


        // Program to accept multiple integers and display their common factors
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Find the smallest number
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Common factors:");

        // Check common factors
        for (int i = 1; i <= min; i++) {
            boolean isCommon = true;

            for (int num : arr) {
                if (num % i != 0) {
                    isCommon = false;
                    break;
                }
            }

            if (isCommon) {
                System.out.print(i + " ");
            }
        }
    }
}

