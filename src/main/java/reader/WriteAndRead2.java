package reader;

import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteAndRead2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        scanner.close();
        try (FileWriter writer = new FileWriter(fileName1);
             FileReader reader1 = new FileReader(fileName1);
             FileReader reader2 = new FileReader(fileName2);
             ByteArrayOutputStream stream = new ByteArrayOutputStream()){
            while (reader2.ready()){
                stream.write(reader2.read());
            }
            while (reader1.ready()){
                stream.write(reader1.read());
            }
            writer.write(stream.toString());
        }
    }
}
