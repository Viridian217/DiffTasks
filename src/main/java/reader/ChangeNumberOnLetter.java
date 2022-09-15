package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ChangeNumberOnLetter {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            String result = "";
            while (fileReader.ready()) {
                String[] strings = fileReader.readLine().split(" ");
                for (int i = 0; i < strings.length; i++) {
                    try {
                        String str = strings[i];
                        char[] chars = str.toCharArray();
                        char elem = chars[chars.length - 1];
                        String sign = "";
                        if (elem == ',' || elem == '.' || elem == '!' || elem == '?') {
                            sign = String.valueOf(elem);
                            str = str.substring(0, str.length() - 1);
                        }
                        int number = Integer.parseInt(str);
                        if (number <= 12 && number >= 0 && !sign.isEmpty()) {
                            result += map.get(number) + sign + " ";
                        } else if (number <= 12 && number >= 0) {
                            result += map.get(number) + " ";
                        } else {
                            result += strings[i] + " ";
                        }
                    } catch (Exception e) {
                        result += strings[i] + " ";
                        continue;
                    }
                }
                result += "\n";
            }
            System.out.println(result);
        }
    }
}
