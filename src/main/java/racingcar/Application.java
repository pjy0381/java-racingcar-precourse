package racingcar;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        GameController gameController = new GameController();
        gameController.startGame();
        gameController.progressGame();
        gameController.resultGame();
    }
}
