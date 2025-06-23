package ex3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        ContoCorrente myConto = new ContoCorrente("topolinio", 240.6);
        myConto.preleva(100.50);
        System.out.println(myConto.restituisciSaldo());
//        myConto.preleva(260);
        System.out.println(myConto.restituisciSaldo());

        ContoOnLine contoOnline = new ContoOnLine("pippo", 500, 100);
        contoOnline.preleva(50.67);
        System.out.println(contoOnline.restituisciSaldo());
        contoOnline.preleva(300);
        System.out.println(contoOnline.restituisciSaldo());


    }
}
