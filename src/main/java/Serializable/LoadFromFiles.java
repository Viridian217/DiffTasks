package Serializable;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LoadFromFiles implements Serializable {
    public static void main(String[] args) throws Exception {
        try (FileOutputStream fileOutput = new FileOutputStream("fileName");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput)) {

            LoadFromFiles loadFromFiles = new LoadFromFiles();
            outputStream.writeObject(loadFromFiles);

            try (FileInputStream fiStream = new FileInputStream("fileName");
                 ObjectInputStream objectStream = new ObjectInputStream(fiStream)) {

                LoadFromFiles loadedObject = (LoadFromFiles) objectStream.readObject();
                System.out.println(loadedObject.size());
            }
        }
    }
    private Map<String, String> m = new HashMap<>();

    public Map<String, String> getMap() {
        return m;
    }

    public LoadFromFiles() {
        m.put("gdfg", "rqwe");
        m.put("gdfg", "fdheerg");
    }

    public int size() {
        return m.size();
    }
}
