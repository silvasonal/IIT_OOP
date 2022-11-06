package Question2;

class Employee {

    private String Employee_Name;
    private double Employee_Salary;
    
    //default constructor
    public Employee(){

    }

    // constructor with two parameters
    public Employee(String name , double salary){
        this.Employee_Name = name;
        this.Employee_Salary = salary;
    }

    public String getEmployeeName(){
        return Employee_Name;
    }

    public double getEmployeeSalary(){
        return Employee_Salary;
    }

   




}
