public class Largest_In_Array {
    public static int largest(int array[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i< array.length;i++)
        {
            if(array[i]>largest)
            {
                largest=array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int array[] = {23, 42, 12, 34, 65, 34, 27, 36};

        System.out.println(largest(array));
    }
}