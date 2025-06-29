package ex3;

import exceptions.BancaException;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) {
        try {
            if (x <= maxPrelievo) {
                super.preleva(x);
            } else {
                throw new BancaException("il prelievo non e disponibile");
            }
        } catch (BancaException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
