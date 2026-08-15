import java.util.*;

class Acronym {
    String phrase;
    Acronym(String phrase) {
        String cleaned = phrase.replaceAll("[^a-zA-Z0-9\\s-]", "");
        StringBuilder result = new StringBuilder();
        List<String> ArrayPhrases = new ArrayList<>(Arrays.stream(cleaned.split("[ -]")).toList());
        System.out.println(ArrayPhrases.toString());

        for(String p : ArrayPhrases) {
            if(!p.isEmpty()) result.append(p.charAt(0));
        };

        this.phrase = result.toString().toUpperCase();
    }

    String get() {
        return this.phrase;
    }

}
