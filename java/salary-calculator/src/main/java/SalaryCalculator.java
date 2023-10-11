public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        // task 1: Determine the salary multiplier

        // let's create a boolean that will return whether the 'daysSkipped' is true
        boolean daysSkippedMoreThanFive = daysSkipped >= 5;

        // store the multiplier values for penalty and without penalty
        double penaltyMultiplier = 0.85;
        double regularMultiplier = 1.00;

        // create a ternary statement that will return the final multiplier
        double multiplier = daysSkippedMoreThanFive ? penaltyMultiplier : regularMultiplier;

        return multiplier;
    }

    public int multiplierPerProductsSold(int productsSold) {

        // task 2: Calculate the bonus for products sold
        // Implement the multiplierPerProductsSold and bonusForProductSold methods

        // ternary statement: if our boolean is true, return 13. if not, return 0;
        boolean productsSoldMoreThanTwenty = productsSold >= 20;

        int bonusMultiplier = 13;
        int regularMultiplier = 10;

        int multiplier = productsSoldMoreThanTwenty ? bonusMultiplier : regularMultiplier;
        return multiplier;
    }

    public double bonusForProductSold(int productsSold) {
        // find bonus by multiplying multiplierForProducts by products sold
        double productBonus = multiplierPerProductsSold(productsSold) * productsSold;
        return productBonus;

    }

    public double finalSalary(int daysSkipped, int productsSold) {
        // multiply base salary of 1000.00 + sum bonus --> then return result

        double baseSalary = 1000.00;

        double bonusForProducts = bonusForProductSold(productsSold);

        // find finalSalary by multiplying baseSalary by multiplerPerDaysSkipped and
        // adding bonus for products
        double finalSalary = (baseSalary * multiplierPerDaysSkipped(daysSkipped)) + (bonusForProducts);

        // salaries need to be CAPPED at 2000.00
        double maxSalary = 2000.00;

        return finalSalary > maxSalary ? maxSalary : finalSalary;
    }
}
