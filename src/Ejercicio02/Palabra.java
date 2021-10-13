package Ejercicio02;

/**
 *
 * @author d.andresperalta
 */
public class Palabra {

    private String[] A;
    private String palabra;

    public Palabra() {
    }

    public Palabra(String[] A, String palabra) {
        this.A = A;
        this.palabra = palabra;
    }

    public String[] getA() {
        return A;
    }

    public void setA(String[] A) {
        this.A = A;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Palabra{" + "A=" + A + ", palabra=" + palabra + '}';
    }

}
