public class Sort {
    public static void main(String[] args) {
        int arr[]={10,5,2,1,23,54};
        int arr1[]={-10,-5,2,1,23,54};
        int arr3[]={1};
        int arr2[]={0,0};
        int arr4[]={};

        bubbleSort(arr2);
        for(int i=0;i< arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }

    private static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
