class NeedForSpeed {

    private int speed = 0;
    private int batteryDrain;
    private int distance;

    private int batteryPercentage = 100;

    // task 1: create a remote controlled car constructor
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;

    }

    // task 4: check for a drained battery
    public boolean batteryDrained() {
        // if our battery percentage is 0...
        if (batteryPercentage == 0) {
            return true;
            // if our battery has NOT reached 0...
        } else {
            return false;
        }
    }

    // task 3B: return the total distance driven
    public int distanceDriven() {
        // return number of meters driven by car
        return distance;
    }

    // task 3: create a function where user can drive the car object
    public void drive() {
        // update number of meters driven (based on car speed)
        // if the batteryDrain is less than how much battery is left...
        if (batteryDrain <= batteryPercentage) {
            // increase our distance by how many meters covered
            distance += speed;
            // decrease our battery percentage by our car's battery drain
            batteryPercentage -= batteryDrain;
        }
    }

    // task 5: create a Nitro remote control object
    public static NeedForSpeed nitro() {
        // createa nitro car with 50 speed and a battery drain of 4
        var car = new NeedForSpeed(50, 4);
        return car;
    }
}

class RaceTrack {
    private int distance;

    // task 2: create a race track constructor
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    // task 6: check if remote control car can finish a race
    public boolean tryFinishTrack(NeedForSpeed car) {
        // we need to create a while statement
        // while our car battery return false (still has battery left)...
        while (!car.batteryDrained()) {
            // drive the car
            car.drive();
        }
        // check whether car.distanceDriven() is less or equal to racetrack distance
        return (car.distanceDriven() < distance) ? false : true;
    }
}
