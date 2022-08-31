import java.io.IOException;
public class caracterEn {

    public static void main(String[] args) {
        if (args[0] == null) {
            System.exit(1);
        }
            try {
                String cadena = args[0];
                int car = Integer.parseInt(args[1]) - 1;

                System.out.println("Texto: " + cadena);
                System.out.println("Caracter en la posición " + car + ": " + cadena.charAt(car));
            }
         catch (ArrayIndexOutOfBoundsException e){
             System.out.println(e.getMessage());
             System.exit(2);
        }
    }
}
