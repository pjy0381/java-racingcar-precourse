package racingcar;

import java.util.List;

public class OutputView {
    public void startOutPut() {
        System.out.println("실행 결과");
    }

    public void outNow(List<Car> cars) {
        StringBuilder output = new StringBuilder();

        cars.forEach(car -> {
            output.append(car.getName()).append(" : ");
            for (int i = 0; i < car.getPosition(); i++) {
                output.append("-");
            }
            output.append("\n");
        });

        System.out.println(output);
    }

    public void resultOutput(List<Car> cars) {
        StringBuilder output = new StringBuilder();
        int max = cars.get(0).getPosition();
        output.append("최종 우승자 : ").append(cars.get(0).getName());

        for (int i = 1; i < cars.size(); i++) {
            if (cars.get(i).getPosition() < max) break;
            output.append(cars.get(i).getName());
        }
        System.out.println(output);
    }
}
