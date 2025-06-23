package ex2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  consumoMotore();
        consumoMotoreDouble();

    }

    public static void consumoMotore() {
        Scanner scanner = new Scanner(System.in);
        Logger logger = LoggerFactory.getLogger(Main.class);
        try {
            logger.info("dammi il numero di litri consumati ");
            int litri = Integer.parseInt(scanner.nextLine());
            logger.info("dammi il numero di kilometri fatti");
            int km = Integer.parseInt(scanner.nextLine());
            int consumo = km / litri;
            System.out.println("il tu motore consuma " + consumo);
        } catch (ArithmeticException ex) {
            logger.error("non puoi esserti mosso senza benzina");
        } catch (NumberFormatException ex) {
            logger.error("per favore passa un numero");
        }
        ;

    }

    public static void consumoMotoreDouble() {
        Scanner scanner = new Scanner(System.in);
        Logger logger = LoggerFactory.getLogger(Main.class);
        try {
            logger.info("dammi il numero di litri consumati ");
            double litri = Double.parseDouble(scanner.nextLine());
            if (litri == 0) {
                throw new RuntimeException("non pue essere 0");
            }
            logger.info("dammi il numero di kilometri fatti");
            double km = Double.parseDouble(scanner.nextLine());
            double consumo = km / litri;
            System.out.println("il tu motore fa " + consumo + " kilometri ogni litro");
        } catch (ArithmeticException ex) {
            System.out.println("non puoi esserti mosso senza benzina");
        } catch (NumberFormatException ex) {
            logger.info("per favore passa un numero");
        }
        ;

    }
}
