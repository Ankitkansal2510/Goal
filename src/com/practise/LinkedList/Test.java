package com.practise.LinkedList;
class A
{
    void A1()
    {
        System.out.println("Inside class A");
    }
}
public class Test extends A{
    void A1()
    {
        System.out.println("Inside clas Test");
    }

    public static void main(String[] args) {
        A a=new A();
        a.A1();

        A a1=new Test();
        a1.A1();

        //Test t1=new A();

    }
}
