package test.enums;

import main.enums.Months;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonthsTest {
    @Test
    public void should_return_corresponding_month_when_execute_get_text_with_correct_name() {
        assertEquals(Months.March, Months.fromText("March"));
        assertEquals(Months.April, Months.fromText("April"));
    }

    @Test
    public void should_throw_exception_when_execute_get_text_with_incorrect_name() {
        assertThrows(NoSuchElementException.class, () -> {
            Months.fromText("Mach");
        });
    }
}
