package Ejercicio02;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        ServicioPalabra sp = new ServicioPalabra();

        try {

            sp.crearArreglo();

        } catch (AbstractMethodError e) {

            System.out.println(e.toString());

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e.toString());

        }

    }

}
