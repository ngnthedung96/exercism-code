import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import static java.lang.Math.floor;

class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    public DnDCharacter() {
        strength = this.ability(this.rollDice());
        dexterity = this.ability(this.rollDice());
        constitution = this.ability(this.rollDice());
        intelligence = this.ability(this.rollDice());
        wisdom = this.ability(this.rollDice());
        charisma = this.ability(this.rollDice());
    }

    int ability(List<Integer> scores) {
        if(scores.size() != 4) {
            throw new IllegalArgumentException("Scores list must contain exactly 4 elements.");
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(scores);
        minHeap.poll();
        int sum = 0;
        int count = 3;
        while (!minHeap.isEmpty() && count-- > 0) {
            sum += minHeap.poll();
        }
        return sum;
    }

    List<Integer> rollDice() {
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rolls.add( (int) (Math.random() * 6) + 1);
        }
        return rolls;
    }

    int modifier(int input) {
        return (int) floor((input - 10) / 2.0);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + this.modifier(this.constitution);
    }
}
