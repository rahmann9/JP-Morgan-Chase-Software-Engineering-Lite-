public class RewardValue {
/*This class must satisfy the following requirements:
RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
RewardValue must convert from miles to cash at a rate of 0.0035.*/

    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesToCash(milesValue);
        } else {
            this.cashValue = milesValue;
            this.milesValue = cashToMiles(cashValue);
        }
    }

    // Method to convert miles to cash
    private double milesToCash(double miles) {
        return miles * 0.0035;
    }

    // Method to convert cash to miles
    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public double getMilesValue() {
        return milesValue;
    }
}