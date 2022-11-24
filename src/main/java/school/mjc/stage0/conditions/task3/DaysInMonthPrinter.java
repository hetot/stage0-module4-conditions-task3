package school.mjc.stage0.conditions.task3;

import java.time.Month;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month > 12 || month < 1) {
            System.out.println("wrong number!");
        } else {
            Month a = Month.of(month);
            System.out.println(a.length(false));
        }
    }
}
