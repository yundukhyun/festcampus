package chapter19;

import chapter18.Company;

public class CarFactory {


    private static CarFactory instance = new CarFactory();

    private CarFactory(){

    }
    public static CarFactory getInstance() {

        return instance;
    }
    public Car crateCar() {
        Car car = new Car();
        return car;
    }


}
