public class Pattern_11
{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            //stars
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("*");
            }
            //spaces

            System.out.println();

        }
    }
}
