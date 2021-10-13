package Ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioNumero {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Numero numeroSecreto() {

        Numero n = new Numero();

        n.setNumero((int) (Math.random() * 501));

        return n;

    }

    public int ingreseNumero() {

        int numero = 0;

        try {

            numero = Leer.nextInt();

        } catch (InputMismatchException e) {

            System.out.println(e.toString());
            System.out.println("Entrada inválida. Intente nuevamente.");
            Leer.next();

        }

        return numero;
    }

    public void adivinarNumero(Numero n) {

        int num;
        int cont = 0;

        do {

            System.out.println("Ingrese un numero");
            num = ingreseNumero();

            if (num < n.getNumero()) {

                System.out.println("Número incorrecto.");
                System.out.println("El número secreto es mayor a " + num);
                cont++;

            } else if (num > n.getNumero()) {

                System.out.println("Número incorrecto.");
                System.out.println("El número secreo en menor a " + num);
                cont++;

            }

        } while (num != n.getNumero());

        cont++;
        System.out.println("CORRECTO.");
        System.out.println("Número de intentos: " + cont);

    }

}
