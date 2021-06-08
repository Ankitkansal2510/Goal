package Casting;

public class Engineer extends Employee{

    private String deptName;
    public Engineer(int empId,String empName,String deptName){
        super(empId,empName);
        this.deptName=deptName;
    }
    public void  setDeptName(String deptName){
        this.deptName=deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }

}

