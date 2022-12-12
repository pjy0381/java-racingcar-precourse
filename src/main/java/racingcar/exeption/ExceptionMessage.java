package racingcar.exeption;

public enum ExceptionMessage {
    nameException("[ERROR] 이름은 최대 5글자 입니다."),
    numberException("[ERROR] 숫자를 입력하세요."),
    countException("[ERROR] 시도 횟수의 최소값은 1 입니다.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}