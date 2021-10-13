package Ejercicio03;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in).useDelimiter("\n");

        String num1 = null;
        String num2 = null;
        Integer n1 = 0;
        Integer n2 = 0;
        Integer resultado = 0;

        System.out.println("Ingrese dos números");

        try {

            num1 = Leer.next();
            num2 = Leer.next();

            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);

            resultado = (n1 / n2);

        } catch (NumberFormatException e) {

            System.out.println(e.toString());

        } catch (ArithmeticException e) {

            System.out.println(e.toString());

        } catch (Exception e) {

            System.out.println(e.toString());

        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(resultado);

    }

}
