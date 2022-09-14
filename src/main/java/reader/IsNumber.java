package reader;

import java.io.*;

public class IsNumber {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
            BufferedWriter fileWriter  = new BufferedWriter(new FileWriter(reader.readLine()))){
            String result = "";
            while (fileReader.ready()){
                String[] strings = fileReader.readLine().split(" ");
                for (int i = 0; i < strings.length; i++) {
                    try{
                        Integer.parseInt(strings[i]);
                        result += strings[i] + " ";}
                    catch (Exception e){
                        continue;
                    }
                }
            }
            fileWriter.write(result);
        }
    }
}
