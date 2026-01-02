import java.util.Scanner;

public class P8 {
 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");

        // Read elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //  in reverse order
        System.out.println("Elements in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}

