package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {

    public List<Car> inputCars() {
        List<Car> cars = new ArrayList<>();
        List<String> stringCars = Arrays.asList(Console.readLine().split(","));

        stringCars.forEach(carName -> cars.add(new Car(carName)));

        return cars;
    }
}
