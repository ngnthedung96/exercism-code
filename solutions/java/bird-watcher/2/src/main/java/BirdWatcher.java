
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};
        return birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasDayWithoutBirds = false;
        for(int i =0; i<= this.birdsPerDay.length -1; i++){
            if(this.birdsPerDay[i] == 0){
                hasDayWithoutBirds = true;
                break;
            };
        };
        return hasDayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int maxLength = numberOfDays > this.birdsPerDay.length? this.birdsPerDay.length: numberOfDays;
        for(int i =0; i< maxLength; i++){
            total += this.birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int total = 0;
        for(int i =0; i<= this.birdsPerDay.length -1; i++){
            if(this.birdsPerDay[i] >= 5) total ++;
        }
        return total;
    }
}
