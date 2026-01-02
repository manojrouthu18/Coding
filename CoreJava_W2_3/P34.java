import java.io.*;
import java.util.*;

public class P34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;

        try (FileReader fr = new FileReader(fileName)) {

            int ch;
            while ((ch = fr.read()) != -1) {
                if (Character.isUpperCase(ch)) {
                    upperCount++;
                } else if (Character.isLowerCase(ch)) {
                    lowerCount++;
                } else if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }

            System.out.println("Uppercase letters: " + upperCount);
            System.out.println("Lowercase letters: " + lowerCount);
            System.out.println("Digits: " + digitCount);

        } catch (IOException e) {
            System.out.println("Error in resding file: " + e.getMessage());
        }
    }
}