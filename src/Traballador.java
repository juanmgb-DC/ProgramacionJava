
public class Traballador extends Persoa {
    public int salario;
    public int edade;

    public Traballador(String nome, String dni, int edade, double estatura, int salario) {
        super(nome, dni, edade, estatura);
        this.salario = salario;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salario: " + salario + "\nEstatura: " + estatura);
    }

    public static void main (String[] args){
        Traballador t = new Traballador("Pepe","111H",18,1.77,2500);
        Persoa p = new Persoa("Luis","111H",22,1.87);
        Persoa persoas [] = new Persoa[2];
        persoas[0] = p;
        persoas[1] = t;
        System.out.println("Executando traballador");
        System.out.println(persoas[1].estatura);
    }
}
