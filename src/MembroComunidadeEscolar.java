public class MembroComunidadeEscolar extends Persoa {
    public int codigoCentro;
    private String nomeCentro;

    public MembroComunidadeEscolar (String nom, String dni, int edade, int codCentro, String nomCentro) {
        super(nom, dni, edade);
        this.codigoCentro = codCentro;
        this.nomeCentro = nomCentro;

    }

    public int getCodigoCentro() {
        return this.codigoCentro;
    }

    public void setCodigoCentro(int novoCodCentro) {
        if (novoCodCentro > 0) codigoCentro = novoCodCentro;
        else codigoCentro = 0;
    }
}

