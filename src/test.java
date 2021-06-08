import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class test {
    int id=9;
    String name="nkjh";

    @Override
    public String toString() {
        return "test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void F1(int...nums){////this is called varaible arguments (varargs) , at run time we can pass any number of arguments

        int sum=0;
        System.out.println("Length of the nums is : " + nums.length);
        for(int x:nums){
            sum+=x;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
   test t=new test();
        System.out.println(t);
        test.F1(10,20,30);
        test.F1(20,2);

        List<Integer> list=new ArrayList<>();
        list.add(0,10);
        list.add(0,20);
        list.add(1,30);
        System.out.println(list);
    }
}