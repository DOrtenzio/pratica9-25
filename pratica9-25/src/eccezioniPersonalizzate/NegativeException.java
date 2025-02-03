package eccezioniPersonalizzate;

public class NegativeException extends NumericException {
    public NegativeException(){
        super("Numero negativo");
    }
    public NegativeException(String msg){
        super(msg);
    }
}
