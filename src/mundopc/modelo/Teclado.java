package mundopc.modelo;

public class Teclado extends DispositivoEntrada{

    private final int idTEclado;
    private static int contadorTeclado;

    public Teclado(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        idTEclado = ++contadorTeclado;
    }

    public int getIdTEclado() {
        return idTEclado;
    }

    public static int getContadorTeclado() {
        return contadorTeclado;
    }

    public static void setContadorTeclado(int contadorTeclado) {
        Teclado.contadorTeclado = contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "idTEclado=" + idTEclado +
                '}' + super.toString();
    }
}
