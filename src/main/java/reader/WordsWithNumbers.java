package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordsWithNumbers {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter writer = new FileWriter(args[1])) {
            while (reader.ready()) {
                String[] strings = reader.readLine().split(" ");
                for (int i = 0; i < strings.length; i++) {
                    String str = "";
                    char[] chars = strings[i].toCharArray();
                    for (int j = 0; j < chars.length; j++) {
                        if (Character.isDigit(chars[j])) {
                            str = strings[i];
                        }
                    }
                    if (!str.isEmpty()) {
                        writer.write(str + " ");
                    }
                }
            }
        }
    }
}
