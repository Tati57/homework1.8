package task;

public class Main {
    public static void main(String[] args) {
                   }
private void printIsLeap(int year) {
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println("Високосный год");
    } else {
        System.out.println(" Не високосный год");
    }
}
        private static void printInstallationMessage(int os, int productionYear) {
        if (!(os == 0 || os == 1 )) {
            throw new RuntimeException("устройство поддерживаемо устройство");
        }
        var currentYear :int = localDate.now().getYear();
        String versionMessage = productionYear < currentYear ? "облегченную" : "";
        String osMessage = os == 0 ? "iOs" : "android";
            System.out.println("");
        if (os == 0){
            if (productionYear < 2015) {
                System.out.printf ("Установите %s версию приложения для %s по ссылке", versionMessage, osMessage);

        }



  private static  void printCalculateDeliveryDays (int distance){
                int start = 20;
                int stop = 40;
                int distance = 20;
                int result: // кол во дней
                if (distance < start) {
                    result = 1;
                } else {
                    result = (Math.abs((distance - start)/ stop) + 2);
                }
                System.out.println("Потребуется для доставки дней" + result);
                }

            }

    }
}