public class Printing_Reverse_Array
{
    public static void printing_reverse(int array[])
    {
        int start=0;
        int end= array.length-1;
        while(start<=end)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int array[]={23,45,67,23,14,76};

        printing_reverse(array);

        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
