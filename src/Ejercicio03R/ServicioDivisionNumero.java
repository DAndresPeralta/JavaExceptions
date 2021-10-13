package Ejercicio03R;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioDivisionNumero {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarNumeros() {

        String num1;
        String num2;
        Integer n1;
        Integer n2;

        System.out.println("Ingrese un número.");

        try {

            DivisionNumero d = new DivisionNumero();

            num1 = Leer.next();
            num2 = Leer.next();

            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);

            d.setNum1(num1);
            d.setNum2(num2);
            d.setN1(n1);
            d.setN2(n2);

            mostrar(d);

            System.out.println(division(d));

        } catch (NumberFormatException e) {

            System.out.println(e.toString());
            ingresarNumeros();

        }

    }

    public void mostrar(DivisionNumero d) {

        System.out.println(d.toString());

    }

    public double division(DivisionNumero d) {

        double resultado = 0.0;

        try {

            resultado = (d.getN1() / d.getN2());

        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("No es posible dividir por cero. Ingrese los números nuevamente.");
            ingresarNumeros();
        }

        return resultado;
    }

}
