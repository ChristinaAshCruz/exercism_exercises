public class ElonsToyCar {

    // notes:
    // car battery default at 100%
    // when you use remote control -> covers 20m + drains 1% of battery

    // remote control shows:
    // total distance car has driven -> "Driven <METERS> meters"
    // remaining battery charge -> "Battery at <PERCENTAGE>%"

    // when battery = 0% ---> display "Battery empty"
    private int totalDistance;
    private int batteryPercentage = 100;

    // task 1: Buy a brand-new remote controlled car
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    // task 2: Display the distance driven
    public String distanceDisplay() {
        return String.format("Driven %d meters", totalDistance);
    }

    // task 3: Display the battery percentage
    public String batteryDisplay() {
        if (batteryPercentage <= 0) {
            return "Battery empty";
        } else {
            return "Battery at " + batteryPercentage + "%";
        }
    }

    // task 4: Update the number of meters driven when driving
    public void drive() {

        // if battery is drained --> add 0 distance and set battery to 0
        if (batteryPercentage >= 1) {
            // / when you use remote control -> covers 20m + drains 1% of battery
            // increase distance by 20m
            totalDistance += 20;
            // decrease batteryPercentage by 1
            batteryPercentage -= 1;
        }
    }
}
