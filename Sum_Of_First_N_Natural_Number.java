public class Sum_Of_First_N_Natural_Number
{
    public static void main(String[] args) {
        int n=10;
        int i=0;
        int sum=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
