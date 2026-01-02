
 
// 18. Write a program to guess the random number in three attempts. The range is (1 to 25).

import java.util.Scanner;

public class P18{
    public static void main(String[] args) {

         int min=1;
        int max=25;
       
        Scanner sc=new Scanner(System.in);


        int target=GenerateRandom(min, max);
        int guess;
        int attempts=3;
        int flag=0;
        System.out.println("Guess the number between"+max+" and "+min);

        while(true & attempts>0){
             
            guess=sc.nextInt();
            attempts--;

            if(guess==target){
                flag=1;
                System.out.println("Congratulations , you guessed it right !!");
                break;
            }else if(guess>target){
                System.out.println("Oops, Too high :"+attempts+" left");

            }else{
                System.out.println("Oops, Too low :"+attempts+" left");


            }


        }
        if(flag==0)
        System.out.println("End of the Game...target is: "+target);
        sc.close();
        
    }


    public static int GenerateRandom(int min,int max){
      return (int)(Math.random()*(max-min+1))+min;
    }
     

}
