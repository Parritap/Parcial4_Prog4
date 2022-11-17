package programacion3.parcial2.hilos.join;

public class s3 extends Thread {

    @Override
    public void run() {
    Main.cantidadConsonantes = contarConsonantes("Electroencefalografista");
    }



    /**
     * Método que cuenta las consonants en un String.
     * @param str
     * @return cantidad de consonantes
     */
    public static int contarConsonantes(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }
        }
        return count;
    }

}
