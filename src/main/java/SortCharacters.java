import java.io.FileInputStream;
import java.util.Scanner;

public class SortCharacters {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fileReader = new FileInputStream(scanner.nextLine())){
            int[] ch = new int[256];
            while (fileReader.available() > 0){
                ch[fileReader.read()]++;
            }
            String text = "";
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != 0){
                    text += i + " ";
                }
            }
            System.out.println(text);
        }
    }
}
