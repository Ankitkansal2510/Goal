package com.practise.array;
class Customer
{
    int amount=1000;
    synchronized void withdraw(int amount)
    {
        System.out.println("going to withdraw");
        if(this.amount<amount)
        {
            System.out.println("less balance , waiting for deposit "  + this.amount );
            try{
                wait();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        this.amount-=amount;
        System.out.println("Withdraw completed " + this.amount);
    }
    synchronized  void deposit(int amount)
    {
        System.out.println("Processing to deposit");
        this.amount+=amount;
        System.out.println("depoist completed" + amount);
        notify();
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Customer customer=new Customer();
        new Thread(){
            public void run()
            {
                customer.withdraw(15000);
            }
        }.start();

        new Thread(){
            public void run()
            {
                customer.deposit(10000);
            }
        }.start();
    }
}
