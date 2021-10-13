package Prueba;

/**
 *
 * @author d.andresperalta
 */
public class Examen {

    public static void main(String[] args) {

//        System.out.println(parCieloPiso(2, 2, -3));
//        System.out.println(geringoso2("gato"));
        System.out.println(inversa("Hola"));

    }

    public static Boolean parCieloPiso(int numEnt, double numReal, long numLargo) {

        boolean resultado = false;

        if (numEnt % 2 == 0 && Math.round(numReal) == Math.floor(numReal) && numLargo >= 0) {

            resultado = true;

        }

        return resultado;
    }

    public static String geringoso(String palabra) {

        String resultado = palabra.toLowerCase();

        String auxGeringoso = null;

        for (int i = 0; i < palabra.length(); i++) {

            if (resultado.charAt(i) == 'a') {

                auxGeringoso = resultado.charAt(i) + "pa";

            } else {

                auxGeringoso = resultado.charAt(i) + "";

            }

        }

        return auxGeringoso;
    }

    public static String geringoso2(String palabra) {

        String aux = palabra.toLowerCase();

        aux = aux.replaceAll("a", "apa").replaceAll("e", "epe").replaceAll("i", "ipi").replaceAll("o", "opo").replaceAll("u", "upu");

        return aux;
    }

    public static String inversa(String palabra) {

        String auxMinuscula;

        String auxInvertida = "";

        auxMinuscula = palabra.toLowerCase();

        for (int i = 0; i < auxMinuscula.length(); i++) {

            auxInvertida = auxMinuscula.charAt(i) + auxInvertida;

        }

        return auxInvertida;

    }
}
