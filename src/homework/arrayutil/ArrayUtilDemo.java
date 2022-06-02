package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 1, 9, 6};
        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.println("max = " + arrayUtil.getMax(numbers));
        System.out.println("min=" + arrayUtil.getMin(numbers));
        arrayUtil.printEveanNumbers(numbers);
        System.out.println();
        arrayUtil.printOddNumbers(numbers);
        System.out.println();
        System.out.println(arrayUtil.getCountForPairNumber(numbers));
        System.out.println(arrayUtil.getCountOddNumbers(numbers));
        System.out.println(arrayUtil.getAverage(numbers));
    }
}