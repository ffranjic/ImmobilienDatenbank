package immogui;

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Immogui extends Application {

   public static ArrayList<Wohnung> wohnungssammlung;
   public static Wohnung wohnung;
   public static ArrayList<Haus> haussammlung;
   public static Haus haus;
   
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        FXMLLoader rootLoader=new FXMLLoader();
        rootLoader.setLocation(getClass().getResource("wastun.fxml"));
        VBox rootPane=(VBox) rootLoader.load();
        Scene scene = new Scene(rootPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hauptmenü");
        primaryStage.show();
        
        
        WastunController wastun = rootLoader.getController();
        wastun.setManager(this);
        
    }

    public static void main(String[] args) {
        wohnungssammlung = new ArrayList<Wohnung>();
        haussammlung = new ArrayList<Haus>();
        launch(args); 
    }
    
    public static void wohnungHinzufügen(Wohnung wohnung)
    {
        Immogui.wohnung = wohnung;
        wohnungssammlung.add(Immogui.wohnung);
    }
    public static void hausHinzufügen(Haus haus)
    {
        Immogui.haus = haus;
        haussammlung.add(Immogui.haus);
    }
    
    //öffnet hausoderwohnung.fxml
    public void initImmo() throws Exception{
        
       
        Parent root = FXMLLoader.load(getClass().getResource("hausoderwohnung.fxml"));
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setTitle("Auswahl");
        stage.setScene(scene);
        stage.show();
    }
    
    //öffnet datenbank.fxml
    public void kaufImmo() throws Exception{
        
        Parent root = FXMLLoader.load(getClass().getResource("datenbank.fxml"));
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setTitle("Ausgabe");
        stage.setScene(scene);
        stage.show();
    }

}
