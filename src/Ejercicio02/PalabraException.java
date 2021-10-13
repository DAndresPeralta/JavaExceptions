package Ejercicio02;

/**
 *
 * @author d.andresperalta
 */
public class PalabraException extends Exception {

    public PalabraException() {
    }

    /**
     * Constructs an instance of <code>PalabraException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PalabraException(String msg) {
        super(msg);
    }
}
