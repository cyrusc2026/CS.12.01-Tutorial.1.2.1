public class StepTracker {

        private int activeDays;
        private int totalSteps;
        private int Days;
        private final int StepsForActiveDay;
        public StepTracker(int goal){
            this.StepsForActiveDay = goal;
        }
        public int activeDays(){
            return activeDays;
        }
        public double averageSteps(){
            return (double) totalSteps /activeDays;
        }
        public void addDailySteps(int todaySteps){
            totalSteps += todaySteps;
            if (todaySteps >= StepsForActiveDay) activeDays++;
            Days++;
        }
        public int getActiveDays(){
            return activeDays;
        }

    public int getStepsForActiveDay() {
        return StepsForActiveDay;
    }

    public int getTotalSteps() {
        return totalSteps;
    }

    public int getDays() {
        return Days;
    }
}
