public class Pattern_10
{
    public static void main(String[] args) {
        //upper half
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            //stars
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
