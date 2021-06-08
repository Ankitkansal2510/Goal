package com.practise.array;

import java.util.*;

class Student
{
    int id;
    String name;

    public Student(int id , String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class sortById implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return a.id-b.id;
    }
}

class sortByName implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}
public class Employee {

    int id;
    int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.setId(10);
        e2.setId(20);
        e3.setId(10);
        e1.setSalary(200);
        e2.setSalary(100);
        e3.setSalary(150);


        List<Employee > list =new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);


         list.sort(Comparator.comparing(Employee::getSalary));

       for(int i=0;i<list.size();i++)
       {
           System.out.println(list.get(i).getSalary());
       }

      List<Student> list1=new ArrayList<>();
       list1.add(new Student(3,"Ankit"));
        list1.add(new Student(1,"Cnkit"));
        list1.add(new Student(2,"Bnkit"));

        Collections.sort(list1,new sortById());

        for(int i=0;i<list1.size();i++)
        {
            System.out.println(list1.get(i).getId());
        }

        Collections.sort(list1,new sortByName());
        for(int i=0;i<list1.size();i++)
        {
            System.out.println(list1.get(i).getName());
        }
    }
}
