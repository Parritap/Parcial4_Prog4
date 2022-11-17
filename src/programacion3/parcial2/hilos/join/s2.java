package programacion3.parcial2.hilos.join;

public class s2 extends Thread {


    @Override
    public void run() {
        Main.factorial = calcularFactorial(6);
    }

    /**
     * Función que calcula el factorial de un número dado.
     * @param n
     * @return
     */
    public static int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}
