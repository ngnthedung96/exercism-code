import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class RnaTranscription {
    Map<String, String> rnaMap = Map.of(
        "G", "C",
        "C", "G",
        "T", "A",
        "A", "U"
    );
    String transcribe(String dnaStrand) {
        return Arrays.stream(dnaStrand.split("")).map(c -> this.rnaMap.getOrDefault(c, "")).collect(Collectors.joining(""));
    }

}
