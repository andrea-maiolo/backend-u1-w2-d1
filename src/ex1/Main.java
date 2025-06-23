package ex1;

import exceptions.UserInputException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {3, 6, 2, 9, 5};
        logger.info("array di partenza");
        logger.info(Arrays.toString(numbers));
        int userInput;

        do {
            logger.info("dammi un numero da inserire nell array, premi 0 per uscire");
            userInput = Integer.parseInt(scanner.nextLine());
            logger.info("dimmi la posizione nella quale inserirlo da 1 a 5");
            int userPosition = Integer.parseInt(scanner.nextLine());
            if (userPosition <= 0 || userPosition > 5) {
                throw new UserInputException("la posizione inseria non va bene");
            } else {
                numbers[userPosition - 1] = userInput;
            }
            System.out.println(Arrays.toString(numbers));

        } while (userInput != 0);

    }
}
