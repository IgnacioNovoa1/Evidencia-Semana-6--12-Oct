
public class CarroCompra {

    private int[][] _productos;

    public CarroCompra() {
        for (int i = 0; i < 5; i++) {
            _productos[0][i] = 1;
            _productos[1][i] = 1000;
        }
    }

    private int calcularTotal() {
        int total = 0;
        int subtotal = 0;
        for (int i = 0; i < 5; i++) {
            total += subTotal(_productos[0][i], _productos[1][i]);
        }
        return total;
    }

    private int subTotal(int aN, int aN2) {
        Calculadora calc = new Calculadora(aN, aN2);
        return calc.multiplicar();
    }

    public void mostrarTotal() {
        System.out.println("El total de la compra es: " + this.calcularTotal());
    }
}
