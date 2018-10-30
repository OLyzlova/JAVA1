import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws IOException {
        String lineFromFile = getStringFromFile ();

        List<String> words = parseLine (lineFromFile);

        Map<String, Integer> countedWords = countWords(words);

        ResultOutput.printWordStats (countedWords);
        ResultOutput.printMaxValueWord (countedWords);
    }

    private static String getStringFromFile() throws IOException {
        String fileName = "C:\\Users\\lyzlo\\Documents\\test.txt";
        BufferedReader reader = new BufferedReader (new FileReader (fileName));
        return reader.readLine ();
    }

    private static List<String> parseLine(String lineFromFile) {
        LineParse lp = new LineParse ();
        return lp.parseLine (lineFromFile);
    }

    private static TreeMap<String,Integer> countWords(List<String> words) {
        WordCounter wc = new WordCounter ();
        return wc.countWords (words);
    }
}