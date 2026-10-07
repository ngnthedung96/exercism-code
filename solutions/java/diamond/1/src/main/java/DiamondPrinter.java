import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        ArrayList<Character> characters = new ArrayList<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            characters.add(c);
        }

        int targetIdx = characters.indexOf(a);
        if(targetIdx == -1) throw new IllegalArgumentException();
        int totalSpaces = (targetIdx + 1) * 2 - 1;
        int idxChar = targetIdx;
        int leftCursor = 0;
        int rightCursor = totalSpaces - 1;

        List<String> result = new ArrayList<String>();

        while (leftCursor <= rightCursor){
            char selectedChar = idxChar == targetIdx? a: characters.get(idxChar);
            StringBuilder text = new StringBuilder(" ".repeat(totalSpaces));
            text.setCharAt(leftCursor,selectedChar);
            text.setCharAt(rightCursor,selectedChar);
            if(result.isEmpty()){
                result.add(text.toString());
            }else{
                result.addFirst(text.toString());
                result.add(text.toString());
            }
            idxChar--;
            leftCursor++;
            rightCursor--;
        }
        System.out.println(result.toString());
        return result;
    }

    void main(String[] args) {
        printToList('G');
    }

}
