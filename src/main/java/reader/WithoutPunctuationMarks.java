package reader;

import java.io.*;

public class WithoutPunctuationMarks {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
            while (fileReader.ready()) {
                int c = fileReader.read();
                if (c >= 48 && c <= 57 || c >= 65 && c <= 90 || c >= 97 && c <= 122 || c == 32) {
                    fileWriter.write(c);
                }
            }
        }
    }
}
