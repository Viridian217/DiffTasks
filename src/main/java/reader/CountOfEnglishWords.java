package reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountOfEnglishWords {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             FileReader reader = new FileReader(scanner.nextLine())) {
            int count = 0;
            while (reader.ready()) {
                int symb = reader.read();
                if (symb > 64 && symb < 91) {
                    count++;
                } else if (symb > 96 && symb < 123) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
