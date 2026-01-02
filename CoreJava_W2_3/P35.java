import java.io.*;

public class P35{
    public static void main(String[] args) {


        try( BufferedReader br=new BufferedReader(new FileReader("P20.Java"))){
           
             String line;

             while( (line=br.readLine()) != null){

                if(line.length()>5){
                    System.out.println(line);
                }
                
             }

            
           

        }catch (Exception e) {
            System.out.println(e);
        }
        
    }


}