package ex3;

import exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        ContoCorrente myConto = new ContoCorrente("topolino", 240.6);

        try {
            myConto.preleva(100.50);
        } catch (BancaException e) {
            logger.error(e.getMessage());
        } finally {
            System.out.println(myConto.restituisciSaldo());
        }


        try {
            myConto.preleva(260);
        } catch (BancaException e) {
            logger.error(e.getMessage());
        } finally {
            System.out.println(myConto.restituisciSaldo());
        }


        ContoOnLine contoOnline = new ContoOnLine("pippo", 500, 100);
        contoOnline.preleva(50);
        System.out.println(contoOnline.restituisciSaldo());
        contoOnline.preleva(200.50);

    }
}
