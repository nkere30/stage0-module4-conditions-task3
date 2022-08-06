package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public static void amountOfDays(int month) {
        if(month < 1 || month > 12) {
            System.out.println("wrong number!");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(30);
        } else if(month == 2) {
            System.out.println(29);
        } else {
            System.out.println(31);
        }
    }

    public static void main(String[] args) {
        amountOfDays(1);
        amountOfDays(2);
        amountOfDays(3);
        amountOfDays(4);
        amountOfDays(5);
        amountOfDays(6);
        amountOfDays(7);
        amountOfDays(8);
        amountOfDays(9);
        amountOfDays(10);
        amountOfDays(11);
        amountOfDays(12);
        amountOfDays(13);

    }
}
