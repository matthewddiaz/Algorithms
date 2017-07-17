package com.matthewddiaz.algorithms.greedyAlgorithms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by matthewdiaz on 7/17/17.
 */
public class ActivitySelection  {
    //An Activity consists of a startTime and endTime.
    public static class Activity implements Comparable<Activity>{
        private int startTime;
        private int endTime;

        public Activity(int startTime, int endTime){
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime(){
            return this.startTime;
        }

        public int getEndTime(){
            return this.endTime;
        }

        /**
         * Comparison is based on the endTime attribute. Given activity A and B; the activity
         * that has a later end time is the greater one.
         * @param otherActivity
         * @return
         */
        @Override
        public int compareTo(Activity otherActivity) {
            if(this.endTime == otherActivity.endTime){
                return 0;
            }else if(this.endTime < otherActivity.endTime){
                return -1;
            }else{
                return 1;
            }
        }

        @Override
        public String toString(){
            return "Start Time: " + this.startTime +
                    " End Time: " + this.endTime + "\n";
        }
    }

    /**
     *
     * @param activities An array of activities
     * @return the max number of compatible activities
     */
    public static int findMaxNumberOfCompatibleActivities(Activity[] activities){
        if(activities == null || activities.length == 0){
            return 0;
        }

        //sort in non-descending order. Activities that end first will go before activities that end later.
        Arrays.sort(activities);
        return findMaxNumberOfCompatibleActivities(activities, 0) + 1;
    }

    /**
     * Helper function to findMaxNumberOfCompatibleActivities
     * @param activities
     * @param indexOfLastCompatibleActivity
     * @return
     */
    private static int findMaxNumberOfCompatibleActivities(Activity[] activities, int indexOfLastCompatibleActivity){
        //can't count the same activity
        int currentIndex = indexOfLastCompatibleActivity + 1;

        int endTimeOfLastCompatibleActivity = activities[indexOfLastCompatibleActivity].getEndTime();

        while(currentIndex < activities.length){
            if(activities[currentIndex].startTime > endTimeOfLastCompatibleActivity){
                return findMaxNumberOfCompatibleActivities(activities, currentIndex) + 1;
            }
            currentIndex++;
        }
        return 0;
    }


    /**
     *
     * @param activities An array of activities
     * @return A max set consisting of compatible activities
     */
    public static Set<Activity> findMaxActivitiesCompatible(Activity[] activities){
        if(activities == null || activities.length == 0){
            return null;
        }

        //sort in non-descending order. Activities that end first will go before activities that end later.
        Arrays.sort(activities);
        //create a new Tree Set. This will allow us to iterate the set in non-descending order
        Set<Activity> activitySet = new TreeSet<>();
        activitySet.add(activities[0]);
        findMaxActivitiesCompatible(activities, 0, activitySet);
        return activitySet;
    }

    /**
     *
     * @param activities
     * @param indexOfLastCompatibleActivity
     * @param compatibleActivities
     */
    private static void findMaxActivitiesCompatible(Activity[] activities,
                                                   int indexOfLastCompatibleActivity,
                                                   Set<Activity> compatibleActivities){
        //can't count the same activity
        int currentIndex = indexOfLastCompatibleActivity + 1;

        int endTimeOfLastCompatibleActivity = activities[indexOfLastCompatibleActivity].getEndTime();

        //choosing the greedy choice. That is the activity whose startTime is closest to the
        //last compatible activity's endTime
        while((currentIndex < activities.length) &&
                (activities[currentIndex].startTime < endTimeOfLastCompatibleActivity) ){
            currentIndex++;
        }

        if(currentIndex < activities.length){
            compatibleActivities.add(activities[currentIndex]);
            findMaxActivitiesCompatible(activities, currentIndex, compatibleActivities);
        }
    }
}
