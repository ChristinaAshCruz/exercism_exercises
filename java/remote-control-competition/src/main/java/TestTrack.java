import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        // throw new UnsupportedOperationException("Please implement the (static)
        // TestTrack.race() method");

        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        Collections.sort(cars);
        return cars;
    }
}
