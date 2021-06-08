import java.util.Arrays;
import java.util.HashSet;

public class unielem {
    public static void main(String[] args) {
        int arr[]={2,2,5};
        int sum=4;
       printPair(arr,sum);
    }

    private static void printPair(int arr[],int sum) {
        HashSet<Integer> hset=new HashSet<>();
        for(int i=0;i< arr.length;i++)
        {
            int target=sum-arr[i];
            if(hset.contains(target)){
                System.out.println(arr[i]+ " " + target);
            }
            hset.add(arr[i]);
        }
    }
}
