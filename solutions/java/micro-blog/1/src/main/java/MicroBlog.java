class MicroBlog {
    public String truncate(String input) {
        int[] inputLength = input.codePoints().toArray();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < Math.min(5,inputLength.length); i++){
            result.append(new String (Character.toChars(inputLength[i])));
        }
        return result.toString().trim();
    }
}
