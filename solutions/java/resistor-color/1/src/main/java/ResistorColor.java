import java.util.LinkedHashMap;
import java.util.Map;

class ResistorColor {
    Map<String, Integer> colorMap = new LinkedHashMap<>();
    public ResistorColor () {
        this.colorMap.put("black", 0);
        this.colorMap.put("brown", 1);
        this.colorMap.put("red", 2);
        this.colorMap.put("orange", 3);
        this.colorMap.put("yellow", 4);
        this.colorMap.put("green", 5);
        this.colorMap.put("blue", 6);
        this.colorMap.put("violet", 7);
        this.colorMap.put("grey", 8);
        this.colorMap.put("white", 9);
    }
    int colorCode(String color) {
        return this.colorMap.get(color);
    }

    String[] colors() {
        return this.colorMap.keySet().toArray(new String[0]);
    }
}
