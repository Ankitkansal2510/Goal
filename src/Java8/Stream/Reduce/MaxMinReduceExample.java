package Java8.Stream.Reduce;

import sun.awt.SunToolkit;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    private final Integer id;
    private final String name;

    @Override
    public String toString() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class MaxMinReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //This program will demonstrate how to find maximum and minimum

        int maxMethodRef= list.stream().reduce(0,Integer::max);
        int maxLambda=list.stream().reduce(0,(a,b)->a>b?a:b);
        Optional<Integer> maxOptional=list.stream().reduce(Integer::max);
        Optional<Integer> minValue=list.stream().reduce(Integer::min);

        System.out.println("Using method reference : " + maxMethodRef);
        System.out.println("using lamnda expression : " + maxLambda);
        System.out.println("using maxOptional expression : " + maxOptional);
        System.out.println("Minimum value : " + minValue);
        // we have used max with reduce , but we can ue max method on stream directly

        Optional<Integer> maxOnStream=list.stream().max(Comparator.comparing(Integer::intValue));
        System.out.println(maxOnStream);
        //or
        Optional<Integer> maxInteger=list.stream().max((Number i,Number j)-> i.intValue()- j.intValue());
        System.out.println(maxInteger);


        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(1,"Zack"));
        employeeList.add(new Employee(4,"Ankit"));
        employeeList.add(new Employee(2,"BOB"));


        /**
         * max() is a method of Stream interface,it takes Comparator(? super T) and returns Optional<T>
         *
         *     ? super T means lower bound generic meaning it can take T or all the super classes of T
         *
         *     in the below example WE have class Employee so in the max , we can pass of type employee
         *     inside the comparator method or we can pass super class of employee , in this case
         *     it is object , so comparaotr will take both Employee or its super class
         *
         * */
        Optional<Employee> maxEmployee=employeeList.stream().max((Employee i,Employee j)->i.getId().compareTo(j.getId()));
        Optional<Employee> maxName=employeeList.stream().max((Object i,Object j)->i.toString().compareTo(j.toString()));
        List<Employee> maxe=employeeList.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
        System.out.println(maxEmployee);
        System.out.println(maxName);
        System.out.println("USing Comparator.comparing method: " + maxe);


    }
}
