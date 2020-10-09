package model;

import java.io.Serializable;

public class Tour  implements Serializable {
    private int tourCode;
    private String tourName;
    private int tourTime;
    private String tourInformation;
    private String tourStyle;
    private double tourSicPriceLow15;
    private double tourSicPriceLowOver5;
    private double tourSicPriceHigh15;
    private double tourSicPriceHighOver5;
    private double tourPrivatePriceLow15;
    private double tourPrivatePriceLowOver5;
    private double tourPrivatePriceHigh15;
    private double tourPrivatePriceHighOver5;

    public Tour(int tourCode, String tourName, int tourTime, String tourInformation, String tourStyle, double tourSicPriceLow15, double tourSicPriceLowOver5, double tourSicPriceHight15, double tourSicPriceHightOver5, double tourPrivatePriceLow15, double tourPrivatePriceLowOver5, double tourPrivatePriceHight15, double tourPrivatePriceHightOver5) {
        this.tourCode = tourCode;
        this.tourName = tourName;
        this.tourTime = tourTime;
        this.tourInformation = tourInformation;
        this.tourStyle = tourStyle;
        this.tourSicPriceLow15 = tourSicPriceLow15;
        this.tourSicPriceLowOver5 = tourSicPriceLowOver5;
        this.tourSicPriceHigh15 = tourSicPriceHight15;
        this.tourSicPriceHighOver5 = tourSicPriceHightOver5;
        this.tourPrivatePriceLow15 = tourPrivatePriceLow15;
        this.tourPrivatePriceLowOver5 = tourPrivatePriceLowOver5;
        this.tourPrivatePriceHigh15 = tourPrivatePriceHight15;
        this.tourPrivatePriceHighOver5 = tourPrivatePriceHightOver5;
    }

    public int getTourCode() {
        return tourCode;
    }

    public void setTourCode(int tourCode) {
        this.tourCode = tourCode;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public int getTourTime() {
        return tourTime;
    }

    public void setTourTime(int tourTime) {
        this.tourTime = tourTime;
    }

    public String getTourInformation() {
        return tourInformation;
    }

    public void setTourInformation(String tourInformation) {
        this.tourInformation = tourInformation;
    }

    public String getTourStyle() {
        return tourStyle;
    }

    public void setTourStyle(String tourStyle) {
        this.tourStyle = tourStyle;
    }

    public double getTourSicPriceLow15() {
        return tourSicPriceLow15;
    }

    public void setTourSicPriceLow15(double tourSicPriceLow15) {
        this.tourSicPriceLow15 = tourSicPriceLow15;
    }

    public double getTourSicPriceLowOver5() {
        return tourSicPriceLowOver5;
    }

    public void setTourSicPriceLowOver5(double tourSicPriceLowOver5) {
        this.tourSicPriceLowOver5 = tourSicPriceLowOver5;
    }

    public double getTourSicPriceHigh15() {
        return tourSicPriceHigh15;
    }

    public void setTourSicPriceHigh15(double tourSicPriceHigh15) {
        this.tourSicPriceHigh15 = tourSicPriceHigh15;
    }

    public double getTourSicPriceHighOver5() {
        return tourSicPriceHighOver5;
    }

    public void setTourSicPriceHighOver5(double tourSicPriceHighOver5) {
        this.tourSicPriceHighOver5 = tourSicPriceHighOver5;
    }

    public double getTourPrivatePriceLow15() {
        return tourPrivatePriceLow15;
    }

    public void setTourPrivatePriceLow15(double tourPrivatePriceLow15) {
        this.tourPrivatePriceLow15 = tourPrivatePriceLow15;
    }

    public double getTourPrivatePriceLowOver5() {
        return tourPrivatePriceLowOver5;
    }

    public void setTourPrivatePriceLowOver5(double tourPrivatePriceLowOver5) {
        this.tourPrivatePriceLowOver5 = tourPrivatePriceLowOver5;
    }

    public double getTourPrivatePriceHigh15() {
        return tourPrivatePriceHigh15;
    }

    public void setTourPrivatePriceHigh15(double tourPrivatePriceHigh15) {
        this.tourPrivatePriceHigh15 = tourPrivatePriceHigh15;
    }

    public double getTourPrivatePriceHighOver5() {
        return tourPrivatePriceHighOver5;
    }

    public void setTourPrivatePriceHighOver5(double tourPrivatePriceHighOver5) {
        this.tourPrivatePriceHighOver5 = tourPrivatePriceHighOver5;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "Tour Code :'" + tourCode + '\'' +
                ", Tour Name :'" + tourName + '\'' +
                ", Tour Time :" + tourTime +
                ", Tour Information :'" + tourInformation + '\'' +
                ", Tour Style :'" + tourStyle + '\'' +
                ", Price From : " + tourSicPriceLowOver5 +
                '}';
    }
}
