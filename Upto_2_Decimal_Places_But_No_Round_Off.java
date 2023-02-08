import java.math.BigDecimal;
import java.math.RoundingMode;

public class Upto_2_Decimal_Places_But_No_Round_Off
{
    public static void main(String[] args) {
        double n=12.3678;

        BigDecimal bd =  BigDecimal.valueOf(n);
        bd = bd.setScale(2, RoundingMode.DOWN);
        System.out.println("Value: " + bd);


    }
}
