package chapter2;

public class FuntionTest {

    public static  int addNum(int num1,int num2){// 반환값이 있는거

        int result;
        result = num1 + num2;
        return result;
    }

    public static void sayHello(String greeting){ // 반환값이 없는거
        System.out.println(greeting);
    }
    public static int calcSum() // 반호나값만있고 매개변수가없는거
    {
        int sum = 0;
        int i;
        for(i = 0; i<=100; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1,n2);

        System.out.println(total);

        sayHello("안녕하세요");

        total = calcSum();
        System.out.println(total);
    }
}
