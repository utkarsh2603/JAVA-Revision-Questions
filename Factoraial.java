public class Factoraial
{
    public static int factorial(int num)
    {
        int fact=1;
        while(num>0)
        {
            fact=fact*num;
            num--;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num=10;

        System.out.println(factorial(num));
    }
}
