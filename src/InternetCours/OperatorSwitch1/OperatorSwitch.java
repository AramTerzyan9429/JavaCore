package InternetCours.OperatorSwitch1;

public class OperatorSwitch {
    //Այս դեպքում ավելացնում ենք ֆինալ,բայց անվանումները գրվում են
    //մեծատառով

   final int VALUE = 1, FIRSVALUE = 1, SECONDVALUE = 2, THIRDVALUE = 3;

    public void foo(){

        switch (VALUE) {
            case FIRSVALUE:
                System.out.println(FIRSVALUE);
                break;
            case SECONDVALUE:
                System.out.println(SECONDVALUE);
                break;
            case THIRDVALUE:
                System.out.println(THIRDVALUE);
                break;
            default:
                System.out.println("dafault");
        }



//կտպի ըստ հերթականությամբ ,մինչև գտնի Switch48,բայց եթե ուում ենք որ
        //տպի 48 ու կանգ առնի ավելացնում ենք Break,իսկ եթե չունենք ոչ մի թիվ
        //վերջում ավելացնում ենք Defult
//        switch (73){
//            case 25:
//                System.out.println(25);
//                break;
//            case 73:
//                System.out.println(75);
//                break;
//            case 48:
//                System.out.println(48);
//                break;
//            default:
//                System.out.println("default");
//        }


    }


}
