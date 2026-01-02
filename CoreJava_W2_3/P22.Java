// 22. Write a program to accept a string and display the position of space for all spaces.

import java.util.Scanner;
import java.util.*;
public class P22{


       public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String st=sc.nextLine();

        int index=st.indexOf(" ");
       
        while(index!=-1){
            
            System.out.println(index);
            index = st.indexOf(" ", index + 1);
        }
       


       }
}