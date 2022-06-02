package ClassesAndObejects;
// վերադարձում մեթոդ
public class ClassesAndObejects {
    public static void main(String[] args) {
        Person person1 = new Person();
       person1.name = "Aram";
        person1.age = 29;
        System.out.println("im anunn e" + " " + person1.name + " " + person1.age + "tarekan ");
      int years1=  person1.calculatorYearsToretirement();

        System.out.println("թոշակի տարիքը"+years1);
    }
}


class Person {
    String name;
    int age;
    int calculatorYearsToretirement(){
        int years=65-age;
      return years;
    }

    void speack(){
        System.out.println("barev");
    }
    void speack2(){
        System.out.println("im anunn e "+name+age+"tarekan");
    }
}







//public class ClassesAndObejects {
//    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.name = "Aram";
//        person1.age = 29;
//        System.out.println("im anunn e" + " " + person1.name + " " + person1.age + "tarekan ");
//        person1.speack();
//        person1.speack2();
//    }
//}
//
//
//class Person {
//    String name;
//    int age;
//
//    void speack(){
//        System.out.println("barev");
//    }
//void speack2(){
//    System.out.println("im anunn e "+name+age+"tarekan");
//}
//    }
//




















//puplichni klass

//    public static void main(String[] args) {
//        ClassesAndObejects.Person person1 = new ClassesAndObejects.Person();
//        person1.name = "Aram";
//        person1.age = 28;
//        person1.sayHello();
//        ClassesAndObejects.Person person2 = new ClassesAndObejects.Person();
//        person2.name = "Sayat";
//        person2.age = 28;
//        person2.speack();
//
//    }
//}
////obichni klass
//
//class ClassesAndObejects.Person {
//    String name;
//    int age;
//
//    void speack() {
//
//        System.out.println("im anunn e"+" " + name + " " + age + " " + "tarekan");
//    }
//    void sayHello(){
//        System.out.println("barev");
//
//    }
//}