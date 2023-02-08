public class Sum_Of_Digit
{
    public static int digitSum(int num)
    {
        int sum=0;
        while(num!=0)
        {
            int last_digit=num%10;
            sum=sum+last_digit;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int number=13457;

        System.out.println(digitSum(number));
    }
}
