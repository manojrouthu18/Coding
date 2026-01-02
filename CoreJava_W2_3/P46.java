
/*46. Write  a program to accept strings until 'end' is given and sort them and write them into Codes.txt and the string must be one/more alphabets followed by one/more digits.(use Regular Expressions)
47. Write a program to display the file which contains the given string in a path.
48. Assume a txt file customers.txt which contains name & mobile no and you need to display in sorted order of name.(Use regular expression) */

import java.util.*;
import java.io.*;

public class P46{
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String regex = "[a-zA-Z]+\\d+";

        System.out.println("Enter strings (type 'end' to stop):");

        while (true) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("end")) {  //end or END
                break;
            }

            if (input.matches(regex)) {
                list.add(input);
            }
        }

        // Sort the list
        Collections.sort(list);

        // Write to file
        BufferedWriter bw = new BufferedWriter(new FileWriter("Codes.txt"));

        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
        sc.close();

        System.out.println("Valid strings sorted and written to Codes.txt");
    }
}

