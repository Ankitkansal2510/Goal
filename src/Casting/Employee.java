package Casting;

public class Employee {

    private int empId;
    private String empName;
    public Employee(int empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId(){
        return empId;
    }
}
