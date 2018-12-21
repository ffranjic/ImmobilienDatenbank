
package immogui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class WastunController implements Initializable {

    @FXML
    private Button button1;
    private Button button2;
    
    private static Immogui immogui = new Immogui();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void Immoinserat(ActionEvent event) throws Exception 
    {  
        System.out.println("lasjdlkfjasdf");
        immogui.initImmo();
        //Dateneingabe dateneingabe = new Dateneingabe();
        
        
    }

    @FXML
    private void Immokaufen(ActionEvent event) throws Exception 
    {
        immogui.kaufImmo();
        //Datenausgabe datenausgabe = new Datenausgabe();
    }  
    
    public void setManager(Immogui immogui){
        this.immogui=immogui;
    }
}
