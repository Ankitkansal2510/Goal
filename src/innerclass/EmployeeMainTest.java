package innerclass;

public class EmployeeMainTest {
    public static void main(String[] args) {
        Employee john=new Employee("John",1000);
        Employee jimmy=new Employee("jimmy",23444);
        System.out.println(String.format("%s%n",john.getWitholding()));
        System.out.println(jimmy.getWitholding());

    }
}
