public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int spendTime){
        int remainingTime = this.expectedMinutesInOven() - spendTime;
        return this.expectedMinutesInOven() - spendTime > 0? remainingTime: 0;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int spendTime){
        int preparationTimeInMinutes = this.preparationTimeInMinutes(layers);
        return preparationTimeInMinutes + spendTime;
    }
}
