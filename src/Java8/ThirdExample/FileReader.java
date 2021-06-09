package Java8.ThirdExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static String processFile()  {
        /**
         * Here this code will only return the first line of the file
         * but what if we want to return the first two lines ,
         *
         * this is something related to changing the behaviour and to solve this
         * lambda is a best way of doing it
         *
         * but we know lambda can be used only in the context of the functional interface,
         * so lets go and define the functional interface which contain one abstract method
         * */
        try(BufferedReader br=new BufferedReader(new java.io.FileReader("D:\\Test.txt"))){
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static  String lamdaProcessFile(BufferedReaderInterface b){
        try(BufferedReader br=new BufferedReader(new java.io.FileReader("D:\\Test.txt"))){
          return b.process(br);
        }
        catch(IOException e){
            e.printStackTrace();
        }
       return null;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(processFile());
        System.out.println("Printing in lambda Fashion");
        //Reading and printing only one line

        //Now we will change the behaviour at run time and print the two lines from the test file
        System.out.println();
        System.out.println(lamdaProcessFile((BufferedReader b)-> {
            try {
                return b.readLine() + " " +  b.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }));

    }
}
