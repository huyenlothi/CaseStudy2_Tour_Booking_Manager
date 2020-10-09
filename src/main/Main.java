package main;

import manager.BookingManager;
import manager.TourManager;
import model.BookingTour;
import model.Tour;
import storage.IOBooking;
import storage.IOTour;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static int autoTourCode() {
        int tourCode=0;
        TourManager.tourList = IOTour.read();
        for (Tour tour: TourManager.tourList
             ) {
            tourCode = tour.getTourCode();
        }
        return ++tourCode;
    }

    public static int autoBookingCode() {
        int bookingCode=0;
        BookingManager.bookingTourList = IOBooking.read();
        for (BookingTour bookingTour: BookingManager.bookingTourList
        ) {
            bookingCode = bookingTour.getCodeBooking();
        }
        return ++bookingCode;
    }

    public static boolean checkValidate(String regex) {
        Pattern pattern = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean checkValidatePhone(String regex) {
        Pattern pattern = Pattern.compile("^(\\d{3}[- .]?){2}\\d{4}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean checkValidateEmail(String regex) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    private static double setTourPrivatePriceHighOver5() {
        double tourPrivatePriceHighOver5;
        System.out.println("Enter Tour Private price over 5 Adult in High season ");
        try {
            tourPrivatePriceHighOver5 = new Scanner(System.in).nextDouble();
            if (tourPrivatePriceHighOver5 > 0) {
                return tourPrivatePriceHighOver5;
            } else {
                setTourPrivatePriceHighOver5();
            }
        } catch (Exception e) {
            setTourPrivatePriceHighOver5();
        }
        return 0;
    }

    private static double setTourPrivatePriceHigh15() {
        double tourPrivatePriceHigh15;
        System.out.println("Enter Tour Private price From 1- 5 Adult in High season ");
        try {
            tourPrivatePriceHigh15 = new Scanner(System.in).nextDouble();
            if (tourPrivatePriceHigh15 > 0) {
                return tourPrivatePriceHigh15;
            } else {
                setTourPrivatePriceHigh15();
            }
        } catch (Exception e) {
            setTourPrivatePriceHigh15();
        }
        return 0;
    }

    private static double setTourPrivatePriceLowOver5() {
        double tourPrivatePriceLowOver5;
        System.out.println("Enter Tour Private price over 5 Adult in Low season ");
        try {
            tourPrivatePriceLowOver5 = new Scanner(System.in).nextDouble();
            if (tourPrivatePriceLowOver5 > 0) {
                return tourPrivatePriceLowOver5;
            } else {
                setTourPrivatePriceLowOver5();
            }
        } catch (Exception e) {
            setTourPrivatePriceLowOver5();
        }
        return 0;
    }

    private static double setTourPrivatePriceLow15() {
        double tourPrivatePriceLow15;
        System.out.println("Enter Tour Private price From 1- 5 Adult in Low season ");
        try {
            tourPrivatePriceLow15 = new Scanner(System.in).nextDouble();
            if (tourPrivatePriceLow15 > 0) {
                return tourPrivatePriceLow15;
            } else {
                setTourPrivatePriceLow15();
            }
        } catch (Exception e) {
            setTourPrivatePriceLow15();
        }
        return 0;
    }

    private static double setTourSicPriceHighOver5() {
        double tourSicPriceHighOver5;
        System.out.println("Enter Tour SIC price over 5 Adult in High season ");
        try {
            tourSicPriceHighOver5 = new Scanner(System.in).nextDouble();
            if (tourSicPriceHighOver5 > 0) {
                return tourSicPriceHighOver5;
            } else {
                setTourSicPriceHighOver5();
            }
        } catch (Exception e) {
            setTourSicPriceHighOver5();
        }
        return 0;
    }

    private static double setTourSicPriceHigh15() {
        double tourSicPriceHight15;
        System.out.println("Enter Tour SIC price From 1 - 5 Adult in High season ");
        try {
            tourSicPriceHight15 = new Scanner(System.in).nextDouble();
            if (tourSicPriceHight15 > 0) {
                return tourSicPriceHight15;
            } else {
                setTourSicPriceHigh15();
            }
        } catch (Exception e) {
            setTourSicPriceHigh15();
        }
        return 0;
    }

    private static double setTourSicPriceLowOver5() {
        double tourSicPriceLowOver5;
        System.out.println("Enter Tour SIC price over 5 Adult in Low season ");
        try {
            tourSicPriceLowOver5 = new Scanner(System.in).nextDouble();
            if (tourSicPriceLowOver5 > 0) {
                return tourSicPriceLowOver5;
            } else {
                setTourSicPriceLowOver5();
            }
        } catch (Exception e) {
            setTourSicPriceLowOver5();
        }
        return 0;

    }

    private static double setTourSicPriceLow15() {
        double tourSicPriceLow15;
        System.out.println("enter tour sic price low season 1-5 person:");
        try {
            tourSicPriceLow15 = new Scanner(System.in).nextDouble();
            if (tourSicPriceLow15 > 0) {
                return tourSicPriceLow15;
            } else {
                setTourSicPriceLow15();
            }
        } catch (Exception e) {
            setTourSicPriceLow15();
        }
        return 0;
    }

    private static int setTourTime() {
        int tourTime;
        System.out.println("enter tour time");
        try {
            tourTime = new Scanner(System.in).nextInt();
            if (tourTime > 0) {
                return tourTime;
            } else {
                setTourTime();
            }
        } catch (Exception e) {
            setTourTime();
        }
        return 0;
    }

    public static void menuTour() {
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        while (j < 8) {
            System.out.println("====== Menu Tour: ======");
            System.out.println("1. Add tour");
            System.out.println("2. Edit Tour");
            System.out.println("3. Remove tour");
            System.out.println("4. Sort tour");
            System.out.println("5. Display tour");
            System.out.println("6. Save tour");
            System.out.println("7. Read tour");
            System.out.println("8. Exit");
            System.out.println("Enter Your Choose:");
            int chooseTour = 0;
            try {
                chooseTour = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Try Enter Your Choose!");
                j = 2;
            }
            switch (chooseTour) {
                case 1: {
                    System.out.println("Enter tour name:");
                    String tourName = scanner.nextLine();
                    int tourTime= setTourTime();
                    System.out.println("Enter tour information");
                    String tourInformation = scanner.nextLine();
                    System.out.println("Enter tour style:");
                    String tourStyle = scanner.nextLine();
                    double tourSicPriceLow15 = setTourSicPriceLow15();
                    double tourSicPriceLowOver5 = setTourSicPriceLowOver5();
                    double tourSicPriceHigh15 = setTourSicPriceHigh15();
                    double tourSicPriceHighOver5 = setTourSicPriceHighOver5();
                    double tourPrivatePriceLow15 = setTourPrivatePriceLow15();
                    double tourPrivatePriceLowOver5 = setTourPrivatePriceLowOver5();
                    double tourPrivatePriceHigh15 = setTourPrivatePriceHigh15();
                    double tourPrivatePriceHighOver5 = setTourPrivatePriceHighOver5();


                    int tourCode = autoTourCode();
                    Tour tour = new Tour(tourCode, tourName, tourTime, tourInformation, tourStyle, tourSicPriceLow15,
                            tourSicPriceLowOver5, tourSicPriceHigh15, tourSicPriceHighOver5, tourPrivatePriceLow15,
                            tourPrivatePriceLowOver5, tourPrivatePriceHigh15, tourPrivatePriceHighOver5);

                    new TourManager().add(tour);
                    j = 1;
                    break;
                }
                case 2:
                    System.out.println("Enter tour code you want to edit:");
                    int code=0;
                    try {
                        code = new Scanner(System.in).nextInt();
                    new TourManager().edit(code);
                    j = 2;
                    }catch (Exception e){
                        System.out.println("Not Found");
                        menuTour();
                    }
                    break;
                case 3:
                    System.out.println("Enter tour code you want to remove: ");
                    int codeTour;
                    try{
                        codeTour = scanner.nextInt();
                    new TourManager().remove(codeTour);
                    j = 3;
                    }catch (Exception e){
                        System.out.println("Not Found");
                        menuTour();
                    }
                    break;
                case 4:
                    new TourManager().sort();
                    j = 4;
                    break;
                case 5:
                    new TourManager().display();
                    j = 5;
                    break;
                case 6:
                    IOTour.save(TourManager.tourList);
                    j = 6;
                    break;
                case 7:
                    TourManager.tourList = IOTour.read();
                    j = 7;
                    break;
                case 8:
                    System.out.println("Welcome back to the main menu!");
                    menuAdmin();
                    j = 8;
                    break;
                default:
                    System.out.println("Try Enter Your Choose! ");
                    menuTour();
            }
        }
    }

    public static void menuBooking() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 7) {
            System.out.println("===========Menu Booking===========");
            System.out.println("1.Remove Booking Tour");
            System.out.println("2.Edit Booking Tour");
            System.out.println("3.Display Booking Tour");
            System.out.println("4.Get Booking Report");
            System.out.println("5.Search Booking Tour");
            System.out.println("6.Save Booking Tour");
            System.out.println("7.Read Booking Tour");
            System.out.println("8.Exit");
            System.out.println("================================");
            System.out.println("Enter Your choose:");
            int chooseBooking = 0;
            try {
                chooseBooking = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Try enter your choose!");
                count = 2;
            }
            switch (chooseBooking) {
                case 1:
                    System.out.println("enter code booking tour you want to remove");
                    int codebooking;
                    try{
                        codebooking = scanner.nextInt();
                    new BookingManager().remove(codebooking);
                    count = 1;
                    }catch (Exception e){
                        System.out.println("Not Found!");
                        menuBooking();
                    }
                    break;
                case 2:
                    System.out.println("enter code booking tour you want to edit");
                    int codeBookingTour;
                    try{
                        codeBookingTour = scanner.nextInt();
                    new BookingManager().edit(codeBookingTour);
                    count =2;
                    }catch (Exception e){
                        System.out.println("Not Found");
                        menuBooking();
                    }
                    break;
                case 3:
                    System.out.println("List booking tour:");
                    new BookingManager().display();
                    count = 2;
                    break;
                case 4:
                    System.out.println("Booking report: ");
                    new BookingManager().getBookingReport();
                    count = 3;
                    break;
                case 5:
                    System.out.println("Enter code booking tour you want to search:");
                    int codebookingtourS;
                    try{
                        codebookingtourS = scanner.nextInt();
                    new BookingManager().searchBooking(codebookingtourS);
                    count = 4;
                    }catch (Exception e){
                        System.out.println("Not Found!");
                        menuBooking();
                    }
                    break;
                case 6:
                    IOBooking.save(BookingManager.bookingTourList);
                    count = 5;
                    break;
                case 7:
                    BookingManager.bookingTourList= IOBooking.read();
                    count = 5;
                    break;
                case 8:
                    System.out.println("Welcome back to main menu !");
                    count = 7;
                default:
                    System.out.println("Try Enter Your choose");
                    menuBooking();
            }
        }
    }

    public static void menuAdmin() {
        try {
            int choose = 0;
            do {
                System.out.println(" ============ Menu: ==============");
                System.out.println("1. Tour");
                System.out.println("2. Booking");
                System.out.println("3. Exit");
                System.out.println(" ================================");
                System.out.println("Enter your choose:");
                choose = new Scanner(System.in).nextInt();
                switch (choose) {
                    case 1:
                        new TourManager().display();
                        menuTour();
                        break;
                    case 2:
                        menuBooking();
                        break;
                    case 3:
                        System.exit(-1);
                        break;
                    default:
                        menuAdmin();
                        System.out.println("Try enter your choose!");
                }

            } while (true);

        } catch (Exception e) {
            System.out.println("Try enter your choose!");
            menuAdmin();

        }
    }

    public static void menuUser() {
        Scanner scanner = new Scanner(System.in);
        TourManager.tourList = IOTour.read();
        new TourManager().display();
        System.out.println("Enter tour code you want to choose");
        int codeTour = 0;
        try{
            codeTour = scanner.nextInt();
            boolean checkTourCode= false;
            for (Tour tour: TourManager.tourList
                 ) {
                if(tour.getTourCode() == codeTour){
                    checkTourCode= true;
                }
            }
            if(!checkTourCode){
                System.out.println("Not Found !");
                menuUser();
            }
        }catch (Exception e){
            System.out.println("Not Found");
            menuUser();
        }

        int typeTour = 0;
        boolean checkTypeTour= false;
        do{
            System.out.println("Please select tour type:");
        System.out.println("1.Sic tour");
        System.out.println("2.Private tour");
        try{
            typeTour = new Scanner(System.in).nextInt();
            if(typeTour==1 || typeTour==2){
                checkTypeTour= true;
            }
        }catch (Exception e){
            System.out.println("try enter your choose");
        }
        }while (!checkTypeTour);


        String date;
        boolean checkDate;
        do {
            System.out.println("Enter Departure date dd/mm/yyyy");
            date = new Scanner(System.in).nextLine();
            checkDate = Main.checkValidate(date);
        } while (!checkDate);

        int adults=0 ;
        boolean checkAdults = false;
        do{
        System.out.println("Enter number of adults");
        try{
            adults = new Scanner(System.in).nextInt();
            if(adults>0){
                checkAdults= true;
            }
        }catch (Exception e){
            System.out.println("Try Enter number of adults");
        }
        }while (!checkAdults);

        double price = new TourManager().getPricePerPax(codeTour, typeTour, date, adults) * adults;
        System.out.println("price for " + adults + " is " + price + "$");

        int children=0;
        boolean checkChildren= false;
        do{
            System.out.println("if you have any children 4-11 years old (<4 years old: free),please input here!");
        try{
            children = new Scanner(System.in).nextInt();
            if(children>0){
                checkChildren= true;
            }
        }catch (Exception e){
            System.out.println("Try enter number of children:");
        }
        }while (!checkChildren);
        System.out.println("04 - 11 years old : 75% adult rate");

        int special=0;
        boolean checkSpecial= false;
        do{
        System.out.println("if you have a special(old person or people with disabilities,please input here!");
        try{
            special = new Scanner(System.in).nextInt();
         if(special>0){
             checkSpecial= true;
         }
        }catch (Exception e){
            System.out.println("Try enter number of special");
        }
        }while (!checkSpecial);
        System.out.println("special : 85% adult rate");
        scanner.nextLine();

        System.out.println("============ Booking Sumary ========== ");
        System.out.println("Tour Name: " + new TourManager().getTourName(codeTour));
        System.out.println("Tour Type: " + new TourManager().getTourType(typeTour));
        System.out.println("Departure date: " + date);
        System.out.println("Number Adults: " + adults + " x " + price / adults + " = " + price + "$");
        System.out.println("Number Children: " + children + "x" + 0.75 * price / adults + " = " + children * 0.75 * price / adults + "$");
        System.out.println("Number Special: " + special + " x " + 0.85 * price / adults + " = " + special * 0.85 * price / adults + "$");
        System.out.println("Price total booking: " + BookingManager.priceTotalBooking(price, adults, children, special) + "$");
        System.out.println("====================== ");

        System.out.println("If you want book this tour, please fill your information to here ");
        System.out.println("Enter your full name");
        String customerName = scanner.nextLine();
        System.out.println("Enter your address");
        String customerAddress = scanner.nextLine();

        String email;
        boolean checkPhone = false;
        String phone;
        do{
        System.out.println("Enter your phone");
        phone = scanner.nextLine();
            checkPhone= Main.checkValidatePhone(phone);
        }while (!checkPhone);

        boolean checkEmail;
        do {
            System.out.println("Enter your email");
            email = scanner.nextLine();
            checkEmail = Main.checkValidateEmail(email);
        } while (!checkEmail);

        System.out.println("Thank you for booking with us! ");
        System.out.println("We'll contact you within 01 working day");
        int codeBooking = Main.autoBookingCode();
        boolean statusBooking = false;

        double priceTotalBooking = BookingManager.priceTotalBooking(price, adults, children, special);
        BookingTour bookingTour = new BookingTour(codeBooking, date, new TourManager().getTourName(codeTour), customerName,
                customerAddress, phone, email, adults, children, special, date,
                 priceTotalBooking, statusBooking);
        new BookingManager().add(bookingTour);
        IOBooking.save(BookingManager.bookingTourList);
    }

    public static void main(String[] args) {
        menuAdmin();
        menuUser();
    }
}

