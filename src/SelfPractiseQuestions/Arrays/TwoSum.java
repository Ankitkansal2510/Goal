package SelfPractiseQuestions.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=26;
        TwoSumIndicies(arr,target);
    }
    private static void TwoSumIndicies(int arr[],int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int sum=target-arr[i];
            if(map.containsKey(arr[i])){
                System.out.println("Two indicies adding which will give the result : " +
                        "" + "{ " + i + ", " + map.get(arr[i]) + " } ");
            }
            map.put(sum,i);
        }
    }
}
