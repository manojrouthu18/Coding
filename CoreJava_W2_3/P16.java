public class P16 {
    public static void main(String[] args) {
        FactoryEmployee e1=new FactoryEmployee(12, "manoj", 120000,1211, "madhurawada");

        e1.displayFactoryEmployee();
    }
}


class Employee {


    //protected suitable for inheritance 
    protected int empId;
    protected String empName;
    protected double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("employee ID : " + empId);
        System.out.println("employee Name : " + empName);
        System.out.println("salary    : " + salary);
    }
}



class FactoryEmployee extends Employee {

    private int busNo;
    private String empBoards; // location or boarding point

    FactoryEmployee(int empId, String empName, double salary,
                    int busNo, String empBoards) {

        super(empId, empName, salary); 
        this.busNo = busNo;
        this.empBoards = empBoards;
    }

    public void displayFactoryEmployee() {
        displayEmployee();  // inherited method
        System.out.println("Bus No     : " + busNo);
        System.out.println("Boards At  : " + empBoards);
    }
}
