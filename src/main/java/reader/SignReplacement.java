package reader;

import java.io.*;

public class SignReplacement {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader (new FileReader(reader.readLine()));
             BufferedWriter fileWriter = new BufferedWriter (new FileWriter(reader.readLine()))) {
            while (fileReader.ready()){
                char elem = (char) fileReader.read();
                if (elem == '.'){
                    elem = '!';
                }
                fileWriter.write(elem);
            }
        }
    }
}
