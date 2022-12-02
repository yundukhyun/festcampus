package chapter8;

public class Person {
    public int height;     //키
    public int weight ;      //몸무계
    public String gender;       //성별
    public String name;         //이름
    public int age;

    public Person(int height,int weight,String gender,String name,int age){
        this.height = height;
        this.weight =weight;
        this.gender =gender;
        this.name =name;
        this.age =age;
    }
    public String PersonInfo(){
        return "키가" + height + "이고 몸무계가" + weight + "킬로인 남성이 있습니다. 이름은 "
                + name + " 이고 나이는 " + age +"세입니다.";
    }
}
