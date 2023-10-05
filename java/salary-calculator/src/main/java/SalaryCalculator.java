public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        // task 1: Determine the salary multiplier

        // let's create a boolean that will return whether the 'daysSkipped' is true
        boolean daysSkippedMoreThanFive = daysSkipped >= 5;

        // store the multiplier values for penalty and without penalty
        int penaltyMultiplier = 0.85;
        int regularMultiplier = 1;

        // create a ternary statement that will return the final multiplier
        int multiplier = daysSkippedMoreThanFive ? penaltyMultiplier : regularMultiplier;

        return multiplier;
    }

    public int multiplierPerProductsSold(int productsSold) {

        // task 2: Calculate the bonus for products sold
        // Implement the multiplierPerProductsSold and bonusForProductSold methods

        // if employee sold 20+ products ==> mutliplier + 13

        // ternary statement: if our boolean is true, return 13. if not, return 0;
        boolean productsSoldMoreThanTwenty = productsSold >= 20;

        int trueValue = 13;
        int falseValue = 0;

        int multiplierIncrease = productsSoldMoreThanTwenty ? trueValue : falseValue;
        return multiplierIncrease;
    }

    public double bonusForProductSold(int productsSold) {  
        // return the total bonus in monetary units
        if()
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
    }
}
