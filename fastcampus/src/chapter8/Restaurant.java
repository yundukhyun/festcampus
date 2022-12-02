package chapter8;

public class Restaurant {// 식당
    public String orderNumber; //주문 접수 번호
    public String orderPhone; // 주문 핸드폰 번호
    public String orderAddress; // 주문 집 주소
    public String orderDay; // 주문 날짜
    public String orderTime; // 주문 시간
    public String orderPay; // 주문 가격
    public String menuNumber; // 메뉴 번호

    public Restaurant(String orderNumber,String orderPhone,String orderAddress,String orderDay,String orderTime,String orderPay,String menuNumber){
        this.orderNumber = orderNumber;
        this.orderPhone = orderPhone;
        this.orderAddress = orderAddress;
        this.orderDay = orderDay;
        this.orderTime = orderTime;
        this.orderPay = orderPay;
        this.menuNumber = menuNumber;
    }
    public String RestaurantInfo(){
        return "주문 접수 번호: "+ orderNumber+"\n"+
                "주문 핸드폰 번호: "+orderPhone+"\n"+
                "주문 집 주소: " + orderAddress+ "\n"+
                "주문 날짜: " + orderDay + "\n"+
                "주문 가격: " + orderPay + "\n"+
                "메뉴 번호: " + menuNumber;


    }

}
