package com.matthewddiaz.algorithms.greedyAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matthewdiaz on 7/17/17.
 */
class ActivitySelectionTest {
    private int[] startTimes = {12, 8, 8, 2, 3, 6, 1, 3, 0, 5, 5};
    private int[] endTimes =   {16, 11, 12, 14, 10, 9, 4, 5, 6, 7, 9};

    @Test
    void findMaxNumberOfCompatibleActivities() {
        int maxActivities = 4;
        ActivitySelection.Activity[] activities = createActivities(startTimes, endTimes);
        int maxNumberOfCompatibleActivities = ActivitySelection.findMaxNumberOfCompatibleActivities(activities);

        assertEquals(maxActivities, maxNumberOfCompatibleActivities);
    }

    @Test
    void findMaxActivitiesCompatible() {
        String expectedActivities = "Start Time: 1 End Time: 4\n" +
                "Start Time: 5 End Time: 7\n" +
                "Start Time: 8 End Time: 11\n" +
                "Start Time: 12 End Time: 16\n";
        ActivitySelection.Activity[] activities = createActivities(startTimes, endTimes);

        Set<ActivitySelection.Activity> maxCompatibleActivitySet = ActivitySelection.findMaxActivitiesCompatible(activities);
        String actualActivitiesStr = generateActivitiesStr(maxCompatibleActivitySet);
        assertEquals(expectedActivities, actualActivitiesStr);
    }

    private String generateActivitiesStr(Set<ActivitySelection.Activity> activitySet){
        StringBuffer buffer = new StringBuffer();
        for(ActivitySelection.Activity activity : activitySet){
            buffer.append(activity);
        }

        return buffer.toString();
    }

    private ActivitySelection.Activity[] createActivities(int[] startTimes, int[] endTimes){
        ActivitySelection.Activity[] activities = new ActivitySelection.Activity[startTimes.length];

        for(int index = 0; index < activities.length; index++){
            activities[index] = new ActivitySelection.Activity(startTimes[index], endTimes[index]);
        }
        return activities;
    }

}