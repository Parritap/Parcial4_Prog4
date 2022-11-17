package programacion3.parcial2.hilos.join;

public class s1 extends  Thread {

    public int n;

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public void run (){
        Main.sumaNumeros = sumaRecursiva(10);
    }

    /**
     * Función que calcula de forma recursiva la suma de n numeros consecutivos.
     * @param n
     * @return
     */

    public static int sumaRecursiva(int n)
    {
        if (n <= 1)
            return n;
        return n + sumaRecursiva(n - 1);
    }




}
