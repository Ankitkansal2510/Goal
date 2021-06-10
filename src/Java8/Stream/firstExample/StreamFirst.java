package Java8.Stream.firstExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class Menu{
    private Integer calorie;
    private String name;

    public Menu(Integer calorie, String name) {
        this.calorie = calorie;
        this.name = name;
    }

    public Integer getCalorie() {
        return calorie;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  calorie  + " "  + name ;
    }
}
public class StreamFirst {

    public static void main(String[] args) {
        List<Menu> listMenu=new ArrayList<>();
        listMenu.add(new Menu(500,"Pastry"));
        listMenu.add(new Menu(300,"egglessPastry"));
        listMenu.add(new Menu(400,"Cookies"));
        listMenu.add(new Menu(600,"brownie"));
        listMenu.add(new Menu(200,"Dosa"));

        List<Menu> lowCalorieDish=new ArrayList<>();
        for(Menu m:listMenu){
            if(m.getCalorie()<500){
                lowCalorieDish.add(m);
            }
        }
        System.out.println("Before Sorting");
        System.out.println(lowCalorieDish);

       // lowCalorieDish.sort(Comparator.comparing(Menu::getCalorie));one way of sorting
        //lowCalorieDish.sort((m1,m2)->m1.getCalorie().compareTo(m2.getCalorie())); second way of sorting
        //Below Collections.sort way is using anonymous class used before java 7
        Collections.sort(lowCalorieDish, new Comparator<Menu>() {
            @Override
            public int compare(Menu o1, Menu o2) {
                return o1.getCalorie().compareTo(o2.getCalorie());
            }
        });
        System.out.println("After Sorting");
        System.out.println(lowCalorieDish);

        List<String> lowCalorieDishName=new ArrayList<>();
        for(Menu m:lowCalorieDish){
            lowCalorieDishName.add(m.getName());
        }
        System.out.println("Getting the name of the lowCalorie Dish");
        System.out.println(lowCalorieDishName);

        /**
         * Here we have done three actions
         * 1. We have collected the dishes whose calorie is less than 500
         * 2.We have sorted the dishes
         * 3.We have get the name of the dishes from step 2
         *
         * to achieve this thing we have to first filter the dishes than sort it and then collect it
         * It takes lot of code and time to perform these actions
         * Using Stream api this task can be done very easy and with just few lines of code
         * **/
        System.out.println();
        System.out.println("Before any operation the actual listMenu");
        System.out.println(listMenu);
        System.out.println();
       List<String> streamLowCalorieDshName= listMenu.stream().filter((m)->m.getCalorie()<500)
                         .sorted(Comparator.comparing(Menu::getCalorie))
                         .map(Menu::getName) // or .map(d->d.getName()) map is used to extract the information
                         .limit(1) // this will collect the only 1 item from the stream
                         .collect(toList());

        System.out.println("After performing stream collection ");
        System.out.println(streamLowCalorieDshName);
    }

}
