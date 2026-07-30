import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int intRandomIdx = Math.abs(this.random.nextInt(PLANET_CLASSES.length ));
        return PLANET_CLASSES[intRandomIdx];
    }

    String randomShipRegistryNumber() {
        return "NCC-" + (random.nextInt(9000) + 1000);
    }

    double randomStardate() {
        return Math.abs(this.random.nextDouble(41000.0, 42000.0));
    }
}
