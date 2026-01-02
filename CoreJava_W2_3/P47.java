
import java.io.*;
import java.util.Scanner;

public class P47 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        System.out.print("Enter string to search: ");
        String search = sc.nextLine();

        File folder = new File(path);
        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("Invalid directory path");
            return;
        }

        for (File file : files) {

            if (file.isFile()) {

                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                boolean found = false;

                while ((line = br.readLine()) != null) {
                    if (line.contains(search)) {
                        found = true;
                        break;
                    }
                }

                br.close();

                if (found) {
                    System.out.println(file.getName());
                }
            }
        }

        sc.close();
    }
}


