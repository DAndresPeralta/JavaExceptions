package Ejercicio01;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        ServicioPersona Sp1 = new ServicioPersona();
        Persona p = null;

        try {
            Sp1.esMayorDeEdad(p, 18);

        } catch (NullPointerException e) {

            System.out.println(e.fillInStackTrace());
        }

    }

}
