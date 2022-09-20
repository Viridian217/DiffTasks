package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordsMoreThanSixLetters {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter writer = new FileWriter(args[1])){
            String result = "";
            while (reader.ready()){
                String[] text = reader.readLine().split(" ");
                for (int i = 0; i < text.length; i++) {
                    if (text[i].length() > 6){
                        result += text[i] + ",";
                    }
                }
            }
            result = result.substring(0, result.length() - 1);
            writer.write(result);
        }
    }
}
