package main.helpers;

import main.enums.Months;

import java.time.YearMonth;

public class DateHelper {
    public static Double getPercentageOfTheMonth(String input) {
        String[] splitInput = input.split("-");
        String[] startDate = splitToDate(splitInput[0]);
        String[] endDate = splitToDate(splitInput[1]);

        YearMonth yearMonth = YearMonth.of(2018, Months.fromText(startDate[1]).ordinal() + 1);
        int daysInMonth = yearMonth.lengthOfMonth();
        int daysInCalculation = Integer.parseInt(endDate[0]) - Integer.parseInt(startDate[0]) + 1;
        return daysInCalculation * 100d / daysInMonth;
    }

    private static String[] splitToDate(String dates) {
        return dates.trim().split(" ");
    }
}
