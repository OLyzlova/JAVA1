import java.util.Arrays;
import java.util.List;

public class LineParse {
    public List<String> parseLine (String line) {
        String[] tempWords = line.split (" ");
        return Arrays.asList (tempWords);
    }
}