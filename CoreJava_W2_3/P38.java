
import java.io.*;
class P38{
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("names.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("outputOupper.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line.toUpperCase());
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
