import java.util.*;

public class WordsChecker {

    private final Set<String> words = new LinkedHashSet<>();

    public WordsChecker(String text) {
        String[] isSplit = text.split("\\P{IsAlphabetic}+");// array
        words.addAll(Arrays.asList(isSplit));//tip from idea, I was going to do foreach
    }

    public boolean hasWord(String word) {
        return words.contains(word);
    }
}
