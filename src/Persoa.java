public class Persoa {

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
}

