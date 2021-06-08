package Lambdas.SecondExample;

import java.util.concurrent.Callable;

//In this class we will explore some of the exisiting functional interfaces
//Such as Runnable and callable,both runnable and callable has only one statment so they can be used for lambda
public class RunnablesLamba {

    public void methodAcceptingRunnable(Runnable r){
        r.run();
    }

    public void methodAcceptingCallable(Callable c) throws Exception {
        String s=(String)c.call();
        System.out.println(s);
    }

    public static void main(String[] args) throws Exception {
        RunnablesLamba runnablesLamba=new RunnablesLamba();
        /**
         * In below example we are calling method methodAcceptingRunnable which accept Runnable interface
         * Since We know Runnable interface contains only one method that is Run
         * If we see the defination of the runnable interface run method
         * we will find run method doesnot accept any argument and also doesnt return any thing
         * **/
        runnablesLamba.methodAcceptingRunnable(()-> System.out.println("Runnable interface"));

        //or we can directly call the run method using lambda
        ///below , we are calling the run , and using thread we are invoking run method as thread
        //automatically invoke thread method

        Runnable r=()-> System.out.println("Directly calling the run method of the runnable");
        new Thread(r).start();

        /**In below we are calling methodAcceptungcallable
         * this method accepts callable interface which is functional interface as it contains only one method
         * i.e call , which doesnt accepts any argument but it return object V
         * **/
        runnablesLamba.methodAcceptingCallable(()->"Hello Callable");
    }
}
