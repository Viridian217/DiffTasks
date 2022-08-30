import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileSplit {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream inputStreamFile1 = new FileInputStream(scanner.nextLine());
             FileOutputStream outputStreamFile2 = new FileOutputStream(scanner.nextLine());
             FileOutputStream outputStreamFile3 = new FileOutputStream(scanner.nextLine())) {
            int available = inputStreamFile1.available();
            int count = available % 2 == 0 ? available / 2 : (int) Math.floor(available / 2);
            if (available > 0) {
                byte[] mass = new byte[available];
                inputStreamFile1.read(mass);
                outputStreamFile2.write(mass, 0, count);
                if (available % 2 == 0) {
                    outputStreamFile3.write(mass, count, count);
                }
                else {
                    outputStreamFile3.write(mass,count,count+1);
                }
            }
        }
    }
}
