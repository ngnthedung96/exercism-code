class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        char[] numberStrings = String.valueOf(numberToCheck).toCharArray();
        int result = 0;
        for(int i = 0; i < numberStrings.length; i++){
            char numberString = numberStrings[i];
            result += (int) Math.pow(Character.getNumericValue(numberString), numberStrings.length);
        };
        return result == numberToCheck;
    }

}
