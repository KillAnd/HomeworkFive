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
        clientOs = 0;
        int clientDeviceYear = 2000;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
            if (clientOs == 1 && clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        }
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientOs == 0 && clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
}