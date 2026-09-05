class NaturalNumber {
    private int originalNumber;
    private int number;
    NaturalNumber(int number) {
        if(number <= 0) throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.originalNumber = number;
        int totalSum = 0;
        for(int i = 1; i <= number; i++){
            if(number % i ==0 && i!= number) totalSum += i;
            if(totalSum > number) break;
        };
        this.number =  totalSum;
    }

    Classification getClassification() {
        if(this.number < this.originalNumber) return Classification.DEFICIENT;
        if(this.number == this.originalNumber) return Classification.PERFECT;
        return Classification.ABUNDANT;
    }
}

