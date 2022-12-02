package chapter3;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentkim = new Student();
        studentkim.studentID = 54321;
        studentkim.studentName = "kim";
        studentkim.address = "경기도 성남시";

        studentkim.showStudentInfo();

    }

}
