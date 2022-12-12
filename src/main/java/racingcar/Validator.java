package racingcar;

public class Validator {
    public void checkName(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException(
                    ExceptionMessage.nameException.getMessage());
        }
    }

    public void checkNumber(String count) {
        try {
            Integer.parseInt(count);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                    ExceptionMessage.numberException.getMessage()
            );
        }
    }

    public void checkCount(String count) {
        int number = Integer.parseInt(count);
        if (number < 1) {
            throw new IllegalArgumentException(
                    ExceptionMessage.countException.getMessage());
        }
    }
}
