import java.util.ArrayList;
import java.util.List;

class HighScores {
    List<Integer> scores;
    public HighScores(List<Integer> highScores) {
        this.scores = highScores;
    }

    List<Integer> scores() {
        return this.scores;
    }

    Integer latest() {
        return this.scores.get(this.scores.size()-1);
    }

    Integer personalBest() {
        List<Integer> newScores = new ArrayList<>(this.scores);
        newScores.sort((a, b) -> b - a);
        return newScores.getFirst();
    }

    List<Integer> personalTopThree() {
        List<Integer> newScores = new ArrayList<>(this.scores);
        newScores.sort((a, b) -> b - a);
        return newScores.subList(0, Math.min(3, newScores.size()));
    }

}
