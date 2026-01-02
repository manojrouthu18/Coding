import java.util.Arrays;
import java.util.Scanner;

public class P29_30 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[5];
        long total=0;

        System.out.println("Enter 5 Numbers");
        for(int i=0;i<5;i++){


            System.out.print("Arr["+i+"]: ");
            
            String stringNum=sc.nextLine();
           try {
               nums[i]=Integer.parseInt(stringNum);
               total+=nums[i];

                
            } catch (NumberFormatException e) {  //possibility of NumberFormatException

                System.out.println("NumberFormatException exception ignored"+stringNum);
               
            }


        }


        System.out.println("total of 5 numbers "+Arrays.toString(nums)+" is "+total);
    }
}
