# VentaComputadoras

Este proyecto es una aplicación Java que simula un sistema de venta de computadoras. 
El objetivo es gestionar ordenes de compra de diferentes modelos de computadoras, cada una compuesta por diversos dispositivos como monitor, teclado y mouse. 

## Estructura del Proyecto

### Paquete `mundopc`

- **VentaComputadorasApp**: Clase principal que contiene el método `main` y demuestra la funcionalidad del sistema creando varias computadoras y órdenes.

### Paquete `mundopc.modelo`

- **DispositivoEntrada**: Clase base que representa un dispositivo de entrada con tipo y marca.
- **Computadora**: Clase que representa una computadora, que está compuesta por un monitor, un teclado y un mouse.
- **Monitor**: Clase que representa un monitor con su marca y tamaño.
- **Mouse**: Clase que representa un mouse y hereda de `DispositivoEntrada`.
- **Teclado**: Clase que representa un teclado y hereda de `DispositivoEntrada`.

### Paquete `mundopc.servicio`

- **Orden**: Clase que representa una orden de compra que puede contener múltiples computadoras.

## Cómo ejecutar
