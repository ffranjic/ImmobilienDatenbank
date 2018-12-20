
package immogui;
import java.util.Scanner;

public class Immobiilien {

  private Haus haus;
  private Wohnung wohnung;
  private Scanner sc;


  private Immobiilien()
  {
    sc = new Scanner(System.in);

  }

  public void Hauserstellen()
  {
    haus = new Haus();


  }
  public void Wohnugnerstellen()
  {
    wohnung = new Wohnung();

  }

}
