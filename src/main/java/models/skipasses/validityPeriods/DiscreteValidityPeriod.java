package models.skipasses.validityPeriods;

/**
 * Created by Asterium on 05.09.2016.
 */
public enum DiscreteValidityPeriod {

    TIMES_10(10),
    TIMES_20(20),
    TIMES_50(50),
    TIMES_100(100);

    private int numberOfEntrances;

    DiscreteValidityPeriod(int numberOfEntrances) {
        this.numberOfEntrances = numberOfEntrances;
    }

    public int getNumberOfEntrances() {
        return numberOfEntrances;
    }
}
