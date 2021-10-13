package Ejercicio01;

import java.util.Scanner;

/**
 *
 * @author d.andresperalta
 */
public class ServicioPersona {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        char sexo = 'A';

        System.out.println("Ingrese el nombre.");
        String nombre = Leer.next();

        System.out.println("Ingrese la edad.");
        int edad = Leer.nextInt();

        do {
            System.out.println("Ingrese el sexo.");
            sexo = Leer.next().charAt(0);

            if (sexo != 'M' && sexo != 'F' && sexo != 'O') {
                System.out.println("Opción inválida. Intente nuevamente.");

            }

        } while (sexo != 'M' && sexo != 'F' && sexo != 'O');

        System.out.println("Ingrese el peso.");
        double peso = Leer.nextDouble();

        System.out.println("Ingrese la altura.");
        double altura = Leer.nextDouble();

//        try {
//            
//            if (nombre.isEmpty()) {
//                
//                throw new PersonaException("Debe indicar un nombre.");
//                
//            }
//            
//        } catch (PersonaException e) {
//            throw e;
//        }
        return new Persona(nombre, edad, sexo, peso, altura);

    }

//    public void crearPersona1(String nombre, int edad, char sexo, double peso, double altura) throws PersonaException {
//        
//        try {
//            
//            if (nombre == null || nombre.isEmpty()) {
//                throw new PersonaException("Debe indicar un nombre.");
//            }
//            
//            Persona p2 = new Persona();
//            p2.setNombre(nombre);
//            p2.setEdad(edad);
//            p2.setSexo(sexo);
//            p2.setPeso(peso);
//            p2.setAltura(altura);
//            
//        } catch (PersonaException e) {
//            
//            throw e;
//            
//        }
//        
//    }
    public int calcularIMC(Persona P1, double peso, double altura) {

        P1.setImc((P1.getPeso() / (Math.pow(P1.getAltura(), 2))));

        if (P1.getImc() < 20) {
            return -1;
        } else if (P1.getImc() > 25) {
            return 1;
        } else {
            return 0;
        }

    }

    public boolean esMayorDeEdad(Persona P1, int edad) {

        boolean mayor = false;

        if (P1.getEdad() >= 18) {
            mayor = true;
        }
        return mayor;
    }

}
