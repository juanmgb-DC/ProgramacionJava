import java.util.Comparator;

public class ComparadorEdadesPersoa implements Comparator<Persoa> {
    @Override
    public int compare(Persoa p1, Persoa p2) {
        return p1.edade - p2.edade;
    }
}
