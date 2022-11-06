package Question2;

public class Test {
    
    public static void main(String[] args) {

        Employee employee_details = new Employee("Sonal",9000);

        String Employee_Name = employee_details.getEmployeeName();        
        double Employee_Salary = employee_details.getEmployeeSalary();

        System.out.println(Employee_Name + Employee_Salary);
    

    }
}
