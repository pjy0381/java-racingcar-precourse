package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.entity.Car;
import racingcar.exeption.Validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {
    private final Validator validator;

    public InputView() {
        this.validator = new Validator();
    }

    public List<Car> inputCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        List<String> stringCars = Arrays.asList(Console.readLine().split(","));

        return createCars(stringCars);
    }

    public int inputCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String count = Console.readLine();
        validator.checkNumber(count);
        validator.checkCount(count);

        return Integer.parseInt(count);
    }

    private List<Car> createCars(List<String> stringCars){
        List<Car> cars = new ArrayList<>();

        stringCars.forEach(carName -> {
            validator.checkName(carName);
            cars.add(new Car(carName));
        });

        return cars;
    }

}
