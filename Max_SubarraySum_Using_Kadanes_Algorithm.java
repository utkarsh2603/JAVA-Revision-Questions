public class Max_SubarraySum_Using_Kadanes_Algorithm
{
    public static void max_subarraySum(int array[])
    {
        int currSum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++)
        {
            currSum+=array[i];
            if(currSum<0){
                currSum=0;
            }
            if(currSum>max)
            {
                max=currSum;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10};

        max_subarraySum(array);
    }
}
