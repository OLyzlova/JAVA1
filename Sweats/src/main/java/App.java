import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Sweats> list = createListOfSweats ();

        List<Sweats> present = Present.createPresent (list);

        printPresent (present);
    }

    private static List<Sweats> createListOfSweats() {
        List<Sweats> list = new ArrayList<Sweats> ();

        list.add (new Candy ("Конфета", 50, 10, "ball"));
        list.add (new IceCream ("Эскимо", 100, 120, true));
        list.add (new JellyBean ("Жевательная конфета", 5, 15, "yellow"));
        list.add (new Lollipop ("Леденец", 40, 70, 4));
        list.add (new Pie ("Яблочный пирог", 500, 350, "яблоко"));
        list.add (new Pie ("Пирог с капустой", 700, 300, "капуста"));

        return list;
    }

    private static void printPresent(List<Sweats> present) {
        int overallWeight = 0;
        int overallPrice = 0;

        for (int i = 0; i < present.size (); i++) {
            overallWeight += present.get (i).getWeight ();
            overallPrice += present.get (i).getPrice ();
        }

        System.out.println ("Подарок содержит:");
        for (Sweats sw : present) {
            System.out.println (sw);
        }
        System.out.println ("-----------");
        System.out.println ("Общий вес подарка: " + overallWeight + " г");
        System.out.println ("Цена подарка: " + overallPrice + " руб.");
    }
}