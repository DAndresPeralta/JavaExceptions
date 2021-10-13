package Integrador;

import com.sun.corba.se.impl.copyobject.ORBStreamObjectCopierImpl;

/**
 *
 * @author d.andresperalta
 */
public class ServicioJARVIS {

    public Armadura crearArmadura() {

        Armadura A = new Armadura();

        A.setBotas(5);
        A.setGuantes(10);
        A.setConsola(3);
        A.setSintetizador(2);
        A.setResistencia(100);
        A.setEnergia(1000);

        return A;
    }

    public void caminar(Armadura a, int t, int i) {

        switch (i) {

            case 1:

                int caminar = (a.getBotas() * t);
                a.setEnergia(a.getEnergia() - caminar);
                System.out.println(a.getEnergia());
                break;

            case 2:

                int correr = ((a.getBotas() * 2) * t);
                a.setEnergia(a.getEnergia() - correr);
                System.out.println(a.getEnergia());
                break;

        }

    }

    public void ejecucion() {

        Armadura A = crearArmadura();

    }

}
