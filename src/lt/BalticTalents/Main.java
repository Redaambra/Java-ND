package lt.BalticTalents;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main2(String[] args) {

    Zmogus zmogus1 = new Zmogus();
    zmogus1.vardas = "Karolis XV";
    System.out.println(zmogus1.vardas);

    Zmogus zmogus2 = new Zmogus();
    zmogus2.vardas = "Ieva";
    zmogus2.pavarde = "Ievaitė";
    System.out.println(zmogus2.vardas + ' ' + zmogus2.pavarde);
  }
}

class Zmogus {

  String vardas;

  String pavarde;

}
