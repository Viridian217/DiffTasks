package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class LoadFromFiles {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutput = new FileOutputStream("fileName");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

        LoadFromFiles loadFromFiles = new LoadFromFiles();
        outputStream.writeObject(loadFromFiles);

        fileOutput.close();
        outputStream.close();

        //load
        FileInputStream fiStream = new FileInputStream("fileName");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        LoadFromFiles loadedObject = (LoadFromFiles) objectStream.readObject();

        fiStream.close();
        objectStream.close();

        //Attention!!
        System.out.println(loadedObject.size());
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
