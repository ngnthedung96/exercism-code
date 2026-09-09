public class EliudsEggs {
    public int eggCount(int number) {
        int count = 0;
        if(number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        while(number > 0){
            int binary = number % 2;
            number /= 2;
            if(binary == 1) count ++;
        }
        return count;
    }
}
