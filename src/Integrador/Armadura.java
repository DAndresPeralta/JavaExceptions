package Integrador;

/**
 *
 * @author d.andresperalta
 */
public class Armadura {

    private int botas;
    private int guantes;
    private int consola;
    private int sintetizador;
    private int resistencia;
    private int energia;

    public Armadura() {
    }

    public Armadura(int botas, int guantes, int consola, int sintetizador, int resistencia, int energia) {
        this.botas = botas;
        this.guantes = guantes;
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.resistencia = resistencia;
        this.energia = energia;
    }

    public int getBotas() {
        return botas;
    }

    public void setBotas(int botas) {
        this.botas = botas;
    }

    public int getGuantes() {
        return guantes;
    }

    public void setGuantes(int guantes) {
        this.guantes = guantes;
    }

    public int getConsola() {
        return consola;
    }

    public void setConsola(int consola) {
        this.consola = consola;
    }

    public int getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(int sintetizador) {
        this.sintetizador = sintetizador;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Armadura{" + "botas=" + botas + ", guantes=" + guantes + ", consola=" + consola + ", sintetizador=" + sintetizador + ", resistencia=" + resistencia + '}';
    }

}
