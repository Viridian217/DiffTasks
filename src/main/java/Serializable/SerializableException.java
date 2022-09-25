package Serializable;

import java.io.*;

public class SerializableException implements Serializable {
    public static class SubSolution extends SerializableException {
        private void writeObject(ObjectOutputStream out) throws IOException {
            throw new NotSerializableException("Не сегодня!");
        }

        private void readObject(ObjectInputStream in) throws IOException{
            throw new NotSerializableException("Не сегодня!");
        }
    }

    public static void main(String[] args) {

    }
}
