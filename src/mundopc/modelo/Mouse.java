package mundopc.modelo;

public class Mouse extends DispositivoEntrada{

    private final int idMouse;
    private static int contadorMouse;

    public Mouse(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        idMouse = ++contadorMouse;
    }

    public int getIdMouse() {
        return idMouse;
    }

    public static int getContadorMouse() {
        return contadorMouse;
    }

    public static void setContadorMouse(int contadorMouse) {
        Mouse.contadorMouse = contadorMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "idMouse=" + idMouse +
                '}' + super.toString();
    }
}
