package racingcar;

import java.util.List;

public class Game {
    private final List<Car> cars;

    public Game(List<Car> cars) {
        this.cars = cars;
    }

    public void move() {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        cars.forEach(car -> {
            int generate = numberGenerator.generate();
            if (generate >= 4) car.movePosition();
        });
    }
}
