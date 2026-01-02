
//25. Write a program to accept names until the END is given and display all the names separated by '-'.
import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {


         System.out.println("Enter \"End\" to end loop");
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a Name:");
         String tempSt=sc.nextLine();

         StringBuilder finalResult=new StringBuilder();
        

       
        while(!tempSt.equals("END")){

          
             finalResult.append("-"+tempSt);
             System.out.print("Enter a Name:");
             tempSt=sc.nextLine();
          


        }

        System.out.println(new String(finalResult.substring(1,finalResult.length())));
        
    }


}
