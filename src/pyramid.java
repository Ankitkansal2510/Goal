public class pyramid {
    public static void main(String[] args) {
        int n=5;
        printPyramid(n);
    }

    private static void printPyramid(int n)
    {
        int number=n;
        for(int i=1;i<n;++i)
        {

            int spaces=n-i;
            int stars=(i-1)*2+1;
            for(int j=1;j<=spaces;++j)
            {
                System.out.print(' ');
            }
            for(int j=1;j<=stars;++j)
            {
                    System.out.print(number);
            }
            System.out.println();
           number--;
        }
    }
}
