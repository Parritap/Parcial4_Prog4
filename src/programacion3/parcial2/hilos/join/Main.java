package programacion3.parcial2.hilos.join;

public class Main {

    public static int sumaNumeros;
    public static int factorial;
    public static int cantidadConsonantes;


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new s1());
        Thread t2 = new Thread(new s2());
        Thread t3 = new Thread(new s3());

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int vars4 = s4(sumaNumeros, factorial);

        s5(vars4);
    }


    private static int s4(int a, int b) {
        return a * b;
    }

    private static void s5(int s4) {
        System.out.println("El resultado de multiplicar la suma de numeros y el factorial es: " + s4);
        System.out.println("La cantidad de consonantes en Electroencefalografista es: " + cantidadConsonantes);
    }


}
