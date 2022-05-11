import java.time.LocalDate;

public class Main {
    public  static void printSeparator(){
        System.out.println("--------------------------------");
    }

    // Задание 1
    public static void checkYear (int year){
        if (year % 4 == 0){
            System.out.println( year + " год является високосным");
        } else if (year % 100 != 0){
            System.out.println( year + " год не является високосным");
        }
    }

    // Задание 2
    public static void checkOsAndYear (int os, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию для IOS по ссылке");
        } else if (os == 0 && clientDeviceYear == currentYear ){
            System.out.println("Установите версию для IOS по ссылке");
        }
        if (os == 1 && clientDeviceYear < currentYear){
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else if (os == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию для Android по ссылке");
        }
    }

    // Задание 3
    public static int deliveryDay (int deliveryDistance){
        int day = 0;
        if (deliveryDistance <= 20){
            day+= 1;
            System.out.println("На доставку потребуется " + day + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60 ) {
            day+= 2;
            System.out.println("На доставку потребуется " + day + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day+= 3;
            System.out.println("На доставку потребуется " + day + " дня");
        } else {
            System.out.println("Доставка не осуществляется");
        }
        return day;
    }
    public static void main(String[] args) {
        // Задание 1
        checkYear(2022);
        printSeparator();

        // Задание 2
        checkOsAndYear(1, 2021);
        printSeparator();

        // Задание 3
        deliveryDay(42);
    }
}