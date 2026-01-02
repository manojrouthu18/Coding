//21. Write a program to accept a string that contains marks separated by commas and display total.
 
import java.util.*;
public class P21{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks separated by commas: ");
        String st=sc.nextLine();
        String stArr[]=st.split(",");

        //show marks 
        System.out.println(Arrays.toString(stArr));

        int totoalMarks=0; 
        for(String s:stArr){
            totoalMarks+=Integer.parseInt(s);
        }
        System.out.println("total Marks : "+totoalMarks);


    }



}
