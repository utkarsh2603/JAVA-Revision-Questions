public class Print_Prime_In_Range
{
    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }

    public static void primeInRange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int number=15;

        primeInRange(number);
    }
}
