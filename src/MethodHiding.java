class A{

    public  static void testStaticMethod(){
        System.out.println("Inside super class");
    }
}

public class MethodHiding extends A{

    public  static void testStaticMethod(){
        System.out.println("Inside MethodHiding class");
    }

    public static void main(String[] args) {
        MethodHiding methodHiding=new MethodHiding();
        methodHiding.testStaticMethod();
        A s=new MethodHiding();
        s.testStaticMethod();

    }

}
