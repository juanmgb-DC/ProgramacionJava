public class exemplosArray {

    public static void  main (String[] args){

        int [] numeros = {1,2,3,4,5};
        char [] letras = new char[10];
        letras[0] = 'a';
        letras[1] = 'b';

        for (int i = 0; i<5; i++) {
            System.out.println("O número é: " + numeros[i]);
        }

        for (int n: numeros) {
            System.out.println("O número é: " + n);
        }


        String [] nomes;
        nomes = new String[10];
        nomes [0] = "Hugo";
        nomes [1] = "Pedro";
        nomes [2] = new String ("Ana");

        Persoa [] equipo;
        equipo =  new Persoa[5];
        equipo [0] = new Persoa("Ramón","4425E",22);
        equipo [1] = new Persoa("Mario","8527U",21);
        equipo [2] = new Persoa("Juan","9374A",23);
        equipo [3] = new Persoa("Fran","4599C",28);
        equipo [4] = new Persoa("Pepe","5482B",23);



        System.out.println("Numero de letras total: " + ((equipo[0].nome.length()) + (equipo[1].nome.length()) + (equipo[2].nome.length()) + (equipo[3].nome.length()) + (equipo[4].nome.length())));
        System.out.println("Media de edad: " + ( (equipo[0].edade) + (equipo[1].edade) + (equipo[2].edade) + (equipo[3].edade) + (equipo[4].edade)) / 5);



    }
}
