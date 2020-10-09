package storage;

import model.Tour;

import java.io.*;
import java.util.List;

public class IOTour implements Serializable{
    public static void save(List<Tour> tourList) {
        try {
            File file = new File("tour.dat");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            System.out.println("Saved successfully! ");
            objectOutputStream.writeObject(tourList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Tour> read() {
        try {
            FileInputStream fileInputStream = new FileInputStream("tour.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Tour> tourList1 = (List<Tour>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return tourList1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
