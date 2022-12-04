package chapter19;

public class Car {
    private static int carNum = 1000; //car

    private  int carNumber; //노란불뜨는 이유는 final을 넣으라는이유

    public Car(){ //생성자 불러오면서 carNum++를 하고

        carNum++;
        carNumber = carNum;
    }

    public int getCarNum(){

        return carNumber;
    }

}
