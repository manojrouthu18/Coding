
 
// 20. Write a program to accept a string from the user and display it vertically. use nextLine() to read a string from the user.
import java.util.*;
public class P20{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String stArr[]=st.split(" ");
        System.out.println(Arrays.toString(stArr));

        for(String s:stArr){
            System.out.println(s);
        }


    }



}
