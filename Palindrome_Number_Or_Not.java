public class Palindrome_Number_Or_Not
{
    public static int palindrome(int num)
    {
        int rev=0;
        while(num!=0)
        {
            int last_digit=num%10;
            rev=(rev*10)+last_digit;
            num=num/10;
        }
        return rev;

        }


    public static void main(String[] args) {
        int number=500;

       int rev= palindrome(number);

       if(number==rev)
       {
           System.out.println("Palindrome");
       }
       else
       {
           System.out.println("Not Palindrome");
       }
    }
}
