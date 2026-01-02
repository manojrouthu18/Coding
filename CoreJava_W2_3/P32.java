
import java.util.Scanner;

public class P32 {

    public static void main(String[] args) {


         System.out.print("Num 1:");
         int sum=0;


        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();

        int i=2;
        while(!num.equals("O")){
            
            try {
                sum+=Integer.parseInt(num);
            } catch (Exception e) {
               System.out.println("Number format exception ");
            }

            System.out.print("Num "+i+": ");
            num=sc.nextLine();

            i++;
            

        }

        System.out.println();


    System.out.println("sum= "+sum);
    }
    
}
