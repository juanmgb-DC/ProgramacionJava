public class Persoa {

    public String nome;
    public String dni;
    public int edade;

    public Persoa (String nome, String dni, int edade){
        this.nome = nome;
        this.dni = dni;
        this.edade = edade;
    }

    public Persoa (){
        nome = "";
        dni = "00000000T";
        edade = 0;
    }
}

