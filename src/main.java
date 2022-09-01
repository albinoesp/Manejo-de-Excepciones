import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] argsMain;
        argsMain = new String[2];

            System.out.println("Escriba la cadena de texto: ");
            argsMain[0] = entrada.nextLine();
            System.out.println("Escribe el caracter que quiera conocer");
            argsMain[1] = entrada.nextLine();
        try {
            caracterEn.caracterEntrada(argsMain);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Has intentado recuperar una posición de la " +
                    "cadena de caracteres que no existe");
            System.exit(1);
        }
    }
}
