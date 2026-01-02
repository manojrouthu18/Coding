import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class P37 {
    public static void main(String[] args) {


        String user = "manoj_12";
        System.out.println(user.matches("[a-zA-Z0-9_]{5,10}"));



         try (PrintWriter pr=new PrintWriter("output.txt")) {
       


                for(int i=0;i<20;i++){

                    System.out.println("Enter no"+(i+1)+" :");
                    Scanner sc = new Scanner(System.in);
                    
                    int num = sc.nextInt();
                    pr.print(num+" ");
                    

                }
         
            
         } catch (Exception e) {
            System.out.println(e);
         }
        
        


        
    }
}
