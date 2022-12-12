package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {

    public List<Car> inputCars() {
        List<Car> cars = new ArrayList<>();

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        List<String> stringCars = Arrays.asList(Console.readLine().split(","));

        stringCars.forEach(carName -> cars.add(new Car(carName)));

        return cars;
    }

    public int inputCount() {

        System.out.println("시도할 회수는 몇회인가요?");
        String count = Console.readLine();

        return Integer.parseInt(count);
    }

}
