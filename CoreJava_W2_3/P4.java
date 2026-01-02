import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day of week (1 to 7): ");
        int day = sc.nextInt();

        System.out.print("Enter number of hours worked: ");
        int hours = sc.nextInt();

        // Switch expression to get rate per hour
        int rate = switch (day) {
            case 1, 2, 3 -> 200;
            case 4, 5 -> 400;
            case 6 -> 600;
            case 7 -> 800;
            default -> {
                System.out.println("Invalid day");
                yield 0;
            }
        };

        int total = rate * hours;

        // Bonus condition
        if (total > 2000) {
            total += total * 0.10; // 10% bonus
        }

        System.out.println("Total Wage: Rs " + total);

        sc.close();
    }
}
