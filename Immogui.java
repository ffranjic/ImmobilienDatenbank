package immogui;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Immogui extends Application {

   public static ArrayList<Wohnung> wohnungssammlung;
   public static Wohnung wohnung;
   public static ArrayList<Haus> haussammlung;
   public static Haus haus;
   
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("wastun.fxml"));
        
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hauptmenü");
        primaryStage.show();
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

}
