package skipasses;


import models.skipasses.validityPeriods.ContiniousValidityPeriod;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

/**
 * Created by Asterium on 07.09.2016.
 */

public class ContiniousValidityPeriodTest {

    @Test
    public void testStartDateProcessedCorrectly() {
        LocalTime actual = ContiniousValidityPeriod.TIME_9AM_1PM.getStartTime();
        LocalTime expected = LocalTime.of(9, 0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEndDateProcessedCorrectly() {
        LocalTime actual = ContiniousValidityPeriod.DAY_5.getEndTime();
        LocalTime expected = LocalTime.of(17, 00);
        Assert.assertEquals(expected, actual);
    }

}
