public class Printing_Reverse_Number
{
    public static void main(String[] args) {
        int n=345786;
        while(n>0)
        {
            int last_digit=n%10;
            System.out.println(last_digit);
            n/=10;
        }
        System.out.println();
    }
}
