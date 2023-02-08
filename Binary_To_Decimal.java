public class Binary_To_Decimal
{
    public static void binTodec(int bin)
    {
        int dec=0;
        int pow=0;
        while(bin>0)
        {
            int last_digit=bin%10;
            dec=dec+(last_digit*((int)Math.pow(2,pow)));
            pow++;
            bin=bin/10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        int number=1100110011;
        binTodec(number);
    }
}
