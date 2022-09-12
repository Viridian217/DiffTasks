package reader;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OutputOnlyNumbers {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);
        char[] chars = result.toCharArray();
        String res = "";
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                res += chars[i];
            }
        }
        System.out.println(res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
