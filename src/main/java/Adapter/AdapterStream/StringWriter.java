package Adapter.AdapterStream;

import java.io.IOException;

public interface StringWriter {

    void flush() throws IOException;

    void writeString(String s) throws IOException;

    void close() throws IOException;
}