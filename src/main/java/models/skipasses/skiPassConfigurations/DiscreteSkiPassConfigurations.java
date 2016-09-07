package models.skipasses.skiPassConfigurations;

import models.interfaces.SkiPassConfiguration;
import models.skipasses.SkiPassType;
import models.skipasses.validityPeriods.DiscreteValidityPeriod;

/**
 * Created by Asterium on 07.09.2016.
 */
public class DiscreteSkiPassConfigurations implements SkiPassConfiguration {

    int numberOfEntrancesLeft;

    public DiscreteSkiPassConfigurations(DiscreteValidityPeriod period) {
        numberOfEntrancesLeft = period.getNumberOfEntrances();
    }

    public int getNumberOfEntrancesLeft() {
        return numberOfEntrancesLeft;
    }

    public void setNumberOfEntrancesLeft(int numberOfEntrancesLeft) {
        this.numberOfEntrancesLeft = numberOfEntrancesLeft;
    }

    @Override
    public SkiPassType getValidityType() {
        return SkiPassType.DISCRETE;
    }
}
