import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MostCommonCharacters {
        public static void main(String[] args) throws Exception {
            try (Scanner scanner = new Scanner(System.in);
                 FileInputStream fileReader = new FileInputStream(scanner.nextLine())){
                int[] ch = new int[256];
                while (fileReader.available() > 0){
                    ch[fileReader.read()]++;
                }
                int[] max = new int[]{Integer.MIN_VALUE};
                Arrays.stream(ch).forEach(o -> {
                    if (max[0] < o){
                        max[0] = o;
                    }
                });
                ArrayList<Integer> arrayList = new ArrayList<>();
                String text = "";
                for (int i = 0; i < ch.length; i++) {
                    if (ch[i] == max[0]){
                        text += i + " ";
                    }
                }
                System.out.println(text);
            }
        }
    }

