import java.util.Scanner;

public class Quadratic_Equation
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        double d=Math.sqrt(b*b-(4*a*c));
        if(d>0)
        {
            double r1=(-b+d)/2*a;
            double r2=(-b-d)/2*a;

            System.out.println("The roots are "+r1+" and "+r2);
        }

        else if(d==0)
        {
            //r1==r2
            double r1=(-b)/2*a;
            System.out.println("The roots are: "+r1);
        }

        else
        {
            System.out.println("Roots are not Real");
        }


    }
}
