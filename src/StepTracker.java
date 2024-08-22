public class StepTracker {

        private int activeDays = 0;
        private int totalSteps = 0;
        private int Days = 0;
        private final int StepsForActiveDay;
        public StepTracker(int goal){
            this.StepsForActiveDay = goal;
        }
        public int activeDays(){
            return activeDays;
        }
        public double averageSteps(){
            if (totalSteps == 0 && Days == 0) return 0.0;
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
