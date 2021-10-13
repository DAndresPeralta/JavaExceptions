package Ejercicio03R;

/**
 *
 * @author d.andresperalta
 */
public class DivisionNumero {

    private String num1;
    private String num2;
    private int n1;
    private int n2;

    public DivisionNumero() {
    }

    public DivisionNumero(String num1, String num2, Integer n1, Integer n2) {
        this.num1 = num1;
        this.num2 = num2;
        this.n1 = n1;
        this.n2 = n2;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public Integer getN1() {
        return n1;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    public Integer getN2() {
        return n2;
    }

    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "DivisionNumero{" + "num1=" + num1 + ", num2=" + num2 + ", n1=" + n1 + ", n2=" + n2 + '}';
    }

}
