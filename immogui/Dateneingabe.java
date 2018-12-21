package immogui;



import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;



public class Dateneingabe {
    
    private boolean auswahl;
    private Scanner sc;
    private Haus newhaus;
    private Wohnung newwohnung;
   
    public ArrayList<Wohnung> wohnungssammlung;
    public ArrayList<Haus> haussammlung;
    
    public Dateneingabe()
    {
        
        
        sc = new Scanner(System.in);
        
        //Neue Sceneladen (Hausoderwohnung.fxml)
        //FXMLLoader loader = new FXMLLoader(geClass().getResource("hausoderwohnung.fxml"));
        System.out.println("Bitte geben Sie an ob sie ein Haus oder eine Wohnung inserieren möchten: ");
        auswahl = sc.nextBoolean();
        
        if(auswahl)
        {
         
                    System.out.println("Ich bin ein neues Haus");
                    newwohnung = new Wohnung();
                    //Geh in den Konstruktor von Wohnung
                    Immogui.wohnungHinzufügen(newwohnung);
                    //Objekt in Arraylist speichern
                    System.out.println(wohnungssammlung.size());
                    
                    
        }           
        else
        {
                    System.out.println("Ich bin eine neue Wohnung");
                    newhaus = new Haus(); 
                    //Geh in den Konstruktor von Haus
                    Immogui.hausHinzufügen(newhaus);
                    //Objekt in Arraylist speichern
                    System.out.println(haussammlung.size());
                    
        } 
        
    }      
}
