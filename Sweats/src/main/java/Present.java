import java.util.ArrayList;
import java.util.List;

public class Present {
    public static List<Sweats> createPresent (List<Sweats> list) {
        int size = (int) (Math.random () * list.size ());
        if (size == 0)
            size++;

        List<Sweats> present = new ArrayList<Sweats> ();

        for (int i = 0; i < size; i++)
            present.add (list.get ((int) (Math.random () * list.size ())));

        return present;
    }
}
