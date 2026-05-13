import java.util.Comparator;

public class ComparadorGoles implements Comparator <Futbolista> {
    public int compare (Futbolista futb1, Futbolista futb2) {
        return futb1.getNumGoles() - futb2.getNumGoles();

    }
}
