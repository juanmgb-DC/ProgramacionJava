import java.util.Arrays;

public class Futbolista extends Persoa2 {

    public String nome;
    public String dni;
    public int edade;
    private int numeroGoles;


    public Futbolista (String nome, String dni, int edade, int numGoles) {
        super(nome,dni,edade);
        this.numeroGoles = numGoles;

    }

    public int getNumGoles() {
        return numeroGoles;
    }


    public String toString() {
        return nome + ", " + dni + ", " + edade + ", " + numeroGoles; }




    public int compareTo(Futbolista outro) {

        /*
        int resultadoCom = this.dni.compareTo(outra.dni);
        System.out.println(resultadoCom);
        if (resultadoCom > 0) return 1;
        else if (resultadoCom < 0) return -1;
        return 0;
        */

        return this.dni.compareTo(outro.dni);
    }


    public static void main (String args[]){
        Futbolista equipo [] = new Futbolista [5];
        equipo [0] = new Futbolista("CR1","1345A",20,230);
        equipo [1] = new Futbolista("CR2","1345B",30,67);
        equipo [2] = new Futbolista("CR3","1345C",23,98);
        equipo [3] = new Futbolista("CR4","1345D",27,82);
        equipo [4] = new Futbolista("CR5","1345E",31,360);
        ComparadorGoles cg = new ComparadorGoles();
        Arrays.sort(equipo, cg);
        System.out.println(Arrays.toString((equipo)));
        ComparadorNome cn = new ComparadorNome();
        Arrays.sort(equipo,cn);
        System.out.println(Arrays.toString(equipo));
        Arrays.sort(equipo);
        System.out.println(Arrays.toString(equipo));
    }



}
