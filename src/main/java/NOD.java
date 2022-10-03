import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NOD {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(NOD(scanner.nextInt(), scanner.nextInt()));
    }

    public static int NOD(int num1, int num2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                set.add(i);
            }
        }
        int[] max = {0};
        set.forEach(o -> {
            if (num2 % o == 0) {
                if (max[0] < o) {
                    max[0] = o;
                }
            }
        });
        return max[0];

    }
}
