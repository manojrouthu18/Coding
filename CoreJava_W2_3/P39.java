package CoreJava;


import java.io.*;
import java.util.*;


public class P39 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("names.txt"));
        //treeset --sorted + unique
        Set<String> names = new TreeSet<>();

        String line;
        while ((line = br.readLine()) != null) {
            names.add(line.trim());
        }

        br.close();

        for (String name : names) {
            System.out.println(name);
        }
    }
}

