public class Trapping_Rainwater
{
    public static int trapping_Rainwater(int array[])
    {
        int n=array.length;
        int leftmax[]=new int[array.length];
        leftmax[0]= array[0];
        for(int i=1;i< array.length;i++){
            leftmax[i]=Math.max(array[i],leftmax[i-1]);
        }

        int rightmax[]=new int[array.length];
        rightmax[n-1]=array[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(array[i],rightmax[i+1]);
        }

        int totalTrappedWater=0;
        for(int i=0;i<array.length;i++)
        {
            int waterLevel=Math.min(rightmax[i],leftmax[i]);
            totalTrappedWater+=waterLevel- array[i];
        }
        return totalTrappedWater;

    }
    public static void main(String[] args) {
        int array[]={4,2,0,6,3,2,5};

        System.out.println(trapping_Rainwater(array));
    }
}
