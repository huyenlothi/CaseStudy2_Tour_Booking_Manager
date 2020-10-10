package storage;

import java.io.*;
import java.util.LinkedHashMap;

public class IOUserAccoount {
    public static void save(LinkedHashMap<String, String> linkedHashMap){
        try {
            File file = new File("user.dat");
            FileOutputStream fileOutputStream= new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(linkedHashMap);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static LinkedHashMap<String, String> read(){
        try {
            FileInputStream fileInputStream = new FileInputStream("user.dat");
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            LinkedHashMap<String, String> linkedHashMap = (LinkedHashMap<String, String>)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return linkedHashMap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
