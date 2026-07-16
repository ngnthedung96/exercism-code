import java.util.ArrayList;
import java.util.List;

class SqueakyClean {
    static String clean(String identifier) {
        String replaceSpace =  identifier.replaceAll(" ", "_");
        List<Character> charArray = new ArrayList<Character>(replaceSpace.chars().mapToObj(c -> (char) c).toList());
        for(int i = 0; i < charArray.size(); i++){
            if(charArray.get(i) == '-'){
                if(i + 1 < charArray.size()){
                    Character selectedChar = Character.toUpperCase(charArray.get(i + 1));
                    charArray.set(i+ 1, selectedChar);
                    charArray.remove(i);
                    i--;
                }
            }
            if(Character.isDigit(charArray.get(i))){
                Character letter = charArray.get(i);
                switch (letter) {
                    case '4':
                        letter = 'a';
                        break;
                    case '3':
                        letter = 'e';
                        break;
                    case '0':
                        letter = 'o';
                        break;
                    case '1':
                        letter = 'l';
                        break;
                    case '7':
                        letter = 't';
                        break;
                }
                charArray.set(i, letter);
            }
            if(!Character.isLetterOrDigit(charArray.get(i)) && charArray.get(i) != '_'){
                charArray.remove(i);
                i--;
            }
        }
        StringBuilder result = new StringBuilder();
        for(Character c: charArray) result.append(c);
        return result.toString();
    }
}
