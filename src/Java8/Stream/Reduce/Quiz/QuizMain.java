package Java8.Stream.Reduce.Quiz;

//Find how many dishes are available
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Dish{
    private final int calorie;
    private final String DishName;

    public Dish(int calorie, String dishName) {
        this.calorie = calorie;
        DishName = dishName;
    }

    @Override
    public String toString() {
        return  calorie + DishName;
    }

    public int getCalorie() {
        return calorie;
    }

    public String getDishName() {
        return DishName;
    }
}
public class QuizMain {

    public static void main(String[] args) {

        List<Dish> dishList=new ArrayList<>();
        dishList.add(new Dish(100,"Burger"));
        dishList.add(new Dish(150,"Pizza"));
        dishList.add(new Dish(130,"Sandwhich"));
        dishList.add(new Dish(300,"HotDog"));

        //count the number of dishes in a stream using the map and reduce methods?

        /**
         * We will solve this problem by mapping each element of stream into number 1
         * and thn summing them using reduce
         *
         * */
       int result=dishList.stream().map(d->1).reduce(0,(a,b)->a+b);
       // or we can use the below count method
       long count=dishList.stream().count();

        System.out.println("Using map and reduce logic : " + result);

        System.out.println("Using count directly on stream : " + count);

    }
}
