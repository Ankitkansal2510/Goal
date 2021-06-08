public class UniqueElement {
    public static void main(String args[])
    {
        int arr[]=  {1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8};
        int arr1[]={1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8};
        int element=findUniqueElement(arr1);
        System.out.println("Unique element is : " + element);
    }

    private static int findUniqueElement(int arr[])
    {
        int n=arr.length;
        int result=-1;
        for(int i=0;i<n-1;i+=2)
        {
            if(arr[i]!=arr[i+1]){
                result=arr[i];
                break;
            }

        }
        if(arr[n-2]!=arr[n-1])
        result=arr[n-1];
        return result;

       /* int XOR=0;
        for(int i=0;i<arr.length;i++)
        {
            XOR=XOR^arr[i];
        }
        return XOR;*/
    }


}
