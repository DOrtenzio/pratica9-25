package eccezioniPersonalizzate;

public class NumeroPositivo {
    private int numeroMemorizzato;

    public NumeroPositivo(int numeroMemorizzato) throws NegativeException{
        setNumeroMemorizzato(numeroMemorizzato);
    }
    public NumeroPositivo(){
        this.numeroMemorizzato=0;
    }

    public int getNumeroMemorizzato() { return numeroMemorizzato; }
    public void setNumeroMemorizzato(int numeroMemorizzato) throws NegativeException{
        if (numeroMemorizzato<0)
            throw new NegativeException("Numero negativo inserito");
        else
            this.numeroMemorizzato = numeroMemorizzato;
    }
}
