
package immogui;

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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void Immoinserat(ActionEvent event) 
    {  
        Dateneingabe dateneingabe = new Dateneingabe();
        
    }

    @FXML
    private void Immokaufen(ActionEvent event) 
    {
        Datenausgabe datenausgabe = new Datenausgabe();
    }  
}
