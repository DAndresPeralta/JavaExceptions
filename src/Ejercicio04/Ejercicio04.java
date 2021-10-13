package Ejercicio04;

/**
 *
 * @author d.andresperalta
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        
        ServicioNumero sn = new ServicioNumero();
        
        Numero n = sn.numeroSecreto();
        System.out.println(n.getNumero());
        sn.adivinarNumero(n);
        
    }
    
}
