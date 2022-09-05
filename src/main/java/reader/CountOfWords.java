package reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountOfWords {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             FileReader reader = new FileReader(scanner.nextLine())) {
            int[] asc = new int[256];
            while (reader.ready()) {
                asc[reader.read()]++;
            }

            for (int i = 0; i < asc.length; i++) {
                if (asc[i] != 0) {
                    System.out.println((char) i + " " + asc[i]);
                }
            }
        }
    }
}
