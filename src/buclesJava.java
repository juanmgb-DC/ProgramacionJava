import java.util.Scanner;

public class buclesJava {
    public static void main (String[]args){
        int contador = 0;
        while (contador <= 5){
            System.out.println("Bucle while " + contador);
            contador++;

        }

        contador = 0;
        do {
            System.out.println("Bucle do-while " + contador);
            contador++;
        } while (contador <= 5);




        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Elixe unha opción");
            System.out.println("1.Saudar");
            System.out.println("2.Despedirse");
            System.out.println("3.Sair");
            opcion = teclado.nextInt();
            // String op = teclado.nextLine();
            // opcion = Integer.parseInt(op);
            switch (opcion) {
                case 1:
                    System.out.println("Ola!");
                    break;
                case 2:
                    System.out.println("Adeus!");
                    break;

            }
        }
      }
    }
