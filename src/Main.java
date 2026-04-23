
void main() {

    Persoa p1 = new Persoa();
    Persoa p2 = new Persoa("Manuel","44556U",45);
    System.out.println(p1.nome);
    System.out.println(p2.nome);
    MembroComunidadeEscolar m1 = new MembroComunidadeEscolar("Juan","5423",18,36205,"DanielCastelao");
    System.out.println(m1.codigoCentro);
    String outracadea = "Juan";
    System.out.println(outracadea);
    System.out.println(outracadea.indexOf('J'));
    System.out.println(outracadea.charAt(2));
    System.out.println((char)(outracadea.getBytes()[2]));
    System.out.println(outracadea.substring(2));
    System.out.println(outracadea.replace("J","j"));
    String cad1 = "Pepe";
    String cad2 = "Pepe";
    if (cad1 == cad2 ) System.out.println("As cadeas son iguales");
    else System.out.println("As cadeas non son iguais");


    String cad3 = new String("Pepe");
    String cad4 = new String("Pepe");
    if (cad3 == cad4 ) System.out.println("As cadeas son iguales");
    else System.out.println("As cadeas non son iguais");

    /* Java compara las posiciones de memoria, comparacion de objetos */

    if (cad3.equals(cad4)) System.out.println("As cadeas son iguales");
    else System.out.println("As cadeas non son iguais");

}

