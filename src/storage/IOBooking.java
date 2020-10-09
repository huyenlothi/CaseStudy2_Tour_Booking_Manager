package storage;

import model.BookingTour;

import java.io.*;
import java.util.List;

public class IOBooking implements Serializable{
    public static void save(List<BookingTour> bookingTourList){
        try {
            File file = new File("booking.dat");
            FileOutputStream fileOutputStream= new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bookingTourList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<BookingTour> read(){
        try {
            FileInputStream fileInputStream = new FileInputStream("booking.dat");
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            List<BookingTour> bookingTourList1 = (List<BookingTour>)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return bookingTourList1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
