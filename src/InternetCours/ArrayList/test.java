package InternetCours.ArrayList;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < arrayList.size(); i++) {

        }
        for (Integer x : arrayList) {
            System.out.println(x);

        }
    }


    //Կտպի 1-100 հերթականությամբ ,իրար տակ
//        for (int i = 0; i <arrayList.size() ; i++) {
//            System.out.println(arrayList.get(i));
//
//        }
}


//    //կտպի առաջի և վերջի թիվը Get
//    public static void main(String[] args) {
//        ArrayList<Integer>arrayList=new ArrayList<>();
//        for (int i = 0; i <100 ; i++) {
//            arrayList.add(i);
//        }
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(99));
//
//    }


//    public static void main(String[] args) {
//
//        //տպի բոլոր հարյուր թվերը -add
//        ArrayList<Integer>arrayList=new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            arrayList.add(i);
//        }
//        System.out.println(arrayList);
//    }
//}


//
//        ArrayList<Integer>arrayList=new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            arrayList.add(i);
//        }
//arrayList.remove(5);
//        System.out.println(arrayList);
//        }
//    }
////[0, 1, 2, 3, 4, 6, 7, 8, 9] կջնջի 5 թիվը։-remove
