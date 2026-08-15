import java.util.Map;

class ResistorColorTrio {
    Map<String, Integer> colorMap = Map.of(
        "black", 0,
        "brown", 1,
        "red", 2,
        "orange", 3,
        "yellow", 4,
        "green", 5,
        "blue", 6,
        "violet", 7,
        "grey", 8,
        "white", 9
    );

    String label(String[] colors) {
        long result = 0;
        for(int i = 0; i < Math.min(colors.length, 3); i++){
            String color = colors[i];
            int colorValue =  this.colorMap.get(color);
            if(i < 2){
                result = result * 10 + colorValue;
            }else {
                result =  result * (long) Math.pow(10, colorValue);
            }
        }
        if(result >= 1000000000L){
            result = result / 1000000000L;
            return result + " gigaohms";
        } else if(result >= 1000000L){
            result = result / 1000000L;
            return result + " megaohms";
        } else if(result >= 1000){
            result = result / 1000;
            return result + " kiloohms";
        } else {
            return result + " ohms";
        }
    }
}
