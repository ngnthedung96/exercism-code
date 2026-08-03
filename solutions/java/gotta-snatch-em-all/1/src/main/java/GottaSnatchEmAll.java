import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {
    static Set<String> newCollection(List<String> cards) {
        Set<String> cardList = new HashSet<String>(cards);
        return cardList;
    }

    static boolean addCard(String card, Set<String> collection) {
        if(collection.contains(card)) return false;
        collection.add(card);
        return true;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> mineOnly = new HashSet<>(myCollection);
        mineOnly.removeAll(theirCollection);
        Set<String> theirsOnly = new HashSet<>(theirCollection);
        theirsOnly.removeAll(myCollection);
        return !mineOnly.isEmpty() && !theirsOnly.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<String>(collections.get(0));
        for(Set<String>collection: collections){
            common.retainAll(collection);
        }
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<String>(collections.get(0));
        for(Set<String>collection: collections){
            all.addAll(collection);
        };
        return all;
    }
}
