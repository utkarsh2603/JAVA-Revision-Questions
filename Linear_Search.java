public class Linear_Search {

    public static int linear_Search(int array[],int key)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={23,43,12,52,34,52};
        int key=133;

        int atIndex=linear_Search(array,key);

        if(atIndex==-1)
        {
            System.out.println("Key not found");
        }
        else
            System.out.println("Key found at: "+atIndex);
    }
}
