package chapter7;

public class UserInfoTest {

    public static void main(String[] args) {
        UserInfo userLee = new UserInfo();
        userLee.userId = "a1234";
        userLee.userPassWord = "zxcvbn12324";
        userLee.userName = "Lee";
        userLee.phoneNumber = "01034556699";
        userLee.userAddress = "Seoul,Korea";

        System.out.println(userLee.showUserInfo());

        UserInfo userKim = new UserInfo("b1234", "09876mnbvc","Kim");
        System.out.println(userKim.showUserInfo());
    }
}
