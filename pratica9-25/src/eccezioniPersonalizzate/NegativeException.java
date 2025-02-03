package eccezioniPersonalizzate;

public class NegativeException extends IllegalArgumentException {
    public NegativeException(){
        super("Numero negativo");
    }
    public NegativeException(String msg){
        super(msg);
    }
}
