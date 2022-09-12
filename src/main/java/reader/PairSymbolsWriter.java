package reader;

import java.io.*;

public class PairSymbolsWriter {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine());
             FileWriter fileWriter = new FileWriter(reader.readLine())){
            int count = 1;
            while (fileReader.ready()) {
                char elem = (char) fileReader.read();
                if (count % 2 == 0) {
                    fileWriter.write(elem);
                }
                count++;
            }
        }
    }
}
