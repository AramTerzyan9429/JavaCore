package homework.chapters.Lesson6;

public class FigurePainter {
    public static void main(String[] args) {
                   //ֆիգուր1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
                     //Ֆիգուր 2
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }
              //ֆիգուր3
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
