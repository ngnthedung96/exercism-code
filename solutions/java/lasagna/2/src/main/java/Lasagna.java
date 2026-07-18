public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int spendTime){
        int remainingTime = this.expectedMinutesInOven() - spendTime;
        return this.expectedMinutesInOven() - spendTime > 0? remainingTime: 0;
    }
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int spendTime){
        int preparationTimeInMinutes = this.preparationTimeInMinutes(layers);
        return preparationTimeInMinutes + spendTime;
    }
}
