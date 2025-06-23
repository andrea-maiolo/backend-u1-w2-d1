package exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserInputException extends RuntimeException {
    public UserInputException(String mes) {
//        super(mes);
        Logger logger = LoggerFactory.getLogger(UserInputException.class);
        logger.error(mes);
    }
}
