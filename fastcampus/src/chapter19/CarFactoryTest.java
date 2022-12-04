package chapter19;

public class CarFactoryTest {

    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.crateCar();
        Car yourSonate = factory.crateCar();

        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonate.getCarNum());


    }
}
