package Java8.ThirdExample;

import java.io.BufferedReader;

@FunctionalInterface
public interface BufferedReaderInterface {

    public String process(BufferedReader b);
}

/**
 *
 * The above interface is specfic to the Buffered Reader class, but if we want it to make more generic we can use
 *
 * below
 *
 * public interface Consume<T>{
 *     public String process(T t);
 * }
 *
 *
 * **/
