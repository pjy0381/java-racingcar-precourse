package racingcar.controller;

import racingcar.entity.Game;
import racingcar.entity.Car;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;
    private List<Car> cars;
    private int count;
    private Game game;

    public GameController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void startGame() {
        this.cars = inputView.inputCars();
        this.count = inputView.inputCount();
        this.game = new Game(cars);
    }

    public void progressGame() {
        outputView.startOutPut();
        for (int i = 0; i < count; i++) {
            game.move();
            outputView.outNow(cars);
        }
    }

    public void resultGame() {
        game.result();

        outputView.resultOutput(cars);
    }
}

