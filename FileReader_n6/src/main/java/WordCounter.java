import java.util.List;
import java.util.TreeMap;

public class WordCounter {
    public TreeMap<String, Integer> countWords (List<String> words) {
        TreeMap<String, Integer> countedWords = new TreeMap<String, Integer> ();

        for (String word : words)
        {
            if (countedWords.containsKey (word)) {
                int count = countedWords.get (word);
                count++;
                countedWords.put (word, count);
            } else {
                countedWords.put (word, 1);
            }
        }

        return countedWords;
    }
}