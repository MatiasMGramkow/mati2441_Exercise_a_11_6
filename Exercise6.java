import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Exercise6
{
    public static void main(String[] args)
    {
        List<Integer> unikListe = new LinkedList<>();
        unikListe.add(3);
        unikListe.add(7);
        unikListe.add(3);
        unikListe.add(-1);
        unikListe.add(2);
        unikListe.add(3);
        unikListe.add(7);
        unikListe.add(2);
        unikListe.add(15);
        unikListe.add(15);

        countUnique(unikListe);
        System.out.println(countUnique(unikListe));
    }

    public static Set countUnique (List<Integer> liste)
    {
        return new HashSet(liste);
    }
}
