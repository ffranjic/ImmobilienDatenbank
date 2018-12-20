
package immogui;
import java.util.Scanner;
import java.util.ArrayList;

public class Wohnung {
  public int groesse;
  public int flaeche;
  public int anzahlpersonen;
  public int preis;
  private int zimmer;
  private String Lage;
  private boolean Kaufart;
  private Scanner sc;
  public ArrayList<Wohnung> wohnungen;

  public Wohnung()
  {
      wohnungen = new ArrayList<Wohnung>();
      sc = new Scanner(System.in);


      System.out.println("Bitte geben sie die grösse der Immobilie an: ");
      groesse = sc.nextInt();
      System.out.println("Bitte geben sie die Anzahl Zimmer an: ");
      zimmer = sc.nextInt();
      System.out.println("Bitte gebe Sie die Ortschaft ein: ");
      Lage = sc.next();
      System.out.println("Bitte geben Sie an ob es zum Mieten oder zum verkaufen ist(0 = Mieten/ 1 = Verkaufen): ");
      Kaufart = sc.nextBoolean();
      System.out.println("Bitte geben Sie an ob es zum Mieten oder zum verkaufen ist(0 = Mieten/ 1 = Verkaufen): ");
      Kaufart = sc.nextBoolean();
      System.out.println("Bitte geben Sie an ob es zum Mieten oder zum verkaufen ist(0 = Mieten/ 1 = Verkaufen): ");
      Kaufart = sc.nextBoolean();
      System.out.println("Bitte geben Sie an ob es zum Mieten oder zum verkaufen ist(0 = Mieten/ 1 = Verkaufen): ");
      Kaufart = sc.nextBoolean();
      System.out.println("Test");
  }

  public void wohnungHinzufügen()
  {
    //wohnungen.add();
  }
}



/*
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
*/
