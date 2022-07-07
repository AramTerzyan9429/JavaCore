package InternetCours.StatikExample;

import ClassWork.Lesson8.Example;

public class StatikExample {
    static int t;
    static int c = 8;
    int i;
    int b = 4;

    static {
        System.out.println("statik initializer");
    }

    {
        System.out.println("initializer");
    }

    StatikExample() {
        t++;
        System.out.println("Constructor");
    }

    static void staticMethod() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        System.out.println(StatikExample.c);
        new StatikExample();
        new StatikExample();
    }
}
