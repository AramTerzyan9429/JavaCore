package InternetCours;
//Scanner:

public class IncteaseTheNumberByOne {
    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.Scann();
        reader.i = count(reader.i);
        reader.k = count(reader.k);

        System.out.println("հիմա մեր առաջին  համարը հավասար է" + reader.i);
        System.out.println("հիմա մեր եկրորդ համարը հավասար է" + reader.k);
    }

    private static int count(int x) {
        x = x + 1;
        return x;
    }
//թիվը ավելացնում ենք մեկով։
//    public static void main(String[] args) {
//        int x=4;
//        int c= 6;
//        int r=9;
//        x=count(x);
//        c=count(c);
//        r=count(r);
//        System.out.println(x);
//        System.out.println(c);
//        System.out.println(r);
//
//    }
//
//
//    private static int count(int k){
//        k=k+2;
//        return k;
//    }
}
