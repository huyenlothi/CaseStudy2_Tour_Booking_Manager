package service;

import model.BookingTour;

public interface IBookingManager extends IManager<BookingTour> {
    abstract double getBookingReport();
    abstract void searchBooking(int code);

}
