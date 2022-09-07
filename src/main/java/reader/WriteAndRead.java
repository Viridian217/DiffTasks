package reader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteAndRead {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             FileWriter writer = new FileWriter(scanner.nextLine());
             FileReader reader1 = new FileReader(scanner.nextLine());
             FileReader reader2 = new FileReader(scanner.nextLine())){
            while (reader1.ready()){
                writer.write((char) reader1.read());
            }
            while (reader2.ready()){
                writer.write((char) reader2.read());
            }
        }
    }
}
