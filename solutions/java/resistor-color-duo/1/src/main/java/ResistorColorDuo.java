import java.util.LinkedHashMap;
import java.util.Map;

class ResistorColorDuo {
    Map<String, Integer> colorMap = new LinkedHashMap<>();
    public ResistorColorDuo () {
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

    int value(String[] colors) {
        int result = 0;
        for(int i = 0; i < Math.min(2, colors.length); i++){
            String color = colors[i];
            int colorValue = this.colorMap.get(color);
            result = result * 10 + colorValue;
        }
        return result;
    }
}
