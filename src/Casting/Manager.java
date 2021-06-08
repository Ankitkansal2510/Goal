package Casting;

public class Manager extends Employee{

    private int managerSalary;
    public Manager(int empId,String empName,int managerSalary){
        super(empId,empName);
        this.managerSalary=managerSalary;
    }

    public void setManagerSalary(int managerSalary){
        this.managerSalary=managerSalary;
    }

    public int getManagerSalary(){
        return this.managerSalary;
    }
}
