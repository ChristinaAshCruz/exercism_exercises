public class CarsAssemble {

    // instruction notes

    // writing code to analyze production of an assembly line
    // assembly line speed can range for 0 - 10

    // lowest speed (1) ---> 221 cars produced/ hr
    // HOWEVER, higher the speed = higher the faulty cars are produced and discarded

    // 1 to 4:100% success rate
    // 5 to 8:90% success rate
    // 9:80% success rate
    // 10:77% success rate.

    // task 1: calculate production rate per hour
    public double productionRatePerHour(int speed) {
        double productionResult = 0;
        // first we need to calculate 221 by the speed
        productionResult = 221 * speed;

        // now we need to create a switch case where we compare speeds
        if (speed >= 1 && speed <= 4) {
            return productionResult;
        } else if (speed >= 5 && speed <= 8) {
            return productionResult * .9;
        } else if (speed == 9) {
            return productionResult * .8;
        } else {
            return productionResult * .77;
        }
    }

    public int workingItemsPerMinute(int speed) {

        // find the production result and then divide that by 60 (# of minutes per hour)
        int hourlyResult = (int) Math.floor(productionRatePerHour(speed));
        int result = hourlyResult / 60;

        return result;
    }
}
