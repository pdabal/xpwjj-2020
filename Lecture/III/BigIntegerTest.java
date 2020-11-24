import java.math.*;
import java.util.*;

public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ile liczb ma być wylosowanych? ");
        int k = in.nextInt();
        System.out.print("Jaka jest górna granica przedziału losowanych liczb? ");
        int n = in.nextInt();
        /*
         * Obliczanie współczynnika dwumianowego n*(n–1)*(n–2)*…*(n–k+1)/(1*2*3*…*k)
         */
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        System.out.println("Twoje szanse to 1 do " + lotteryOdds + ". Powodzenia!");
    }
}
