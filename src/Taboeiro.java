import java.util.Random;

public class Taboeiro {
    char[][] taboeiro;

    public Taboeiro(int dimension, int barcos) {
        taboeiro = new char[dimension][dimension];
        iniciarTaboeiro(4);
    }

    private void iniciarTaboeiro(int numBarcos) {
        for (int i = 0; i < numBarcos; i++) {
            for (int j=0; j < taboeiro[0].length; j++){
                taboeiro[i][j] = '\u007E';

            }
        }
        for (int i = 0; i < numBarcos; i++) {
            java.util.Random r = new Random();
            while (true) {
            int x = r.nextInt(taboeiro.length);
            int y = r.nextInt(taboeiro.length);
            if (taboeiro[x][y]!='B'){
                taboeiro[x][y] = 'B';
                break;

            }

        }
    }
    }
public void mostrarLinha(int dimension){
        for (int i=0; i < dimension; i++){
            System.out.print("+-");
        }
    System.out.println("+");
}

public void mostrarTaboeiro(){
        mostrarLinha(taboeiro[0].length);
        for (int i=0; i < taboeiro.length; i++){
            for (int j=0; j < taboeiro[0].length; j++){
                System.out.print("|" + taboeiro[i][j]);
            }
        }
        mostrarLinha(taboeiro[0].length);
    }
    public static void main (String args[]){
        Taboeiro t = new Taboeiro(4,4);
        t.iniciarTaboeiro(4);
        t.mostrarTaboeiro();
    }
}
