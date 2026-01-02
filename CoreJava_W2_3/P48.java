import java.io.*;
import java.util.*;



public class P48 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("customers.txt"));
        ArrayList<String> customers = new ArrayList<>();

        String regex = "[a-zA-Z]+\\s+\\d{10}";   //name space no
        String line;

        // Read file and validate using regex
        while ((line = br.readLine()) != null) {
            if (line.matches(regex)) {
                customers.add(line);
            }
        }
        br.close();

        // Sort by name
        Collections.sort(customers, (a, b) -> {
            String name1 = a.split("\\s+")[0];
            String name2 = b.split("\\s+")[0];
            return name1.compareToIgnoreCase(name2);
        });

        // Display sorted customers
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}

