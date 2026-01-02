
import java.io.*;

public class P45 {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

        String line;

        while ((line = br.readLine()) != null) {
            // Replace one or more spaces with single space
            line = line.replaceAll("\\s+", " ");
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("Extra spaces removed successfully.");
    }
}
