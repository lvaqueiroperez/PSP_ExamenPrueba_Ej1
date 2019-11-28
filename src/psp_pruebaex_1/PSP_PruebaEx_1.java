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
//        System.out.println("ACABA PROGRAMA PRINCIPAL");

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
//        System.out.println("ACABA PROGRAMA PRINCIPAL");
        //1C (usar yield !!!)
        //Lo que se pide, en resumen, es que un mismo hilo no puede escribir su iteración más de una vez seguida
        ClaseHilos h1 = new ClaseHilos("Hilo1");
        ClaseHilos h2 = new ClaseHilos("Hilo2");
        ClaseHilos h3 = new ClaseHilos("Hilo3");

        h1.start();
        h2.start();
        h3.start();
        //joins???
        System.out.println("ACABA EL PROGRAMA PRINCIPAL");
    }

}
