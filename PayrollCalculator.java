class Employee {
    int id = x ;
    String name;

}


class SalaryEmployee extends Employee (int x) {
    System.out.println("Salary of an employee",+x);
 
}

class HourlyEmployee extends Employee (int x) {
    System.out.println("Salary of an employee",+x);
 
}

class CommissionEmployee extends SalaryEmployee (int x) {
    System.out.println("Salary of an employee",+x);
 
}

Interface IPayrollCalculator{
    int id = x ;
    String name;

public void calculate_payroll(int x) {
    
}
}


public class class PayrollCalculator {
    public static void main(String[] args) {
        
    }
}

