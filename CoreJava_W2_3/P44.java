

import java.util.Scanner;

public class P44 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] words = input.split("\\s+");

        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}

