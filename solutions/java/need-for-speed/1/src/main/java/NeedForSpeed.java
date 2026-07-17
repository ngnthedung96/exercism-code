class NeedForSpeed {
    private final int speed;
    private final int batteryDrain;
    private int batteries = 100;
    private int distanceDriven;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteries <  batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(batteries>= batteryDrain){
            batteries -= batteryDrain;
            distanceDriven += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained()){
            car.drive();
        };
        return car.distanceDriven() >= distance;
    }
}
