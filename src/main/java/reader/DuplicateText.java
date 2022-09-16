package reader;

import java.io.*;

public class DuplicateText {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream writerFile = new FileOutputStream(reader.readLine())){
            PrintStream console = System.out;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(outputStream);
            System.setOut(stream);
            testString.printSomething();
            String result = outputStream.toString();
            System.setOut(console);
            System.out.println(result);
            writerFile.write(outputStream.toByteArray());
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
