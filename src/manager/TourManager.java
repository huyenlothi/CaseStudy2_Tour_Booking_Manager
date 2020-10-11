package manager;

import main.Main;
import model.Tour;
import imanager.ITourManager;
import storage.IOTour;

import java.util.*;

public class TourManager  implements ITourManager {
public static List<Tour> tourList = new ArrayList<>();


    @Override
    public void sort() {
        Collections.sort(tourList, new Comparator<Tour>() {
                    @Override
                    public int compare(Tour o1, Tour o2) {
                        if (o1.getTourSicPriceLowOver5() > o2.getTourSicPriceLowOver5()) {
                            return 1;
                        } else if (o1.getTourSicPriceLowOver5() < o2.getTourSicPriceLowOver5()) {
                            return -1;
                        } else
                            return 0;
                    }
                }
        );
    }

    @Override
    public String getTourName(int tourCode) {
        String result=null;
        for (Tour tour: tourList
        ) {
            if(tour.getTourCode()==tourCode){
                result= tour.getTourName();
            }
        }
        return result;
    }

    @Override
    public String getTourType(int number) {
        String tourType=null;
        if(number ==1){
            tourType= "Tour Sic";
        }else if(number ==2){
            tourType="Private Tour";
        }
        return tourType;
    }

    @Override
    public int getTime(int tourCode) {
        int result=0;
        for (Tour tour: tourList
        ) {
            if(tour.getTourCode()==tourCode){
                result = tour.getTourTime();
            }
        }
        return result;
    }

    @Override
    public double getPricePerPax(int tourCode, int number, String date, int adults) {
        double result=0;
        String[] date1 = date.split("/");
        for (Tour tour: tourList
        ) {
            if(tour.getTourCode()==tourCode){
                if(number==1){
                    if(date1[1].equals(5) || date1[1].equals(6) || date1[1].equals(7) || date1[1].equals(8) || date1[1].equals(9) || date1[1].equals(10) ){
                        if(adults<=5){
                            result = tour.getTourSicPriceLow15();
                        }else
                            result = tour.getTourSicPriceLowOver5();
                    }else{
                        if(adults<=5){
                            result = tour.getTourSicPriceHigh15();
                        }else
                            result = tour.getTourSicPriceHighOver5();
                    }
                }else {
                    if(number ==2){
                        if(date1[1].equals(5) || date1[1].equals(6) || date1[1].equals(7) || date1[1].equals(8) || date1[1].equals(9) || date1[1].equals(10) ){
                            if(adults<=5){
                                result = tour.getTourPrivatePriceLow15();
                            }else
                                result = tour.getTourPrivatePriceLowOver5();
                        }else{
                            if(adults<=5){
                                result = tour.getTourPrivatePriceHigh15();
                            }else
                                result = tour.getTourSicPriceHighOver5();
                        }
                    }

                }
            }
        }
        return result;
    }


    @Override
    public void add(Tour tour) {
        TourManager.tourList = IOTour.read();
        TourManager.tourList.add(tour);
        IOTour.save(tourList);
    }

    @Override
    public void edit(int tourCode) {
        for (Tour tour : tourList
        ) {
            if (tour.getTourCode()== tourCode) {
                Scanner scanner = new Scanner(System.in);
                 int i = 1;
                while (i < 14) {
                    System.out.println("menu edit:");
                    System.out.println("1.edit tour name");
                    System.out.println("2.edit tour time");
                    System.out.println("3.edit tour information");
                    System.out.println("4.edit tour style");
                    System.out.println("5.edit Tour SIC new price From 1 - 5 Adult in Low season");
                    System.out.println("6.edit Tour SIC new price over 5 Adult in Low season");
                    System.out.println("7.edit Tour SIC new price From 1 - 5 Adult in High season");
                    System.out.println("8.edit Tour SIC new price over 5 Adult in High season");
                    System.out.println("9.edit Tour Private new price From 1- 5 Adult in Low season");
                    System.out.println("10.edit Tour Private new price over 5 Adult in Low season");
                    System.out.println("11.edit Tour Private new price From 1- 5 Adult in High season");
                    System.out.println("12.edit Tour Private new price over 5 Adult in High season");
                    System.out.println("13.exit");
                    System.out.println("your choose:");
                    int choose = 0;
                    try {
                        choose = scanner.nextInt();
                        scanner.nextLine();
                    }catch (Exception e){
                        System.out.println("Try enter your choose!");
                    }
                    switch (choose) {
                        case 1:
                            System.out.println("enter new tour name");
                            String tourName = scanner.nextLine();
                            tour.setTourName(tourName);
                            i = 2;
                            break;
                        case 2:
                            int tourTime = Main.setTourTime();
                            scanner.nextLine();
                            tour.setTourTime(tourTime);
                            i = 3;
                            break;
                        case 3:
                            System.out.println("enter new tour information");
                            String tourInformation = scanner.nextLine();
                            tour.setTourInformation(tourInformation);
                            i = 4;
                            break;
                        case 4:
                            System.out.println("enter new tour style");
                            String tourStyle = scanner.nextLine();
                            tour.setTourStyle(tourStyle);
                            i = 5;
                            break;
                        case 5:
                            double tourSicPriceLow15 = Main.setTourSicPriceLow15();
                            tour.setTourSicPriceLow15(tourSicPriceLow15);
                            i=6;
                            break;
                        case 6:
                            double tourSicPriceLowOver5 = Main.setTourSicPriceLowOver5();
                            tour.setTourSicPriceLow15(tourSicPriceLowOver5);
                            i=7;
                            break;
                        case 7:
                            double tourSicPriceHight15 = Main.setTourSicPriceHigh15();
                            tour.setTourSicPriceHigh15(tourSicPriceHight15);
                            i=8;
                            break;
                        case 8:
                            double tourSicPriceHightOver5 =Main.setTourSicPriceHighOver5();
                            tour.setTourSicPriceHighOver5(tourSicPriceHightOver5);
                            i=9;
                            break;
                        case 9:
                            double tourPrivatePriceLow15 = Main.setTourPrivatePriceLow15();
                            tour.setTourPrivatePriceLow15(tourPrivatePriceLow15);
                            i= 10;
                            break;
                        case 10:
                            double tourPrivatePriceLowOver5 = Main.setTourPrivatePriceLowOver5();
                            tour.setTourPrivatePriceLowOver5(tourPrivatePriceLowOver5);
                            i=11;
                            break;
                        case 11:
                            double tourPrivatePriceHight15 = Main.setTourPrivatePriceHigh15();
                            tour.setTourPrivatePriceHigh15(tourPrivatePriceHight15);
                            i=12;
                            break;
                        case 12:
                            double tourPrivatePriceHightOver5 = Main.setTourPrivatePriceHighOver5();
                            tour.setTourPrivatePriceHighOver5(tourPrivatePriceHightOver5);
                            i=13;
                            break;
                        case 13:
                            i = 14;
                            System.out.println("Tour information was change");
                            Main.menuTour();
                            break;
                        default:
                            System.out.println("Try enter your choose");
                            i=13;
                    }
                }
            }
        }
            System.out.println("Not Found !");
            Main.menuTour();

    }

    @Override
    public void remove(int tourCode) {
        for (Tour tour: tourList
             ) {
            if(tour.getTourCode() == tourCode){
                tourList.remove(tour);
            }
        }
    }

    @Override
    public void display() {
        int i=0;
        System.out.println("=============== Tour list ==============");
        for (Tour tour: tourList
             ) {
            System.out.println(++i + ". "+ tour.toString());
        }
    }
}
