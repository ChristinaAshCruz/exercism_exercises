// task 1: implement interface
// implement RemoteControlCar interface
public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distanceTravelled;

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the
        // ExperimentalRemoteControlCar.drive() method");

        // task 2: Drive
        // drive method should make car travel 20 units
        distanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        // throw new UnsupportedOperationException(
        // "Please implement the ExperimentalRemoteControlCar.getDistanceTravelled()
        // method");
        return distanceTravelled;
    }
}
