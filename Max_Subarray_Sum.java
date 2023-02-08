public class Max_Subarray_Sum
{
    public static void subarray_sum(int array[])
            {
                int sum=0;
                int max=Integer.MIN_VALUE;
                for(int i=0;i< array.length;i++)
                {
                    int start=i;
                    for(int j=i+1;j<array.length;j++)
                    {
                        int end=j;
                        sum=0;
                        for(int k=i;k<=j;k++)
                        {
                            sum+=array[k];
                        }
                        if(sum>max) {
                            max = sum;
                        }
                    }
                }
                System.out.println(max);
            }
            public static void main(String[] args) {
                int array[]={1,2,3,4,5};

                subarray_sum(array);
            }
        }

