public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int driveUnit = 20;
    private int distanceTravelled;
    public void drive() {
        distanceTravelled += driveUnit;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
