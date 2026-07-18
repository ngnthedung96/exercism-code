import java.util.ArrayList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        List<ProductionRemoteControlCar> duplicatedCars = new ArrayList<ProductionRemoteControlCar>(cars);
        duplicatedCars.sort(((o1, o2) -> Integer.compare(o2.getNumberOfVictories(), o1.getNumberOfVictories())));
        return duplicatedCars;
    }
}
