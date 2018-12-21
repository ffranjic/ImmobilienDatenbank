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
  private boolean kaufart;
  private Scanner sc;
  public ArrayList<Wohnung> wohnungen;

  public Wohnung()
  {
      wohnungen = new ArrayList<Wohnung>();
      sc = new Scanner(System.in);


      //Benötigte Daten eingeben
      System.out.println("Bitte geben sie die grösse der Wohnung an (m2): ");
      flaeche = sc.nextInt();
      System.out.println("Bitte geben sie die Anzahl Zimmer der Wohnung an: ");
      anzahlpersonen = sc.nextInt();
      System.out.println("Bitte gebe Sie die Ortschaft ein: ");
      Lage = sc.next();
      System.out.println("Bitte geben Sie an ob es zum Mieten oder zum verkaufen ist(false = Mieten/ true = Verkaufen): ");
      kaufart = sc.nextBoolean();
      
      //Kauf bzw. Mietpreis eingeben
      if(this.kaufart)
      {
          System.out.println("Bitte gebe Sie den Preis der Immobilie an");
          this.preis = sc.nextInt();
      }
      else
      {
          System.out.println("Bitte geben sie den Mietpreis an: ");
          this.preis = sc.nextInt();
      }
  }
}



