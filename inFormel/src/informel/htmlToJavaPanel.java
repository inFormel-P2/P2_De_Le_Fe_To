/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informel;

import java.io.File;
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import java.io.File;
import java.awt.CardLayout;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


import java.net.URI;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javax.swing.JFrame;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 *
 * @author denisehfg
 */
public class htmlToJavaPanel {
    
    private java.net.URL url;
    private JScrollPane pane;
    
    public htmlToJavaPanel(JScrollPane pPane, java.net.URL pUrl) {
        url = pUrl;
        pane = pPane;
    
    }
    
    public void setUrl(java.net.URL pUrl){
        url = pUrl;
    
    }
    
    
    public void setPane(JScrollPane pPane){
        pane = pPane;
        
    }
    
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
