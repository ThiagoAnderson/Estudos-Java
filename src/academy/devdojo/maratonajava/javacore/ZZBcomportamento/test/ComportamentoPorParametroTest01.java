package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> carsFiltered = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carsFiltered.add(car);
            }
        }
        return carsFiltered;
    }
    private static List<Car> filterCarByYear(List<Car> cars, int year) {
        List<Car> filterCarYear = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filterCarYear.add(car);
            }
        }
        return filterCarYear;
    }

    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("Green", 2020), new Car("Black", 1998), new Car("Red", 2019));
        System.out.println(filterCarByColor(cars,"Green"));
        System.out.println(filterCarByColor(cars,"Red"));
        System.out.println("----------");
        System.out.println(filterCarByYear(cars,2015));
    }
}
