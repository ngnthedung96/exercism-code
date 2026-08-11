import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if(square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        if(square == 1) return BigInteger.valueOf(1);
        BigInteger doubleValue = BigInteger.valueOf(2);
        return  this.grainsOnSquare(square - 1).multiply(doubleValue);
    }

    BigInteger grainsOnBoard() {
        int totalSquare = 64;
        BigInteger result = BigInteger.valueOf(0);
        while (totalSquare > 0){
            result = result.add(this.grainsOnSquare(totalSquare));
            totalSquare--;
        }
        return result;
    }

}
