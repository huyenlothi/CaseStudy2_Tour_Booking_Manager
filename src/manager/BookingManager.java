package manager;

import main.Main;
import model.BookingTour;
import service.IBookingManager;
import service.IManager;
import storage.IOBooking;

import java.util.ArrayList;
import java.util.List;

public class BookingManager implements IBookingManager {
    public static List<BookingTour> bookingTourList = new ArrayList<>();

    public static double priceTotalBooking(double price, int adults, int children, int special) {
        double result = price + (price / adults) * 0.75*children + (price / adults) * 0.85*special;
        return result;
    }

    @Override
    public double getBookingReport() {
        double result=0;
        for (BookingTour bookingTour: bookingTourList
        ) {
            result += bookingTour.getTotalBooking();
        }
        return result;
    }

    @Override
    public void searchBooking(int codeBooking) {
        for (BookingTour bookingTour: bookingTourList
        ) {
            if(bookingTour.getCodeBooking() == (codeBooking)){
                System.out.println(bookingTour.toString());
            }
        }
    }

    @Override
    public void add(BookingTour bookingTour) {
        BookingManager.bookingTourList = IOBooking.read();
        bookingTourList.add(bookingTour);
        IOBooking.save(bookingTourList);

    }

    @Override
    public void edit(int codeBooking) {
        for (BookingTour bookingTour: bookingTourList
             ) {
            if(bookingTour.getCodeBooking() == codeBooking){
                bookingTour.setStatusBooking(true);
                System.out.println("Status Booking was update ! ");
            }
        }
    }

    @Override
    public void remove(int codeBooking) {
        for (BookingTour bookingTour: bookingTourList
        ) {
            if(bookingTour.getCodeBooking() == (codeBooking)){
                bookingTourList.remove(bookingTour);
            }else {
                System.out.println("Not found!");
                Main.menuBooking();
            }
        }
    }

    @Override
    public void display() {
        int i=1;
        System.out.println("==============Booking List: ================");
        for (BookingTour bookingTour: bookingTourList
        ) {
            System.out.println(i++ + ". " + bookingTour.toString());
        }
    }
}