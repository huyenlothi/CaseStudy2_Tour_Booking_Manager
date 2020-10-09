package model;

import java.io.Serializable;

public class BookingTour implements Serializable {
    private int codeBooking;
    private String tourDate;
    private String tourName;
    private String customerName;
    private String customerAddress;
    private String phone;
    private String email;
    private int adults;
    private int children;
    private int special;
    private String cheekInDate;
    private double totalBooking;
    private boolean statusBooking = true;

    public BookingTour(int codeBooking, String tourDate, String tourName, String customerName, String customerAddress, String phone, String email, int adults, int children, int special, String cheekInDate, double totalBooking, boolean statusBooking) {
        this.codeBooking = codeBooking;
        this.tourDate = tourDate;
        this.tourName = tourName;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.phone = phone;
        this.email = email;
        this.adults = adults;
        this.children = children;
        this.special = special;
        this.cheekInDate = cheekInDate;
        this.totalBooking = totalBooking;
        this.statusBooking = statusBooking;
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getTourDate() {
        return tourDate;
    }

    public void setTourDate(String tourDate) {
        this.tourDate = tourDate;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public String getCheekInDate() {
        return cheekInDate;
    }

    public void setCheekInDate(String cheekInDay) {
        this.cheekInDate = cheekInDay;
    }


    public double getTotalBooking() {
        return totalBooking;
    }

    public void setTotalBooking(double totalBooking) {
        this.totalBooking = totalBooking;
    }

    public boolean isStatusBooking() {
        return statusBooking;
    }

    public void setStatusBooking(boolean statusBooking) {
        this.statusBooking = statusBooking;
    }

    @Override
    public String toString() {
        return "Booking Tour{" +
                "code Booking=" + codeBooking +
                ", tour Date='" + tourDate + '\'' +
                ", tour Name='" + tourName + '\'' +
                ", customer Name='" + customerName + '\'' +
                ", customer Address='" + customerAddress + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", adults=" + adults +
                ", children=" + children +
                ", special=" + special +
                ", cheekIn Date='" + cheekInDate + '\'' +
                ", total Booking=" + totalBooking +
                ", status Booking=" + statusBooking +
                '}';
    }
}
