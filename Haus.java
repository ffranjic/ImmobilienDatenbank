package immogui;



import java.util.Scanner;

public class Haus {
    private int flaeche;
    private int anzahlpersonen;
    private String Lage;
    private boolean kaufart;
    private int preis;
    private Scanner sc;
    private String test;
    
    public Haus()
    {
      sc = new Scanner(System.in);

      //Benötigte Daten eingeben
      System.out.println("Bitte geben sie die grösse der Immobilie an (m2): ");
      flaeche = sc.nextInt();
      System.out.println("Bitte geben sie die Anzahl Zimmer an: ");
      anzahlpersonen = sc.nextInt();
      System.out.println("Bitte gebe Sie die Ortschaft ein: ");
      Lage = sc.next();
      System.out.println("Bitte geben Sie an ob es zum Mieten oder zum verkaufen ist(false = Mieten/true = Verkaufen): ");
      kaufart = sc.nextBoolean();
      
      //Kauf bzw. Mietpreis eingeben
      if(this.kaufart)
      {
          System.out.println("Bitte gebe Sie den Preis der Immobilie an");
      }
      else
      {
          System.out.println("Bitte geben sie den Mietpreis an: ");
      }
    }

    //Gettermethoden
    private int getgroesse()
    {
      return this.flaeche;
    }
    private int getZimmer()
    {
      return this.anzahlpersonen;
    }
    private String getLage()
    {
      return this.Lage;
    }
   

}
