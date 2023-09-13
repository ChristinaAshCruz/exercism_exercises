public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeCooked) {
        return expectedMinutesInOven() - timeCooked;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        int prepMinutesPerLayer = 2;
        return prepMinutesPerLayer * layers;
    }
    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int layers, int timeCooked) {
        return preparationTimeInMinutes(layers) + timeCooked;
    }
}
