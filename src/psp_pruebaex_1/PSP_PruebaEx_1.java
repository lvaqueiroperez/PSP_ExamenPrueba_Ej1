package psp_pruebaex_1;

public class PSP_PruebaEx_1 {

    public static void main(String[] args) throws InterruptedException {
        //1A
//        ClaseHilos h1 = new ClaseHilos("Hilo1");
//        ClaseHilos h2 = new ClaseHilos("Hilo2");
//        ClaseHilos h3 = new ClaseHilos("Hilo3");
//
//        h1.start();
//        h2.start();
//        h3.start();

        //1B
//        ClaseHilos h1 = new ClaseHilos("Hilo1");
//        ClaseHilos h2 = new ClaseHilos("Hilo2");
//        ClaseHilos h3 = new ClaseHilos("Hilo3");
//
//        h3.start();
//        h3.join();
//        h2.start();
//        h2.join();
//        h1.start();
//        h1.join();
        //1C (hay que sincronizarlos??)
        Monitor1C m = new Monitor1C();

        ClaseHilos h1 = new ClaseHilos("Hilo1", m);
        ClaseHilos h2 = new ClaseHilos("Hilo2", m);
        ClaseHilos h3 = new ClaseHilos("Hilo3", m);

        h1.start();
        h2.start();
        h3.start();
    }

}
