import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream reader = new FileInputStream(scanner.nextLine());
             FileOutputStream writer = new FileOutputStream(scanner.nextLine())){
            byte[] mass = new byte[reader.available()];
            if (reader.available() > 0) {
                reader.read(mass);
                for (int i = mass.length - 1; i >= 0; i--) {
                    writer.write(mass[i]);
                }
            }
        }
    }
}
