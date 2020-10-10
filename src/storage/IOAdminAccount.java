package storage;

import model.BookingTour;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;

public class IOAdminAccount {
    public static void save(LinkedHashMap<String, String> linkedHashMap){
        try {
            File file = new File("admin.dat");
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
            FileInputStream fileInputStream = new FileInputStream("admin.dat");
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
