package ex3;

import exceptions.BancaException;

public class ContoCorrente {
    protected final int maxMovimenti = 50;
    protected String titolare;
    protected int nMovimenti;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            if (saldo - x <= 0) {
                nMovimenti++;
                throw new BancaException("saldo in rosso");
            } else {
                saldo = saldo - x;
                nMovimenti++;
            }
        } else {
            saldo = saldo - x - 0.50;
            nMovimenti++;
        }

    }


    public double restituisciSaldo() {
        return saldo;
    }

}
