package Java8.Lambdas.FirstExample;

public class CreatingLambda {

    public void printGreeting(String name,Greeting greeting){
        String result=greeting.sayHello(name);
        System.out.println(result);
    }

    public static void main(String[] args) {
        CreatingLambda creatingLambda=new CreatingLambda();
        //now we will create lambda and pass it to the method printGreeting
        //(String a)->"Hello " + a; or (a)->"Hello " + a;

        creatingLambda.printGreeting("Ankit " , (String a)->"Hello " + a);

        creatingLambda.printGreeting("",(String a)->!a.isEmpty()?"Hello "+a:"Name is emplty");
    }
}
