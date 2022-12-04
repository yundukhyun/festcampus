package chapter18;

import java.lang.reflect.Member;

public class Company {//싱글톤패턴
                        //중복되는 데이터를 가지고 있는 애들을 궂이 용량차지하지 않게 하기위한 패턴

    private static Company instance = new Company();
    private Company(){

    }

    public static Company getInstance() {
        if(instance == null){
            instance = new Company();
        }

        return instance;
    }

}
