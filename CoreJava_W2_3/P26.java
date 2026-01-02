

import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class P26 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting date (DD-MM-YYYY): ");
        String startDateStr = sc.nextLine();

        System.out.print("Enter ending date (DD-MM-YYYY): ");
        String endDateStr = sc.nextLine();

        // Formatter for given pattern
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Convert String to LocalDate
        LocalDate startDate = LocalDate.parse(startDateStr, formatter);
        LocalDate endDate   = LocalDate.parse(endDateStr, formatter);

        // Calculate days between
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Number of days between: " + daysBetween);

        sc.close();
    }
}
