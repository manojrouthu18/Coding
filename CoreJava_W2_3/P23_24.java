//23. Write a program to take a String and invert the case of characters.
//  24. Go to the previous classes and override equals(), toString(), hashCode().


import java.util.Scanner;

public class P23_24 {
    int id;

    //construtor
    P23_24(int id){
        this.id=id;
    }


    @Override
    public String toString() {

         return "overridden toString() method from object with id "+id;
    }

    @Override
    public int hashCode() {
        System.out.println("Overriden hashcode() called from P23");

        return id;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Overridden equals)() called from P23");
        return this.id==((P23_24)obj).id;
    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String st=sc.nextLine();

        StringBuilder sb=new StringBuilder();

        for(char ch:st.toCharArray()) {
          if(Character.isUpperCase(ch)){
              sb.append(Character.toLowerCase(ch));
          }else if(Character.isLowerCase(ch)){
              sb.append(Character.toUpperCase(ch));

          }else{

              sb.append(ch);


          }


        }

        System.out.println("inverted : "+new String(sb));
        System.out.println("--overriden methods exe--");

        //call overriden toString()
        System.out.println(new P23_24(9));

       //call overriden equals() method
        P23_24 obj1=new P23_24(10);
        P23_24 obj2=new P23_24(10);
        System.out.println("are this objects eql ?: "+ obj1.equals(obj2));

        System.out.println("hashcode of obj1 :"+obj1.hashCode());


    }
}


