package homework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework practiceHomework=new PracticeHomework();
        System.out.println(practiceHomework.convert(10));
        System.out.println(practiceHomework.calcAge(360));
        System.out.println(practiceHomework.nextNumber(12));
        System.out.println(practiceHomework.isSameNum(10,9));
        System.out.println(practiceHomework.lessThanOrEqualToZero(4));
        System.out.println(practiceHomework.reversBool(false));
        System.out.println(practiceHomework.maxLength(new int[5],new int[9]));
    }
}
