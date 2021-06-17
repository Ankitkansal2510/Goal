package Java8.Stream.Quiz.SecondQuiz;

public class Trader {
    private final String name;
    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return  name + " " + city ;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
