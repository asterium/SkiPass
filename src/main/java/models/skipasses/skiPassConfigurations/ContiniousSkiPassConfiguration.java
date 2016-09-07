package models.skipasses.skiPassConfigurations;

import models.interfaces.SkiPassConfiguration;
import models.skipasses.SkiPassType;
import models.skipasses.validityPeriods.ContiniousValidityPeriod;

/**
 * Created by Asterium on 07.09.2016.
 */
public class ContiniousSkiPassConfiguration implements SkiPassConfiguration {
    private int numberOfDaysLeft;
    private ContiniousValidityPeriod skiPassValidityPeriod;

    public ContiniousSkiPassConfiguration(ContiniousValidityPeriod period) {
        skiPassValidityPeriod = period;
        numberOfDaysLeft = period.getNumberOfDays();
    }


    @Override
    public SkiPassType getValidityType() {
        return SkiPassType.CONTINIOUS;
    }

    public int getNumberOfDaysLeft() {
        return numberOfDaysLeft;
    }

    public void setNumberOfDaysLeft(int numberOfDaysLeft) {
        this.numberOfDaysLeft = numberOfDaysLeft;
    }

}
