public class Binary_Search
{
    public static int binary_Search(int array[],int key)
    {
        int start=0;
        int end= array.length-1;

        while(start<=end)
        {
            int mid=(start+end)/2;

            if(array[mid]==key)
            {
                return mid;

            }
            if(array[mid]>key)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={22,12,45,23,43,65,44};
        int key=20;

        binary_Search(array,key);

        int atIndex=binary_Search(array,key);

        if(atIndex==-1)
        {
            System.out.println("Key not found");
        }
        else
            System.out.println("Key found at: "+atIndex);
    }

}
