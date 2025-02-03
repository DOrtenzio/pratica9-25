package eccezioniPersonalizzate;

public class NumeroPositivo {
    private int numeroMemorizzato;

    public NumeroPositivo(int numeroMemorizzato) throws NumericException{
        setNumeroMemorizzato(numeroMemorizzato);
    }
    public NumeroPositivo(){
        this.numeroMemorizzato=0;
    }

    public int getNumeroMemorizzato() { return numeroMemorizzato; }
    public void setNumeroMemorizzato(int numeroMemorizzato) throws NumericException{
        if (numeroMemorizzato<0)
            throw new NegativeException("Numero negativo inserito");
        else if (numeroMemorizzato == 20)
            throw new NumeroEscluso("Numero escluso");
        else if (numeroMemorizzato<0 || numeroMemorizzato>30)
            throw new IntervalloException("Numero non compreso tra 1 e 30");
        else
            this.numeroMemorizzato = numeroMemorizzato;
    }
}
