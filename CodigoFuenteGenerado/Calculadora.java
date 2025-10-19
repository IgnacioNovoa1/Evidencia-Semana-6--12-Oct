
public class Calculadora {

    private int _n1;
    private int _n2;

    public Calculadora() {
        this._n1 = 0;
        this._n2 = 0;
    }

    public Calculadora(int aN1, int aN2) {
        this._n1 = aN1;
        this._n2 = aN2;
    }

    public int sumar() {
        return this._n1 + this._n2;
    }

    public int multiplicar() {
        return this._n1 * this._n2;
    }

    public void setN1(int aN) {
        this._n1 = aN;
    }

    public void setN2(int aN) {
        this._n2 = aN;
    }
}
