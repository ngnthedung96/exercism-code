class CollatzCalculator {
    int computeStepCount(int start) {
        if(start < 1) throw new IllegalArgumentException("Only positive integers are allowed");
        if(start == 1) return 0;
        int count = 0;
        while (start != 1){
            if(start % 2 == 0){
                start = start /2;
                count++;
            }else{
                start = start*3 + 1;
                count++;
            }
        }
        return count;
    }
}
