public class Max_SubArray_Sum_Using_Prefix_Sum
{
    public static void max_Subarray_Sum(int array[])
    {
        int currSum=0;
        int max=Integer.MIN_VALUE;

        int prefix[]=new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i< array.length;i++)
        {
            prefix[i]=prefix[i-1]+ array[i];
        }

        for(int i=0;i<array.length;i++)
        {
            int start=i;
            for(int j=i;j<array.length;j++)
            {
                int end=j;
                currSum=0;
                currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];

            }
            if(currSum>max)
            {
                max=currSum;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};

        max_Subarray_Sum(array);
    }
}
