


import java.util.Scanner;

public class P43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PAN Number: ");
        String pan = sc.nextLine();

        // PAN regex pattern
        String panRegex = "[A-Z]{5}[0-9]{4}[A-Z]";

        if (pan.length() == 10 && pan.matches(panRegex)) {
            System.out.println("Valid PAN Number");
        } else {
            System.out.println("Invalid PAN Number");
        }

        sc.close();
    }
}
