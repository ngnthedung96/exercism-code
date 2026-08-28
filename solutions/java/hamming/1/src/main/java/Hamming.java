public class Hamming {
    String leftStrand;
    String rightStrand;
    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
       this.leftStrand = leftStrand;
       this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        if(leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
        char[] leftChars = leftStrand.toCharArray();
        char[] rightChars = rightStrand.toCharArray();

        int distance = 0;

        for(int i = 0; i < leftChars.length; i++){
            if(leftChars[i] != rightChars[i]){
                distance++;
            }
        }
        return distance;
    }
}
