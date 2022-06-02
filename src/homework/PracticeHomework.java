package homework;

public class PracticeHomework {

    public long convert(int minutes) {
        return minutes * 60;
    }

    public int calcAge(int years) {
        return years * 365;
    }

    public int nextNumber(int number) {
        return number + 1;
    }

    public boolean isSameNum(int a, int b) {
        return a == b;
    }

    public boolean lessThanOrEqualToZero(int number) {
        return number <= 0;
    }

    public boolean reversBool(boolean value) {
        return !value;
    }

    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;
    }
}
