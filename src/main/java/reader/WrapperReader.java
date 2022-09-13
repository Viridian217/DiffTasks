package reader;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WrapperReader {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArray);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(console);
        System.out.println(byteArray.toString().toUpperCase());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
