package test.enums;

import main.enums.Month;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonthTest {
    @Test
    public void should_return_corresponding_month_when_execute_get_text_with_correct_name() {
        assertEquals(Month.March, Month.fromText("March"));
        assertEquals(Month.April, Month.fromText("April"));
    }

    @Test
    public void should_throw_exception_when_execute_get_text_with_incorrect_name() {
        assertThrows(NoSuchElementException.class, () -> {
            Month.fromText("Mach");
        });
    }
}
