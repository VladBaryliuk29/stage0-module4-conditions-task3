package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            case (1), (7), (5), (10), (12), (3):
                System.out.println(31);
                break;
            case (2):
                System.out.println(28);
                break;
            case (4), (9), (8), (6), (11):
                System.out.println(30);
                break;
            default:
                System.out.println("wrong number!");
        }
    }
}
