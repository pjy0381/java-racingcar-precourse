package racingcar;

import java.util.List;

public class OutputView {
    public OutputView() {
        System.out.println("실행 결과");
    }

    public void outNow(List<Car> cars) {
        StringBuilder output = new StringBuilder();

        cars.forEach(car -> {
            output.append(car.getName()).append(" : ");
            for (int i = 0; i < car.getPosition(); i++) {output.append("-");}
            output.append("\n");
        });

        System.out.println(output);
    }
}
