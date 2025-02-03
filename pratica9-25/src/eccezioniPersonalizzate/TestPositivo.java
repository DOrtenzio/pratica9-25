package eccezioniPersonalizzate;

import java.util.Scanner;

public class TestPositivo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NumeroPositivo numeroPositivo = new NumeroPositivo();

        while (true) {
            System.out.println("Inserisci il numero ↯");
            int numero = Integer.parseInt(in.next());
            try {
                numeroPositivo.setNumeroMemorizzato(numero);
            } catch (NegativeException e) {
                System.err.println(e.getMessage());
            } catch (NumeroEscluso e) {
                System.err.println(e.getMessage());
            } catch (IntervalloException e) {
                System.err.println(e.getMessage());
            } catch (NumericException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            } finally {
                System.out.println("-----> NUMERO SALVATO : " + numeroPositivo.getNumeroMemorizzato());
            }
        }
    }
}