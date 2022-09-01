import java.util.InputMismatchException;
import java.util.*;
import java.math.*;

public class numeroNegativoExcepcion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n, r = 0;
        System.out.println("Número: " );
        n = s.nextDouble();
        try{
            r = Math.sqrt(n);

        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        System.out.println("La raiz es: " + r);
    }
}
