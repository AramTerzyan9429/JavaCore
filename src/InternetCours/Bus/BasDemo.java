package InternetCours.Bus;

public class BasDemo {
    public static void main(String[] args) {
        Bus ourBas= new Bus();
        Bus firabus=new Bus();
        Bus seconbus=new Bus();


ourBas.color="kapuyt";
firabus.color="kanach";
seconbus.color="sev";

ourBas.showColor();
firabus.showColor();
seconbus.showColor();


ourBas.model="opel";
firabus.model="nissan";
seconbus.model="bmw";

ourBas.showModel();
firabus.showModel();
seconbus.showModel();

    }
}
