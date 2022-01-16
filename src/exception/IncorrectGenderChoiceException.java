package exception;

public class IncorrectGenderChoiceException extends Exception {
    public IncorrectGenderChoiceException(String errorMessage) {
        super(errorMessage);
    }
}
