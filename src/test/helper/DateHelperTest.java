package test.helper;

import main.helpers.DateHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateHelperTest {
    @Test
    public void should_return_100_when_input_range_is_full_month() {
        double result = DateHelper.getPercentageOfTheMonth("01 March - 31 March");

        assertEquals(100.0, result);
    }

    @Test
    public void should_return_correct_result_when_input_range_is_partial_month() {
        double result = DateHelper.getPercentageOfTheMonth("01 March - 30 March");

        assertEquals(96.7741935483871, result);

        result = DateHelper.getPercentageOfTheMonth("01 March - 2 March");
        assertEquals(6.451612903225806, result);
    }
}
