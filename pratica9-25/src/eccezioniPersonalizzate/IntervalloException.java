package eccezioniPersonalizzate;

public class IntervalloException extends NumericException {
    public IntervalloException() {
      super("Errore numero non compreso tra 1 e 30");
    }
    public IntervalloException(String msg) {
        super(msg);
    }
}
