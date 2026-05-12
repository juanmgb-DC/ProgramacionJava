import java.util.Arrays;

public class Persoa implements Comparable<Persoa> {

    public String nome;
    public String dni;
    public int edade;
    public double estatura;

    public Persoa (String nome, String dni, int edade, double estatura){
        this.nome = nome;
        this.dni = dni;
        this.edade = edade;
        this.estatura = estatura;
    }

    public Persoa (){
        nome = "";
        dni = "00000000T";
        edade = 0;
        estatura = 0;
    }

    public void mostrarDatos() {
        System.out.println("Nome: " + nome +"\nDni: " + dni +"\nEdade: " + edade +"\nEstatura: " + estatura);
    }


    @Override
    public boolean equals(Object outra){
        Persoa outraPersoa = (Persoa) outra;
        if (this.estatura == outraPersoa.estatura) return true;
        return false;
    }


    @Override
    public int compareTo(Persoa outra) {
        /*
        int resultadoCom = this.dni.compareTo(outra.dni);
        System.out.println(resultadoCom);
        if (resultadoCom > 0) return 1;
        else if (resultadoCom < 0) return -1;
        return 0;
        */

        return this.dni.compareTo(outra.dni);
    }

    public String toString() {
        return nome + ", " + dni + ", " + edade + ", " + estatura;
    }

    public static void  main (String[] args) {
        Persoa p1 = new Persoa("juan","111H",18,1.8);
        Persoa p2 = new Persoa("manu","222E",19,1.87);
        Persoa p3 = new Persoa("pepe","333H",20,1.78);

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.println(p3.compareTo(p3));

        ComparadorEdadesPersoa compEdades = new ComparadorEdadesPersoa();
        System.out.println(compEdades.compare(p2,p3));
        Persoa [] individuos = new Persoa[3];
        individuos[0] = p2;
        individuos[1] = p1;
        individuos[2] = p3;
        Arrays.sort(individuos);
        System.out.println(Arrays.toString(individuos));
        Arrays.sort(individuos, compEdades);



    }
}

