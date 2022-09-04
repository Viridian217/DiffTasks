package reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountOfSpace {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             FileReader reader = new FileReader(scanner.nextLine())) {
            int total = 0;
            int count = 0;
            while (reader.ready()) {
                if (reader.read() == 32) {
                    count++;
                }
                total++;
            }

            if (total != 0) {
                double result = (double) count / total * 100;
                System.out.printf("%.2f", result);
            }
        }
    }
}
