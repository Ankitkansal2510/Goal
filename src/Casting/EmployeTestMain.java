package Casting;

public class EmployeTestMain {
    public static void main(String[] args) {
        Employee emp=new Engineer(1,"Ankit","Engineer");//This is known as Upcasting
        Employee emp1=new Manager(2,"Boss",100000);
        System.out.println(String.format("%s%n%s%n",emp.getEmpId(),emp.getEmpName()));//Here using the Employee
        System.out.println(String.format("%s%n%s%n",emp1.getEmpId(),emp1.getEmpName()));//Example of upcasting as , manager is type of employee so compiler implicitly does type casting for us
        //reference variable we are able to call the method , this is upcasting and compiler implicitly does it for us
        /**
         *
         * now what if we want to access the method of engineer class using the reference of the employee class
         * this is not directly posible as compiler dont know that Employee is an engineer
         * so this is the casting from the super class to the subclass
         * This is known as downcasting , and we have to explicitly do it , compiler wont do it for us,
         * AS we need to tell the compiler that employee is a superclass of the engineer
         */
        System.out.println(((Engineer) emp).getDeptName());
        System.out.println(((Manager)emp1).getManagerSalary());
    }
}
