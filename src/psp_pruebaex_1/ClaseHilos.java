package psp_pruebaex_1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClaseHilos extends Thread {

    public ClaseHilos(String nombre) {
        //para usar "getName()", no hace falta declarar el nombre como atributo de la Clase !!!
        super(nombre);

    }

    @Override
    public void run() {
//        1A
//        for (int i = 1; i <= 8; i++) {
//
//            try {
//                System.out.println(i + ". " + getName());
//
//                sleep(((int) (Math.random() * 1000 + 1) + 1000));
//
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ClaseHilos.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

        //1B
//        for (int i = 1; i <= 8; i++) {
//
//            try {
//                System.out.println(i + ". " + getName());
//
//                sleep(((int) (Math.random() * 1000 + 1) + 1000));
//
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ClaseHilos.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        //1C
        //ACCEDIENDO MÚLTIPLES VECES A ESE MÉTODO:
        //(recibe como parámetro el índice del for para poder imprimirlo )
        for (int i = 1; i <= 20; i++) {

            System.out.println(i + ". " + getName());

            //si no ponemos un sleep, el yield no funcionará correctamente???
            //no funciona?
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClaseHilos.class.getName()).log(Level.SEVERE, null, ex);
            }

            yield();

        }
    }

}
