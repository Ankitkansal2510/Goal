package SelfPractiseQuestions.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,15,100};
        int largestElement=findLargestElement(arr);
        System.out.println(largestElement);
    }
    private static int findLargestElement(int arr[]){
        int maxElement=arr[0];
        for(int i=1;i<arr.length;i++){
            if(maxElement<arr[i]){
                maxElement=arr[i];
            }

        }
        return maxElement;
    }
}
