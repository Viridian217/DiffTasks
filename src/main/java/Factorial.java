import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
Factorial
*/

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigInteger integer = new BigInteger("1");
        if (n <= 150 && n > 0) {
            for (int i = 1; i <= n; i++) {
                integer = integer.multiply(BigInteger.valueOf(i));
            }
            return integer.toString();
        } else if (n == 0) {
            return "1";
        } else if (n < 0) {
            return "0";
        }
        return "";
    }
}
