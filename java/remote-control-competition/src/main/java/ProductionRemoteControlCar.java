// task 1: implement interface
// implement RemoteControlCar interface
class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled;
    private int numberOfVictories;

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the
        // ProductionRemoteControlCar.drive() method");

        // task 2: Drive
        // drive method should make car travel 10 units
        distanceTravelled += 10;

    }

    public int getDistanceTravelled() {
        // throw new UnsupportedOperationException(
        // "Please implement the ProductionRemoteControlCar.getDistanceTravelled()
        // method");

        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.numberOfVictories, this.numberOfVictories);
    }
}
