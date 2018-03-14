package main.enums;

import java.util.Arrays;
import java.util.NoSuchElementException;

public enum Month {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December;

    public static Month fromText(String value) {
        return Arrays.stream(values())
                .filter(Month -> Month.name().equals(value))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException(String.format("no element as %s", value)));
    }
}
