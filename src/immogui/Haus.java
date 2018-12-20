
package immogui;
import java.util.Scanner;

public class Haus {
    private int groesse;
    private int zimmer;
    private String Lage;
    private boolean Kaufart;
    private Scanner sc;
    private String test;
    
    public Haus()
    {
      sc = new Scanner(System.in);

      System.out.println("Bitte geben sie die grösse der Immobilie an: ");
      groesse = sc.nextInt();
      System.out.println("Bitte geben sie die Anzahl Zimmer an: ");
      zimmer = sc.nextInt();
      System.out.println("Bitte gebe Sie die Ortschaft ein: ");
      Lage = sc.next();
      System.out.println("Bitte geben Sie an ob es zum Mieten oder zum verkaufen ist(0 = Mieten/ 1 = Verkaufen): ");
      Kaufart = sc.nextBoolean();
    }

    //Gettermethoden
    private int getgroesse()
    {
      return this.groesse;
    }
    private int getZimmer()
    {
      return this.zimmer;
    }
    private String getLage()
    {
      return this.Lage;
    }
    private boolean getKaufart()
    {
      return this.Kaufart;
    }

}
