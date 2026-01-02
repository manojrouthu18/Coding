import java.util.*;
public class P5 {
    public static void main(String[] args) {

         int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  5 numbers");
       
        for(int i=0;i<5;i++)
            arr[i] = sc.nextInt();
        sc.close();

        int s = 0;
        for(int i : arr)
            s += i;


        System.out.println("The avg  " + s / 5);
        
    }
}
