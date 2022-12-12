package racingcar;

public class Application {
    static GameController gameController = new GameController();

    public static void main(String[] args) {
        // TODO 구현 진행
        try {
            gameController.startGame();
            gameController.progressGame();
            gameController.resultGame();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
