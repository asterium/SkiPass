package models.skipasses.validityPeriods;


import java.time.LocalTime;
import java.time.format.DateTimeParseException;

/**
 * Created by Asterium on 05.09.2016.
 */
public enum ContiniousValidityPeriod {
    TIME_9AM_1PM(1, "9:00", "13:00"),
    TIME_1PM_5PM(1, "13:00", "17:00"),
    DAY_1(1, "9:00", "17:00"),
    DAY_2(2, "9:00", "17:00"),
    DAY_5(5, "9:00", "17:00");

    private int numberOfDays;
    private LocalTime startTime;
    private LocalTime endTime;

    ContiniousValidityPeriod(int numberOfDays, String startTime, String endTime) {
        this.numberOfDays = numberOfDays;
        this.startTime = parseTime(startTime);
        this.endTime = parseTime(endTime);
    }

    private LocalTime parseTime(String time) {
        String[] timeParts = time.split(":");
        if (timeParts.length < 2)
            throw new DateTimeParseException("Failed to read date time provided. Please, ensure set data time is in correct format", time, 0);
        return LocalTime.of(Integer.valueOf(timeParts[0]), Integer.valueOf(timeParts[1]));
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
