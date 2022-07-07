package InternetCours.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        DynamicArray test = new DynamicArray();
        test.add(1);
        System.out.println(test.isEmpty());
        System.out.println(test.getByIndex(10));
        System.out.println(test.getFirstIndexByValue(8));

        }

    }
