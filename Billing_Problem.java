import java.util.Scanner;

public class Billing_Problem
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();

        float total=pencil+pen+eraser;
        float tax_on_total=(18*total)/100;

        float total_inc_tax=total+tax_on_total;

        System.out.println(total);
        System.out.println(tax_on_total);
        System.out.println(total_inc_tax);
    }
}
