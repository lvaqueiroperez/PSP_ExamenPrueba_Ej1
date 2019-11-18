package psp_pruebaex_1;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
//CLASE SOLO PARA EL EJERCICIO 1C
/*
Al trabajar con más de 2 hilos, el método "notify()" puede ser conflictivo, ya que
solo llama a uno de ellos aleatoriamente
Para estos casos mejor usar "notifyAll()", que avisa a todos
 */
public class Monitor1C {

    private Boolean disponible = true;

    public Monitor1C() {
    }

//    public synchronized void mostrarHilo(String nombre) {
//
//        while (disponible == false) {
//
//            try {
//                wait();
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Monitor1C.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//
//        disponible = false;
//
//        for (int i = 1; i <= 8; i++) {
//
//            System.out.println(i + ". " + nombre);
//            try {
//                sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Monitor1C.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            //Al entrar en el método, una vez mostrado el mensaje ponemos el semáforo en true
//            //y avisamos al resto de hilos que estén esperando
//            disponible = true;
//            notifyAll();
//            //Además, ponemos en wait() al hilo actual para que deje paso a cualquier otro
//            //Es decir, cada hilo solo podrá mostrar uno de sus mensajes a la vez
//            try {
//                wait();
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Monitor1C.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        //Si el hilo ya ha acabado de mostrar todos sus mensajes, para que no
//        //haya problemas avisamos al resto de hilos otra vez
//        notifyAll();
//
//    }
    //
    //PRUEBA HACIENDO QUE ACCEDA CON UN FOR AL MÉTODO EN VEZ DE TENER EL FOR DENTRO DEL MÉTODO
    //(PARECE QUE DE ESTA MANERA EL CÓDIGO SE SIMPLIFICA)
    public synchronized void mostrarHilo(String nombre, int i) {

        while (disponible == false) {

            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Monitor1C.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        disponible = false;

        System.out.println(i + ". " + nombre);
        try {
            sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Monitor1C.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Al entrar en el método, una vez mostrado el mensaje ponemos el semáforo en true
        //y avisamos al resto de hilos que estén esperando
        disponible = true;
        notifyAll();
        //Además, ponemos en wait() al hilo actual para que deje paso a cualquier otro
        //Es decir, cada hilo solo podrá mostrar uno de sus mensajes a la vez

        //EN ESTA VARIANTE, CUANDO SE IMPRIMAN TODOS LOS ÍNDICES, EL PROGRAMA NO ACABARÁ
        //PARA CORREGIR ESTO:
        if (i == 8) {

            notifyAll();

        } else {

            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Monitor1C.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
