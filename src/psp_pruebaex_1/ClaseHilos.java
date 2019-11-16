package psp_pruebaex_1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClaseHilos extends Thread {

    //Atributo para el 1C
    private Monitor1C m;

    public ClaseHilos(String nombre) {
        //para usar "getName()", no hace falta declarar el nombre como atributo de la Clase !!!
        super(nombre);

    }

    //Constructor para 1C
    public ClaseHilos(String nombre, Monitor1C m) {
        //para usar "getName()", no hace falta declarar el nombre como atributo de la Clase !!!
        super(nombre);
        this.m = m;

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
        m.mostrarHilo(getName());

    }

}
