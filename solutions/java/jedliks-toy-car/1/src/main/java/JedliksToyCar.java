public class JedliksToyCar {
    int batteries = 100;
    int distance = 0;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distance);
    }

    public String batteryDisplay() {
        if(batteries == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", batteries);
    }

    public void drive() {
        if(batteries > 0) {
            batteries -=1;
            distance +=20;
        }
    }
}
