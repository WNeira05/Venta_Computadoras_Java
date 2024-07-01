package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Mouse;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {

        Mouse mouseLenovo = new Mouse("Bluetooth", "Lenovo");
        //System.out.println(mouseLenovo);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        //System.out.println(monitorLenovo);

        // Objeto de tipo computadora

        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo,
                                        tecladoLenovo, mouseLenovo);
        //System.out.println(computadoraLenovo);

        // Objeto computadora
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("USB", "Dell");
        Mouse mouseDell = new Mouse("USB", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell,
                                      tecladoDell, mouseDell);


        // Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        // Computadora Mac
        Monitor monitorMac = new Monitor("Mac", 27);
        Teclado tecladoMac = new Teclado("Bluetooth", "Mac");
        Mouse mouseMac = new Mouse("Bluetooth", "MAC");
        Computadora computadoraIMac = new Computadora("iMac", monitorMac, tecladoMac, mouseMac);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraIMac);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        System.out.println();
        orden2.mostrarOrden();


    }
}