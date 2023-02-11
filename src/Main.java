

import java.time.LocalDate;

class Scratch {
    public static void main(String[] args) {
        int year = 2023;
        printInfoAboutYear(year);
        printInfoAboutVersion(1, 2002);
        int deliveryDistance = 10;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days == -1) {
            System.out.println("Доставкка невозможна на растояниие " + deliveryDistance + " км.");
        } else {
            System.out.println("Время доставки " + days + " дн.");
        }
    }

    private static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance >= 20 &&deliveryDistance <= 60) {
            return 2;
        }
        if (deliveryDistance >= 60 &&deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }



    private static void printInfoAboutVersion (int os,
                                               int productionYear) {
        boolean b = os > 1;
        if (os < 0 && os > 1) {
            System.out.println("OS должна быть равна 0 или 1");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        StringBuilder result = new StringBuilder("Установите ");
        if (currentYear > productionYear) {
            result.append("облегченную версию для ");
        } else {
            result.append(" версию для ");
        }
        if (os == 0) {
            result.append("IOS");
        } else {
            result.append("Android");
        }
        System.out.println(result);
    }




    private static void printInfoAboutYear(int year){


        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }
    private static boolean isLeapYear (int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

}
