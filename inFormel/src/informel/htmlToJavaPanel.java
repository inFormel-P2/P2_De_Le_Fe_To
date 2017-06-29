/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informel;

import java.io.*;
import javax.swing.*;
import java.awt.*;

    
public class htmlToJavaPanel {
    
    /*
    Im Konstruktor werden die Variablen zum übersetzen einer Url und zum erstellen eines Scrollpane Objekts mitgegeben.
    */
    private java.net.URL url;
    private JScrollPane pane;
    
    /*
     *In der Methode wird den Variablen ein Wert übergeben.
     */
    public htmlToJavaPanel(JScrollPane pPane, java.net.URL pUrl) {
        url = pUrl;
        pane = pPane;
    
    }
    
    /*
    Die Methode erstellt unsere EditorPane, wo die HTML Seite geladen und angezeigt wird.
    Zusätzlich wird die EditorPane als nicht editierbar gesetzt, somit kann der Content nicht geändert werden.
    Die EditorPane selbst wird in einer ScrollPane angezeigt, somit haben wir die Möglichkeit den Content scollbar zu machen.
    */
    
    public void buildPane() {
        // create jeditorpane
        JEditorPane jEditorPane = new JEditorPane();
        
        // make it read-only
        jEditorPane.setEditable(false);
        
        // create a scrollpane; modify its attributes as desired
        pane.setViewportView(jEditorPane);
        
        
        
        try {
            jEditorPane.setPage(url);
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL");
        }
        
    }
    
}
