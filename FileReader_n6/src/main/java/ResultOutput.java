import java.util.Map;

public class ResultOutput {
    public static void printWordStats(Map<String, Integer> countedWords) {
        for (Map.Entry pair : countedWords.entrySet ()) {
            System.out.println (pair.getKey () + " встречается в файле " + pair.getValue () + " раз(а)");
        }
    }

    public static void printMaxValueWord(Map<String, Integer> countedWords) {
        Map.Entry<String, Integer> maxPair = null;

        for (Map.Entry pair : countedWords.entrySet ()) {
            if (maxPair == null || (Integer)pair.getValue () > maxPair.getValue ())
                maxPair = pair;
        }
        System.out.println ();
        System.out.print ("Слово с максимальным количеством повторений: \"" + maxPair.getKey () +"\". ");
        System.out.println ("Встречается " + maxPair.getValue () + " раз(а)");
    }
}