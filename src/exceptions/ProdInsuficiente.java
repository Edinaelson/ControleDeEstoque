package exceptions;

public class ProdInsuficiente extends Exception{
    @Override
    public String getMessage() {
        String message = "Produto insuficiente";
        return "\u001B[31m" + message + "\u001B[0m";
    }
}
