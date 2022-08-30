import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountOfComma {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream reader = new FileInputStream(scanner.nextLine())){
            int count = 0;
            while (reader.available() > 0){
                int symb = reader.read();
                if (symb == 44) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
