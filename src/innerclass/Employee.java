package innerclass;

public class Employee {

    private class EmployeHelper{

        private final int bonus;

        private EmployeHelper(int bonus){
            this.bonus=bonus;
        }

        private int calSalary(){
            return salary*bonus;
        }
    }
    private String name;
    private int salary;
    EmployeHelper employeHelper=new EmployeHelper(1000);

    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    public int getWitholding(){
       return employeHelper.calSalary();
    }
}
