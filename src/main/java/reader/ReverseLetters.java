package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseLetters {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))){
            String str = "";
            while (fileReader.ready()) {
                StringBuilder stringBuilder = new StringBuilder(fileReader.readLine());
                stringBuilder.reverse();
                System.out.println(stringBuilder.toString());
            }
        }
    }
}
