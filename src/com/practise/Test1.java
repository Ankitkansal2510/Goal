package com.practise;



public class Test1 {
    public static void main(String[] args) {
      decreaseNumberbyone(2);

    }
    public static void decreaseNumberbyone(int num){
        if(num>=0){
            decreaseNumberbyone(num-1);
        }
        System.out.println(num);
    }


}





