package school.mjc.stage0.conditions.task3;

public class Seasons {
    public static void tellTheSeasonByMonthNumber(int month) {
        if(month >= 1 && month <=2 || month == 12) {
            System.out.println("Winter");
        } else if(month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if(month >= 6 && month <= 8 ) {
            System.out.println("Summer");
        } else if(month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("wrong number!");
        }
    }

    public static void main(String[] args) {
        tellTheSeasonByMonthNumber(1);
        tellTheSeasonByMonthNumber(2);
        tellTheSeasonByMonthNumber(3);
        tellTheSeasonByMonthNumber(4);
        tellTheSeasonByMonthNumber(5);
        tellTheSeasonByMonthNumber(6);
        tellTheSeasonByMonthNumber(7);
        tellTheSeasonByMonthNumber(8);
        tellTheSeasonByMonthNumber(9);
        tellTheSeasonByMonthNumber(10);
        tellTheSeasonByMonthNumber(11);
        tellTheSeasonByMonthNumber(12);
        tellTheSeasonByMonthNumber(13);
    }
}
