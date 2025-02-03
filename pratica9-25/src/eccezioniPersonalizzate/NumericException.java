package eccezioniPersonalizzate;

public class NumericException extends Exception {
    public NumericException() {
        super("Errore numerico");
    }
    public NumericException(String message) {
        super(message);
    }
}
