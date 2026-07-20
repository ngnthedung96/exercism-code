public class CarsAssemble {
    public double rate (int speed){
        double successRate = 0;
        if(speed >=1 && speed <=4) successRate = 100;
        else if(speed >=5 && speed <=8) successRate = 90;
        else if(speed == 9) successRate = 80;
        else if(speed == 10) successRate = 77;
        return (double) (successRate / 100);
    }
    public double productionRatePerHour(int speed) {
        return (double) speed * 221 * rate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (this.productionRatePerHour(speed)/ 60);
    }
}
