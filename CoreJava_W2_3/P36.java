import java.io.BufferedReader;
import java.io.FileReader;

public class P36 {
    public static void main(String[] args) {


         try( BufferedReader br=new BufferedReader(new FileReader("marks.txt"))){
           
             String line;
             int lineNo=1;

             while( (line=br.readLine()) != null){


                String marks[]=line.split(",");

               int lineTotalMarks=calcSum(marks);
               System.out.println("Line "+lineNo+": "+lineTotalMarks);

                
               lineNo++;
             
                
             }

            
           

        }catch (Exception e) {
            System.out.println(e);
        }
    }


    //calculates total marks of a line
    public static int calcSum(String[] marks){

        int sum=0;


        for(String mark: marks){

            try {

            sum+=Integer.parseInt(mark);
                
            } catch (Exception e) {
                System.out.println(e+" with "+mark);
            }
        }
         return sum;
    }
}
