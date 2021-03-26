package exceptions;

public class ExceptionCustom extends Exception {
    private String mensaje;
    public ExceptionCustom(String mensaje){
        super(String.format(mensaje));
        this.mensaje = mensaje;
    }
}
