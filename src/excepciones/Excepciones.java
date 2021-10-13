package excepciones;

/**
 *
 * @author d.andresperalta
 */
public class Excepciones {

    public static void main(String[] args) {

        int num = 10;

        try {

            int div = num / 0;

        } catch (ArithmeticException e) {

            System.out.println("Error: División por cero." + e.fillInStackTrace());

        } finally {

            System.out.println("Holi.");

        }

    }

}
