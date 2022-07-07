package InternetCours;

public class IncteaseTheNumberOne2 {
    public static void main(String[] args) {
        Reader reader=new Reader();
      reader.Scann();
      reader.i=count(reader.i);
      reader.k=count(reader.k);
        System.out.println("araji hamary havasar e"+reader.i);
        System.out.println("ekrord hamary havasar e "+reader.k);



    }
    private static int count(int k){
        k=k+2;
        return k;
    }
    }