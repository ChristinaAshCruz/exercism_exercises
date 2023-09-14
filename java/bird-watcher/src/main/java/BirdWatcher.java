
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = new int[] { 0, 2, 5, 3, 7, 8, 4 };
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];

    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        int numberOfDaysWithNoVisits = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                numberOfDaysWithNoVisits++;
            }
        }
        if (numberOfDaysWithNoVisits > 0) {
            return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        int totalVisitsForNumberOfDays = 0;
        for (int i = 0; i < numberOfDays; i++) {
            totalVisitsForNumberOfDays += birdsPerDay[i];
        }
        return totalVisitsForNumberOfDays;
    }

    public int getBusyDays() {
        int numberOfBusyDays = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                numberOfBusyDays++;
            }
        }
        return numberOfBusyDays;
    }
}
