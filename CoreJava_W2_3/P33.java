
package CoreJava;

//25. Write a program to accept names until the END is given and display all the names separated by '-'.
import java.io.*;
import java.util.Scanner;

public class P33 {
    public static void main(String[] args) {


         System.out.println("Enter \"End\" to end loop");
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a Name:");
         String tempSt=sc.nextLine();

         StringBuilder finalResult=new StringBuilder();
        

       
        while(!tempSt.equals("END")){

          
             finalResult.append(tempSt);
             System.out.print("Enter a Name:");
             tempSt=sc.nextLine();
          


        }
       

        String names=new String(finalResult);



        // can use other low-level writer aslo like file writer etc
        try (PrintWriter writer=new PrintWriter("names.txt")) {

            writer.write(names);     
            
        } catch (IOException e) {

            System.out.println(e);
           
        }
        

        System.out.println(new String(names)+"added to the file namex.txt");
    }


}

