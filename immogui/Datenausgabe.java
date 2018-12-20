/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immogui;

import java.util.Scanner;

public class Datenausgabe 
{
    
    private Scanner sc;
    
    public Datenausgabe()
    {
//        System.out.println("Ich bin im Datenausgabekonstruktor");
//        sc = new Scanner(System.in);
//        System.out.println("Soll es ein Haus oder eine Wohnung sein?:");
//        
//        System.out.println("Wie Teuer soll es sein:");
//        System.out.println("Wie gross soll es sein (m2): ");
//        System.out.println("");
        for(int i = 0; i <= Immogui.haussammlung.size(); i++)
        {
            Immogui.haussammlung.get(i);
        }
    }

  
 
    
}
