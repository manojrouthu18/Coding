import java.util.Arrays;

public class P19 {
    public static void main(String[] args) {
        int[] randomArr=new int[10];

        
        //generate 10 random values  
        int sum=0;
        for(int i=0;i<10;i++){
            // randomArr[i]=P18.GenerateRandom(1,10);
            randomArr[i]=(int)(Math.random()*10)+1;

            sum+=randomArr[i];  // adding to sum variable simultaneusly
        }

        double avg=sum/10;

        System.out.println("Random Array :"+Arrays.toString(randomArr));
        System.out.println("It's avg :"+avg);

        System.out.println("elements greater than avg");
        for(int el:randomArr){
            if(el>avg)
            System.out.println(el);
        }

        
    }

    
}
