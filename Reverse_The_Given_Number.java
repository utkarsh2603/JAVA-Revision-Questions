public class Reverse_The_Given_Number
{
    public static void main(String[] args) {
        int num=23453;
        int rev=0;
        while(num>0)
        {
            int last_digit=num%10;
            rev=(rev*10)+last_digit;
            num=num/10;
        }
        System.out.println(rev);
    }
}
