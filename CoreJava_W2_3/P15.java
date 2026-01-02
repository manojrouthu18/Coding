/*
15. Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
—> Courses are: JAVA, PYTHON.
—> The total fees for java is 10k and for python is 7.5k.
—> Provide a constructor to take required details.The default course is JAVA.
—> Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount). */


public class P15 {
    
    public static void main(String[] args) {

        Student s1=new Student(10, "manoj", 0);
        Student s2=new Student(10, "mohan", 0,"PYTHON");
        s1.printDetails();
        s2.printDetails();

        
    }
}


class Student{
   private int adminNo;
   private String stuName;
   private String courseJoined;
   private double feesPaid;

    public static final String JAVA="JAVA";
    public static final String PYTHON="PYTHON";

    public static final double JAVA_FEE = 10000;
    public static final double PYTHON_FEE = 7500;

      Student(int adminNo,String stuName,double feesPaid){
        this.adminNo=adminNo;
        this.stuName=stuName;
        //default
        this.courseJoined=JAVA;
        this.feesPaid=feesPaid;

    }

    //allows course selection

    Student(int adminNo,String stuName,double feesPaid,String courseJoined){
        this.adminNo=adminNo;
        this.stuName=stuName;
        this.courseJoined=courseJoined;
        this.feesPaid=feesPaid;

    }

    
     double getFeePaid(){

        return feesPaid;

    }

     double getTotalFee(){

        if(courseJoined.equals(JAVA))
            return JAVA_FEE;

        else if(courseJoined.equals(PYTHON))
            return PYTHON_FEE;

        else return 0;


        

    }

     double getDue(){

        return getTotalFee() -getFeePaid();
        
    }


    void payment(int amount){

        if(amount<0){
            System.out.println("Invalid amount enetere...");
            return ;
        }


        if (feesPaid + amount > getTotalFee()) {
            System.out.println("Payment exceeds total fee");
            return;
        }

        feesPaid += amount;
        System.out.println("Payment successful: " + amount);

    }


    void printDetails(){
        System.out.println(stuName+" "+" feepaid: "+feesPaid+" due:"+getDue());
    }

}
