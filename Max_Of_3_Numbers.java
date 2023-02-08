public class Max_Of_3_Numbers
{
    public static void main(String[] args) {
        int a=54;
        int b=45;
        int c=63;

        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if(b>c)
        {
            System.out.println(b);
        }
        else
            System.out.println(c);
    }
}
