public class Main {
    public static void main(String[] args) {

        //Task 1
        byte clientOs = 0;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка");
        }

        //Task 2
        clientOs = 1;
        int clientDeviceYear = 2016;
        if (clientOs == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOs == 1) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        if (clientOs == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
            }


        //Task 3
        int year = 2024;
        if (year <= 1584){
            System.out.println("В " + year + " году еще не было определения 'високосный год'");
        } else if (year % 100 == 0) {
            System.out.println(year + " Год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");
        }
        //Task 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в течении суток");
        } else if (deliveryDistance >20 && deliveryDistance <=60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance >60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставки нет");
        }

    }
}
