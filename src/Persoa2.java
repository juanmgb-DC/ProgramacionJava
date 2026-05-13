import java.util.Arrays;

public class Persoa2 implements Comparable<Persoa2> {

    public String nome;
    public String dni;
    public int edade;

    public Persoa2(String nome, String dni, int edade) {
        this.nome = nome;
        this.dni = dni;
        this.edade = edade;

    }

    public Persoa2() {
        nome = "";
        dni = "00000000T";
        edade = 0;
    }

    public void mostrarDatos() {
        System.out.println("Nome: " + nome + "\nDni: " + dni + "\nEdade: " + edade);
    }


    @Override
    public boolean equals(Object outro){
        Persoa2 outraPersoa = (Persoa2) outro;
        if (this.dni.equals(outraPersoa.dni)) return true;
        return false;
    }



    @Override
    public int compareTo(Persoa2 outra) {

        return this.dni.compareTo(outra.dni);
    }

    public String toString() {
        return nome + ", " + dni + ", " + edade;
    }
}
