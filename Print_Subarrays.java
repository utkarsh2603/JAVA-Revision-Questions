public class Print_Subarrays
{
    public static void print_subarrays(int array[])
    {
        for(int i=0;i< array.length;i++)
        {
            int start=i;
            for(int j=i+1;j<array.length;j++)
            {
                int end=j;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};

        print_subarrays(array);
    }
}
