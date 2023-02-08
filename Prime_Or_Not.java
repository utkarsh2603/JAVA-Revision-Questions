public class Prime_Or_Not
{
    public static void main(String[] args) {
        int number=79;

        if(number==2)
        {
            System.out.println("Prime");
        }
        else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println("Not prime");
                }

                else
                    {
                        System.out.println("Prime");
                    }
                break;
                }
        }
    }
}
