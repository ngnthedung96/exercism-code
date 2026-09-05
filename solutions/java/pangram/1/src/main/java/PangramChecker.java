import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        Set<Character> letters = new HashSet<>();
        for(char inputChar: input.toCharArray()){
            if(Character.isLetter(inputChar)) letters.add(Character.toLowerCase(inputChar));
        };
        return letters.size() == 26;
    }
}
