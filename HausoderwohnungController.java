package immogui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class HausoderwohnungController implements Initializable {

    private boolean auswahl;
    private Scanner sc;
    private Haus newhaus;
    private Wohnung newwohnung;
   
    public ArrayList<Wohnung> wohnungssammlung;
    public ArrayList<Haus> haussammlung;
    
    @FXML
    private void haus(ActionEvent event)
    {
        System.out.println("Du erstells ein Haus");
    }
    
    @FXML
    private void wohnung(ActionEvent event) 
    {
        System.out.println("Du erstells eine Wohnung"); 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
}
