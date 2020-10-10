package imanager;

import model.Tour;

public interface ITourManager extends IManager<Tour> {
    abstract void sort();
    abstract String getTourName(int tourCode);
    abstract String getTourType(int tourCode);
    abstract int getTime(int tour);
    abstract double getPricePerPax(int tourCode,int number,String date,int adults);

}
