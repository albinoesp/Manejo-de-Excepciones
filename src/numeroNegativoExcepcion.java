import java.util.InputMismatchException;
import java.util.*;
import java.math.*;

public class numeroNegativoExcepcion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        double r = 0;
        System.out.println("Número: " );
        n = s.nextInt();
        try{
            r = Math.sqrt(n);

        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        System.out.println("La raiz es: " +  r);
    }
}
