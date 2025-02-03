package eccezioniPersonalizzate;

public class NumeroEscluso extends NumericException {
    public NumeroEscluso() {
        super("Numero escluso");
    }
    public NumeroEscluso(String msg) {
        super(msg);
    }
}
