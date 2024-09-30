import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 10.0; // Example cash value
        var rewardValue = new RewardValue(cashValue);

        // Calculate expected miles value
        double expectedMiles = cashValue / 0.0035; // Conversion calculation

        // Assert the conversion from cash to miles is accurate
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 1000; // Example miles value
        var rewardValue = new RewardValue(milesValue, true);

        // Calculate expected cash value
        double expectedCash = milesValue * 0.0035;

        // Assert the conversion from miles to cash is accurate
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}

