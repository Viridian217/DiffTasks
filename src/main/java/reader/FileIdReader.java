package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIdReader {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             BufferedReader bufferedFileReader = new BufferedReader(new FileReader(scanner.nextLine()))) {
            String s = "";
            while ((s = bufferedFileReader.readLine()) != null) {
                if (s.startsWith(args[0] + " ")) {
                    System.out.println(s);
                    break;
                }
            }
        }
    }
}
