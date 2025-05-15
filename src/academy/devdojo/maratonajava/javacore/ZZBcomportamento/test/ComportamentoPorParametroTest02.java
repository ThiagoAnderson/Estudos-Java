package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("Green", 2020), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("Green");
//            }
//        });
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> redCars = filter(cars,car -> car.getColor().equals("Red"));
        List<Car> yearCars = filter(cars,car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearCars);
    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> carsFiltered = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                carsFiltered.add(car);
            }
        }
        return carsFiltered;
    }

}
