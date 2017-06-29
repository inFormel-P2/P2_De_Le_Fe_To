/**
 * Die Klasse inFormel_GUI ist unsere Hauptklasse und erstellt unsere GUI.
 * inFormel dient als Wissenssammlung oder auch Formelsammlung.
 * Im Kopf der Klasse importieren wir unsere benötigten Klassen aus den packages javafx und java.
 * Die javafx Klassen bilden unsere GUI.
 * 
 * @author Denise Fiedler, Lea Rosental
 * @version 29. Juni. 2017
 */
package informel;

import java.io.*;
import javax.swing.*;
import java.awt.*;

public class inFormel_GUI extends javax.swing.JFrame {
     /**
     * Im Konstruktor geben wir unsere Variablen mit (siehe Code Ende).
     * Darauf folgen unsere Methoden.
     */
    
    /**
     * In das Objekt assetsUrl wird die user.dir geladen, also der Pfad wo sich das Programm befindet.
     * Zusätzlich wird "/assets/" angehängt.
     */
    
    private static final String assetsUrl = System.getProperty("user.dir") + "/assets/";

    /**
     * In der Methode wird der assetsUrl Pfad ausgegeben und die Komponenten geladen..
     * Dies im Falle eines Fehlers zum troubleshooting, denn somit können wir verfolgen auf welchen Pfad das Programm zugreift.
     * Ausserdem wird in der Methode die initComponents Methode aufgerufen, in dieser werden unsere GUI Komponenten erstellt.
     */
     
    public inFormel_GUI() {
        System.out.print(assetsUrl);
        initComponents();
        
    }

      /**
     * Die Methode initComponents erstellt unsere GUI.
     * In der Mehtode werden alle Komponenten geladen, welche wir durch den Designer mitgegeben haben.
     * Das sind als Beispiel die Buttons und die Panels.
     * Auch werden die Formen in der Methode benannt und gestyled, d.h. es wird übergeben wo der Button sitzt und wie dieser aussieht,
     * in unserem Fall sind die Buttons mit Icons belegt.
     * 
     * Da wir die GUI über den Designer aufgebaut haben, ist es uns nicht möglich im Code selbst Veränderungen an den Formen vorzunehmen.
     * Wir müssen alle Änderungen über die Properties im Designer festlegen.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Hauptscreen = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        Programmieren = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        Arrays = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        arrayPane = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        Basics = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        Mathe = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        Klassendefinition = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        klassdefPane = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        IfAbfragen = new javax.swing.JPanel();
        jButton33 = new javax.swing.JButton();
        ifPane = new javax.swing.JScrollPane();
        jEditorPane3 = new javax.swing.JEditorPane();
        Schleifen = new javax.swing.JPanel();
        jButton36 = new javax.swing.JButton();
        schleifenPane = new javax.swing.JScrollPane();
        jEditorPane4 = new javax.swing.JEditorPane();
        ObjundKlassen = new javax.swing.JPanel();
        jButton38 = new javax.swing.JButton();
        objklassPane = new javax.swing.JScrollPane();
        jEditorPane5 = new javax.swing.JEditorPane();
        GrundbegriffeMathe = new javax.swing.JPanel();
        jButton40 = new javax.swing.JButton();
        grundbegPane = new javax.swing.JScrollPane();
        jEditorPane6 = new javax.swing.JEditorPane();
        KomplexeRechnung = new javax.swing.JPanel();
        jButton42 = new javax.swing.JButton();
        komplexePane = new javax.swing.JScrollPane();
        jEditorPane7 = new javax.swing.JEditorPane();
        Darstellungsformen = new javax.swing.JPanel();
        jButton44 = new javax.swing.JButton();
        darstellungPane = new javax.swing.JScrollPane();
        jEditorPane8 = new javax.swing.JEditorPane();
        Dreiecke = new javax.swing.JPanel();
        jButton46 = new javax.swing.JButton();
        dreieckePane = new javax.swing.JScrollPane();
        jEditorPane9 = new javax.swing.JEditorPane();
        Bruchrechnen = new javax.swing.JPanel();
        jButton48 = new javax.swing.JButton();
        bruchPane = new javax.swing.JScrollPane();
        jEditorPane10 = new javax.swing.JEditorPane();
        TypoCont = new javax.swing.JPanel();
        jButton52 = new javax.swing.JButton();
        typoPane = new javax.swing.JScrollPane();
        jEditorPane12 = new javax.swing.JEditorPane();
        Taschenrechner = new javax.swing.JPanel();
        jButton54 = new javax.swing.JButton();
        taschenrechnerPane = new javax.swing.JScrollPane();
        jEditorPane13 = new javax.swing.JEditorPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 687));

        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setSize(new java.awt.Dimension(1500, 900));
        jPanel1.setLayout(new java.awt.CardLayout());

        Hauptscreen.setBackground(new java.awt.Color(255, 255, 255));
        Hauptscreen.setPreferredSize(new java.awt.Dimension(1200, 675));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle_Info.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle_Basics.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle_Mathe.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle_Prog.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle_Typo.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HauptscreenLayout = new javax.swing.GroupLayout(Hauptscreen);
        Hauptscreen.setLayout(HauptscreenLayout);
        HauptscreenLayout.setHorizontalGroup(
            HauptscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HauptscreenLayout.createSequentialGroup()
                .addGroup(HauptscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HauptscreenLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton9))
                    .addGroup(HauptscreenLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jButton7)))
                .addGap(48, 48, 48)
                .addComponent(jButton5)
                .addGroup(HauptscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HauptscreenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(HauptscreenLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButton8)))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        HauptscreenLayout.setVerticalGroup(
            HauptscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HauptscreenLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(HauptscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5)
                    .addGroup(HauptscreenLayout.createSequentialGroup()
                        .addGroup(HauptscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addGroup(HauptscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HauptscreenLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HauptscreenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)))))
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jPanel1.add(Hauptscreen, "mainCard");

        Programmieren.setBackground(new java.awt.Color(255, 255, 255));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle_Prog.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton10.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Programmieren/Circle_Klassendef.png"))); // NOI18N
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Programmieren/Circle_Schleifen.png"))); // NOI18N
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Programmieren/Circle_Array.png"))); // NOI18N
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton13.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Programmieren/Circle_ObjundKla.png"))); // NOI18N
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton14.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Programmieren/Circle_if.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton15.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ProgrammierenLayout = new javax.swing.GroupLayout(Programmieren);
        Programmieren.setLayout(ProgrammierenLayout);
        ProgrammierenLayout.setHorizontalGroup(
            ProgrammierenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProgrammierenLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addGroup(ProgrammierenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12))
                .addGap(28, 28, 28)
                .addGroup(ProgrammierenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10)
                    .addGroup(ProgrammierenLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton15)))
                .addGap(18, 18, 18)
                .addGroup(ProgrammierenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addComponent(jButton13))
                .addContainerGap(544, Short.MAX_VALUE))
        );
        ProgrammierenLayout.setVerticalGroup(
            ProgrammierenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProgrammierenLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(ProgrammierenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ProgrammierenLayout.createSequentialGroup()
                        .addComponent(jButton15)
                        .addGap(44, 44, 44)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProgrammierenLayout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14))
                    .addGroup(ProgrammierenLayout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13)))
                .addContainerGap(310, Short.MAX_VALUE))
        );

        jPanel1.add(Programmieren, "progCard");

        Arrays.setBackground(new java.awt.Color(255, 255, 255));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Programmieren/Circle_Array.png"))); // NOI18N
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton17.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        arrayPane.setViewportView(jEditorPane1);

        javax.swing.GroupLayout ArraysLayout = new javax.swing.GroupLayout(Arrays);
        Arrays.setLayout(ArraysLayout);
        ArraysLayout.setHorizontalGroup(
            ArraysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArraysLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton17)
                .addGap(43, 43, 43)
                .addComponent(arrayPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        ArraysLayout.setVerticalGroup(
            ArraysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArraysLayout.createSequentialGroup()
                .addComponent(arrayPane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ArraysLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton17)
                .addGap(34, 558, Short.MAX_VALUE))
        );

        jPanel1.add(Arrays, "arrayCard");

        Basics.setBackground(new java.awt.Color(255, 255, 255));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle_Basics.png"))); // NOI18N
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton20.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton20.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Basics/Circle_Bruchrechnen.png"))); // NOI18N
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton23.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton23MouseClicked(evt);
            }
        });

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Basics/Circle_Taschenrechner.png"))); // NOI18N
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton24.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton24MouseClicked(evt);
            }
        });

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Basics/Circle_Dreiecke.png"))); // NOI18N
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton25.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BasicsLayout = new javax.swing.GroupLayout(Basics);
        Basics.setLayout(BasicsLayout);
        BasicsLayout.setHorizontalGroup(
            BasicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicsLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jButton24)
                .addGap(28, 28, 28)
                .addGroup(BasicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton20)
                    .addGroup(BasicsLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton25)))
                .addGap(18, 18, 18)
                .addComponent(jButton23)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        BasicsLayout.setVerticalGroup(
            BasicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasicsLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(BasicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BasicsLayout.createSequentialGroup()
                        .addComponent(jButton25)
                        .addGap(44, 44, 44)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton24)
                    .addComponent(jButton23))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        jPanel1.add(Basics, "basicsCard");

        Mathe.setBackground(new java.awt.Color(255, 255, 255));

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle_Mathe.png"))); // NOI18N
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton21.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton21.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Mathe/Circle_Darstellungsformen.png"))); // NOI18N
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);
        jButton27.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton27.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton27MouseClicked(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Mathe/Circle_Komplexe.png"))); // NOI18N
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);
        jButton28.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton28.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton28MouseClicked(evt);
            }
        });

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Mathe/Circle_Grundbegriffe.png"))); // NOI18N
        jButton29.setBorderPainted(false);
        jButton29.setContentAreaFilled(false);
        jButton29.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton29.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N
        jButton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MatheLayout = new javax.swing.GroupLayout(Mathe);
        Mathe.setLayout(MatheLayout);
        MatheLayout.setHorizontalGroup(
            MatheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatheLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jButton28)
                .addGap(28, 28, 28)
                .addGroup(MatheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21)
                    .addGroup(MatheLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton29)))
                .addGap(18, 18, 18)
                .addComponent(jButton27)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        MatheLayout.setVerticalGroup(
            MatheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatheLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(MatheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MatheLayout.createSequentialGroup()
                        .addComponent(jButton29)
                        .addGap(44, 44, 44)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton28)
                    .addComponent(jButton27))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        jPanel1.add(Mathe, "matheCard");

        Klassendefinition.setBackground(new java.awt.Color(255, 255, 255));

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Programmieren/Circle_Klassendef.png"))); // NOI18N
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton22.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        klassdefPane.setViewportView(jEditorPane2);

        javax.swing.GroupLayout KlassendefinitionLayout = new javax.swing.GroupLayout(Klassendefinition);
        Klassendefinition.setLayout(KlassendefinitionLayout);
        KlassendefinitionLayout.setHorizontalGroup(
            KlassendefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KlassendefinitionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton22)
                .addGap(43, 43, 43)
                .addComponent(klassdefPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        KlassendefinitionLayout.setVerticalGroup(
            KlassendefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KlassendefinitionLayout.createSequentialGroup()
                .addComponent(klassdefPane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(KlassendefinitionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton22)
                .addGap(34, 558, Short.MAX_VALUE))
        );

        jPanel1.add(Klassendefinition, "classdefCard");

        IfAbfragen.setBackground(new java.awt.Color(255, 255, 255));

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Programmieren/Circle_if.png"))); // NOI18N
        jButton33.setBorderPainted(false);
        jButton33.setContentAreaFilled(false);
        jButton33.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton33.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        ifPane.setViewportView(jEditorPane3);

        javax.swing.GroupLayout IfAbfragenLayout = new javax.swing.GroupLayout(IfAbfragen);
        IfAbfragen.setLayout(IfAbfragenLayout);
        IfAbfragenLayout.setHorizontalGroup(
            IfAbfragenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IfAbfragenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton33)
                .addGap(43, 43, 43)
                .addComponent(ifPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        IfAbfragenLayout.setVerticalGroup(
            IfAbfragenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IfAbfragenLayout.createSequentialGroup()
                .addComponent(ifPane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(IfAbfragenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton33)
                .addGap(34, 558, Short.MAX_VALUE))
        );

        jPanel1.add(IfAbfragen, "ifCard");

        Schleifen.setBackground(new java.awt.Color(255, 255, 255));

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Programmieren/Circle_Schleifen.png"))); // NOI18N
        jButton36.setBorderPainted(false);
        jButton36.setContentAreaFilled(false);
        jButton36.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton36.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        schleifenPane.setViewportView(jEditorPane4);

        javax.swing.GroupLayout SchleifenLayout = new javax.swing.GroupLayout(Schleifen);
        Schleifen.setLayout(SchleifenLayout);
        SchleifenLayout.setHorizontalGroup(
            SchleifenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SchleifenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton36)
                .addGap(43, 43, 43)
                .addComponent(schleifenPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        SchleifenLayout.setVerticalGroup(
            SchleifenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SchleifenLayout.createSequentialGroup()
                .addComponent(schleifenPane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(SchleifenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton36)
                .addGap(34, 558, Short.MAX_VALUE))
        );

        jPanel1.add(Schleifen, "schleifenCard");

        ObjundKlassen.setBackground(new java.awt.Color(255, 255, 255));

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Programmieren/Circle_ObjundKla.png"))); // NOI18N
        jButton38.setBorderPainted(false);
        jButton38.setContentAreaFilled(false);
        jButton38.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton38.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        objklassPane.setViewportView(jEditorPane5);

        javax.swing.GroupLayout ObjundKlassenLayout = new javax.swing.GroupLayout(ObjundKlassen);
        ObjundKlassen.setLayout(ObjundKlassenLayout);
        ObjundKlassenLayout.setHorizontalGroup(
            ObjundKlassenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ObjundKlassenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton38)
                .addGap(43, 43, 43)
                .addComponent(objklassPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        ObjundKlassenLayout.setVerticalGroup(
            ObjundKlassenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ObjundKlassenLayout.createSequentialGroup()
                .addComponent(objklassPane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ObjundKlassenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton38)
                .addGap(34, 558, Short.MAX_VALUE))
        );

        jPanel1.add(ObjundKlassen, "objklaCard");

        GrundbegriffeMathe.setBackground(new java.awt.Color(255, 255, 255));

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Mathe/Circle_Grundbegriffe.png"))); // NOI18N
        jButton40.setBorderPainted(false);
        jButton40.setContentAreaFilled(false);
        jButton40.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton40.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        grundbegPane.setViewportView(jEditorPane6);

        javax.swing.GroupLayout GrundbegriffeMatheLayout = new javax.swing.GroupLayout(GrundbegriffeMathe);
        GrundbegriffeMathe.setLayout(GrundbegriffeMatheLayout);
        GrundbegriffeMatheLayout.setHorizontalGroup(
            GrundbegriffeMatheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrundbegriffeMatheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton40)
                .addGap(43, 43, 43)
                .addComponent(grundbegPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        GrundbegriffeMatheLayout.setVerticalGroup(
            GrundbegriffeMatheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrundbegriffeMatheLayout.createSequentialGroup()
                .addComponent(grundbegPane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(GrundbegriffeMatheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton40)
                .addGap(34, 558, Short.MAX_VALUE))
        );

        jPanel1.add(GrundbegriffeMathe, "grundbegCard");

        KomplexeRechnung.setBackground(new java.awt.Color(255, 255, 255));

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Mathe/Circle_Komplexe.png"))); // NOI18N
        jButton42.setBorderPainted(false);
        jButton42.setContentAreaFilled(false);
        jButton42.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton42.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        komplexePane.setViewportView(jEditorPane7);

        javax.swing.GroupLayout KomplexeRechnungLayout = new javax.swing.GroupLayout(KomplexeRechnung);
        KomplexeRechnung.setLayout(KomplexeRechnungLayout);
        KomplexeRechnungLayout.setHorizontalGroup(
            KomplexeRechnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KomplexeRechnungLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton42)
                .addGap(43, 43, 43)
                .addComponent(komplexePane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        KomplexeRechnungLayout.setVerticalGroup(
            KomplexeRechnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KomplexeRechnungLayout.createSequentialGroup()
                .addComponent(komplexePane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(KomplexeRechnungLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton42)
                .addGap(34, 558, Short.MAX_VALUE))
        );

        jPanel1.add(KomplexeRechnung, "komplexeCard");

        Darstellungsformen.setBackground(new java.awt.Color(255, 255, 255));

        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Mathe/Circle_Darstellungsformen.png"))); // NOI18N
        jButton44.setBorderPainted(false);
        jButton44.setContentAreaFilled(false);
        jButton44.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton44.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        darstellungPane.setViewportView(jEditorPane8);

        javax.swing.GroupLayout DarstellungsformenLayout = new javax.swing.GroupLayout(Darstellungsformen);
        Darstellungsformen.setLayout(DarstellungsformenLayout);
        DarstellungsformenLayout.setHorizontalGroup(
            DarstellungsformenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DarstellungsformenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton44)
                .addGap(43, 43, 43)
                .addComponent(darstellungPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        DarstellungsformenLayout.setVerticalGroup(
            DarstellungsformenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DarstellungsformenLayout.createSequentialGroup()
                .addComponent(darstellungPane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(DarstellungsformenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton44)
                .addGap(34, 558, Short.MAX_VALUE))
        );

        jPanel1.add(Darstellungsformen, "darformCard");

        Dreiecke.setBackground(new java.awt.Color(255, 255, 255));

        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Basics/Circle_Dreiecke.png"))); // NOI18N
        jButton46.setBorderPainted(false);
        jButton46.setContentAreaFilled(false);
        jButton46.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton46.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        dreieckePane.setViewportView(jEditorPane9);

        javax.swing.GroupLayout DreieckeLayout = new javax.swing.GroupLayout(Dreiecke);
        Dreiecke.setLayout(DreieckeLayout);
        DreieckeLayout.setHorizontalGroup(
            DreieckeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DreieckeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton46)
                .addGap(43, 43, 43)
                .addComponent(dreieckePane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        DreieckeLayout.setVerticalGroup(
            DreieckeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DreieckeLayout.createSequentialGroup()
                .addComponent(dreieckePane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(DreieckeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton46)
                .addGap(34, 558, Short.MAX_VALUE))
        );

        jPanel1.add(Dreiecke, "dreieckCard");

        Bruchrechnen.setBackground(new java.awt.Color(255, 255, 255));

        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Basics/Circle_Bruchrechnen.png"))); // NOI18N
        jButton48.setBorderPainted(false);
        jButton48.setContentAreaFilled(false);
        jButton48.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton48.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        bruchPane.setViewportView(jEditorPane10);

        javax.swing.GroupLayout BruchrechnenLayout = new javax.swing.GroupLayout(Bruchrechnen);
        Bruchrechnen.setLayout(BruchrechnenLayout);
        BruchrechnenLayout.setHorizontalGroup(
            BruchrechnenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BruchrechnenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton48)
                .addGap(43, 43, 43)
                .addComponent(bruchPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        BruchrechnenLayout.setVerticalGroup(
            BruchrechnenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BruchrechnenLayout.createSequentialGroup()
                .addComponent(bruchPane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(BruchrechnenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton48)
                .addGap(34, 558, Short.MAX_VALUE))
        );

        jPanel1.add(Bruchrechnen, "bruchCard");

        TypoCont.setBackground(new java.awt.Color(255, 255, 255));
        TypoCont.setSize(new java.awt.Dimension(1200, 800));

        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle_Typo.png"))); // NOI18N
        jButton52.setBorderPainted(false);
        jButton52.setContentAreaFilled(false);
        jButton52.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton52.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        typoPane.setViewportView(jEditorPane12);

        javax.swing.GroupLayout TypoContLayout = new javax.swing.GroupLayout(TypoCont);
        TypoCont.setLayout(TypoContLayout);
        TypoContLayout.setHorizontalGroup(
            TypoContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypoContLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton52)
                .addGap(43, 43, 43)
                .addComponent(typoPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        TypoContLayout.setVerticalGroup(
            TypoContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypoContLayout.createSequentialGroup()
                .addComponent(typoPane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(TypoContLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton52)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(TypoCont, "typoCard");

        Taschenrechner.setBackground(new java.awt.Color(255, 255, 255));

        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Basics/Circle_Taschenrechner.png"))); // NOI18N
        jButton54.setBorderPainted(false);
        jButton54.setContentAreaFilled(false);
        jButton54.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton54.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/informel/Images/Circle.png"))); // NOI18N

        taschenrechnerPane.setViewportView(jEditorPane13);

        javax.swing.GroupLayout TaschenrechnerLayout = new javax.swing.GroupLayout(Taschenrechner);
        Taschenrechner.setLayout(TaschenrechnerLayout);
        TaschenrechnerLayout.setHorizontalGroup(
            TaschenrechnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaschenrechnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton54)
                .addGap(43, 43, 43)
                .addComponent(taschenrechnerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        TaschenrechnerLayout.setVerticalGroup(
            TaschenrechnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaschenrechnerLayout.createSequentialGroup()
                .addComponent(taschenrechnerPane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(TaschenrechnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton54)
                .addGap(34, 558, Short.MAX_VALUE))
        );

        jPanel1.add(Taschenrechner, "rechnerCard");

        jMenu1.setText("Home");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /*
     * In dieser Methode geben wir dem Button das Event "MousClicked" mit.
     * Wenn der Button geklickt wird, wird die Porgrammieren Karte aufgerufen.
     * @param evt 
     */
    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "progCard");
    }//GEN-LAST:event_jButton8MouseClicked
    
    /*
     * Diese Methode verwendet auch das Event "MouseClicked"
     * Hier wird die Array Karte aufgerufen und die Klasse htmlToJavaPanel geladen.
     * Dadurch wird uns die HTML für Arrays in einem EditorPane ausgegeben.
     * Wenn die HTML nicht geladen werden kann, wird uns ein Fehler in der Konsole angezeigt.
     * @param evt 
     */
    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
       CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "arrayCard");
        try {
            htmlToJavaPanel objArrayPanel = new htmlToJavaPanel(arrayPane, new File("/Users/denisehfg/Documents/Semester 2/Programmieren 2/inFormel/P2_De_Le_Fe_To/inFormel/assets/HTML_Programmieren/HTML_Array.html").toURI().toURL());
            objArrayPanel.buildPane();
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL");
        }
    }//GEN-LAST:event_jButton13MouseClicked
     /*
     * Diese Methode gibt unserem MenüButton das Event "MouseClicked" mit.
     * Dadruch wird man von jeder beliebigen Karte auf die Main Karte navigiert.
     * @param evt 
     */
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "mainCard");
    }//GEN-LAST:event_jMenu1MouseClicked
    /*
     * Diese Methode verwendet auch das Event "MouseClicked"
     * Hier wird die Bruchrechnen Karte aufgerufen und die Klasse htmlToJavaPanel geladen.
     * Dadurch wird uns die HTML für Bruchrechnen in einem EditorPane ausgegeben.
     * Wenn die HTML nicht geladen werden kann, wird uns ein Fehler in der Konsole angezeigt.
     * @param evt 
     */
    private void jButton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "bruchCard");
        try {
            htmlToJavaPanel objBruchPanel = new htmlToJavaPanel(bruchPane, new File("/Users/denisehfg/Documents/Semester 2/Programmieren 2/inFormel/P2_De_Le_Fe_To/inFormel/assets/HTML_Basics/Bruchrechnen/HTML_Template.html").toURI().toURL());
            objBruchPanel.buildPane();
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL");
        }
    }//GEN-LAST:event_jButton23MouseClicked
    /*
     * Diese Methode verwendet auch das Event "MouseClicked"
     * Hier wird die Darstellungsformen Karte aufgerufen und die Klasse htmlToJavaPanel geladen.
     * Dadurch wird uns die HTML für Darstellungsformen in einem EditorPane ausgegeben.
     * Wenn die HTML nicht geladen werden kann, wird uns ein Fehler in der Konsole angezeigt.
     * @param evt 
     */
    private void jButton27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton27MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "darformCard");
        try {
            htmlToJavaPanel objdarformPanel = new htmlToJavaPanel(darstellungPane, new File("/Users/denisehfg/Documents/Semester 2/Programmieren 2/inFormel/P2_De_Le_Fe_To/inFormel/assets/HTML_Mathe1/HTML_Darstellungsformen.html").toURI().toURL());
            objdarformPanel.buildPane();
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL");
        }
    }//GEN-LAST:event_jButton27MouseClicked
    /*
     * In dieser Methode geben wir dem Button das Event "MousClicked" mit.
     * Wenn der Button geklickt wird, wird die Basics Karte aufgerufen.
     * @param evt 
     */
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "basicsCard");
    }//GEN-LAST:event_jButton6MouseClicked
    /*
     * In dieser Methode geben wir dem Button das Event "MousClicked" mit.
     * Wenn der Button geklickt wird, wird die Mathe1 Karte aufgerufen.
     * @param evt 
     */
    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "matheCard");
    }//GEN-LAST:event_jButton7MouseClicked
    /*
     * Diese Methode verwendet auch das Event "MouseClicked"
     * Hier wird die Typografie Karte aufgerufen und die Klasse htmlToJavaPanel geladen.
     * Dadurch wird uns die HTML für Typografie in einem EditorPane ausgegeben.
     * Wenn die HTML nicht geladen werden kann, wird uns ein Fehler in der Konsole angezeigt.
     * @param evt 
     */
    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "typoCard");
          try {
            htmlToJavaPanel objtypoPanel = new htmlToJavaPanel(typoPane, new File("/Users/denisehfg/Documents/Semester 2/Programmieren 2/inFormel/P2_De_Le_Fe_To/inFormel/assets/HTML_Typografie/HTML_Template.html").toURI().toURL());
            objtypoPanel.buildPane();
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL");
        }
    }//GEN-LAST:event_jButton9MouseClicked
    /*
     * Diese Methode verwendet auch das Event "MouseClicked"
     * Hier wird die Klassendefinition Karte aufgerufen und die Klasse htmlToJavaPanel geladen.
     * Dadurch wird uns die HTML für Klassendefinition in einem EditorPane ausgegeben.
     * Wenn die HTML nicht geladen werden kann, wird uns ein Fehler in der Konsole angezeigt.
     * @param evt 
     */
    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "classdefCard");
        try {
            htmlToJavaPanel objclassdefPanel = new htmlToJavaPanel(klassdefPane, new File("/Users/denisehfg/Documents/Semester 2/Programmieren 2/inFormel/P2_De_Le_Fe_To/inFormel/assets/HTML_Programmieren/HTML_Klassendefinitionen.html").toURI().toURL());
            objclassdefPanel.buildPane();
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL");
        }
    }//GEN-LAST:event_jButton11MouseClicked
    /*
     * Diese Methode verwendet auch das Event "MouseClicked"
     * Hier wird die If Karte aufgerufen und die Klasse htmlToJavaPanel geladen.
     * Dadurch wird uns die HTML für If in einem EditorPane ausgegeben.
     * Wenn die HTML nicht geladen werden kann, wird uns ein Fehler in der Konsole angezeigt.
     * @param evt 
     */
    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "ifCard");
        try {
            htmlToJavaPanel objifPanel = new htmlToJavaPanel(ifPane, new File("/Users/denisehfg/Documents/Semester 2/Programmieren 2/inFormel/P2_De_Le_Fe_To/inFormel/assets/HTML_Programmieren/HTML_if.html").toURI().toURL());
            objifPanel.buildPane();
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL");
        }
    }//GEN-LAST:event_jButton15MouseClicked
    /*
     * Diese Methode verwendet auch das Event "MouseClicked"
     * Hier wird die Schleifen Karte aufgerufen und die Klasse htmlToJavaPanel geladen.
     * Dadurch wird uns die HTML für Schleifen in einem EditorPane ausgegeben.
     * Wenn die HTML nicht geladen werden kann, wird uns ein Fehler in der Konsole angezeigt.
     * @param evt 
     */
    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "schleifenCard");
        try {
            htmlToJavaPanel objschleifenPanel = new htmlToJavaPanel(schleifenPane, new File("/Users/denisehfg/Documents/Semester 2/Programmieren 2/inFormel/P2_De_Le_Fe_To/inFormel/assets/HTML_Programmieren/HTML_Schleifen.html").toURI().toURL());
            objschleifenPanel.buildPane();
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL");
        }
    }//GEN-LAST:event_jButton12MouseClicked
    /*
     * Diese Methode verwendet auch das Event "MouseClicked"
     * Hier wird die Objekte und Klassen Karte aufgerufen und die Klasse htmlToJavaPanel geladen.
     * Dadurch wird uns die HTML für Objekte und Klassen in einem EditorPane ausgegeben.
     * Wenn die HTML nicht geladen werden kann, wird uns ein Fehler in der Konsole angezeigt.
     * @param evt 
     */
    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "objklaCard");
        try {
            htmlToJavaPanel objobjklaPanel = new htmlToJavaPanel(objklassPane, new File("/Users/denisehfg/Documents/Semester 2/Programmieren 2/inFormel/P2_De_Le_Fe_To/inFormel/assets/HTML_Programmieren/HTML_ObjekteundKlassen.html").toURI().toURL());
            objobjklaPanel.buildPane();
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL");
        }
    }//GEN-LAST:event_jButton14MouseClicked
    /*
     * Diese Methode verwendet auch das Event "MouseClicked"
     * Hier wird die Dreiecke Karte aufgerufen und die Klasse htmlToJavaPanel geladen.
     * Dadurch wird uns die HTML für Dreiecke in einem EditorPane ausgegeben.
     * Wenn die HTML nicht geladen werden kann, wird uns ein Fehler in der Konsole angezeigt.
     * @param evt 
     */
    private void jButton25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "dreieckCard");
          try {
            htmlToJavaPanel objdreieckePanel = new htmlToJavaPanel(dreieckePane, new File("/Users/denisehfg/Documents/Semester 2/Programmieren 2/inFormel/P2_De_Le_Fe_To/inFormel/assets/HTML_Basics/Dreiecke/HTML_Template.html").toURI().toURL());
            objdreieckePanel.buildPane();
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL");
        }
    }//GEN-LAST:event_jButton25MouseClicked
    /*
     * In dieser Methode geben wir dem Button das Event "MousClicked" mit.
     * Wenn der Button geklickt wird, wird die Taschenrechner Karte aufgerufen.
     * @param evt 
     */
    private void jButton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "rechnerCard");
    }//GEN-LAST:event_jButton24MouseClicked
    /*
     * Diese Methode verwendet auch das Event "MouseClicked"
     * Hier wird die Grundbegriffe Karte aufgerufen und die Klasse htmlToJavaPanel geladen.
     * Dadurch wird uns die HTML für Grundbegriffe in einem EditorPane ausgegeben.
     * Wenn die HTML nicht geladen werden kann, wird uns ein Fehler in der Konsole angezeigt.
     * @param evt 
     */
    private void jButton29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton29MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "grundbegCard");
        try {
            htmlToJavaPanel objgrundbegPanel = new htmlToJavaPanel(grundbegPane, new File("/Users/denisehfg/Documents/Semester 2/Programmieren 2/inFormel/P2_De_Le_Fe_To/inFormel/assets/HTML_Mathe1/HTML_Grundbegriffe.html").toURI().toURL());
            objgrundbegPanel.buildPane();
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL");
        }
    }//GEN-LAST:event_jButton29MouseClicked
    /*
     * Diese Methode verwendet auch das Event "MouseClicked"
     * Hier wird die komplexe Zahlen Karte aufgerufen und die Klasse htmlToJavaPanel geladen.
     * Dadurch wird uns die HTML für komplexe Zahlen in einem EditorPane ausgegeben.
     * Wenn die HTML nicht geladen werden kann, wird uns ein Fehler in der Konsole angezeigt.
     * @param evt 
     */
    private void jButton28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton28MouseClicked
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "komplexeCard");
        try {
            htmlToJavaPanel objkomplexePanel = new htmlToJavaPanel(komplexePane, new File("/Users/denisehfg/Documents/Semester 2/Programmieren 2/inFormel/P2_De_Le_Fe_To/inFormel/assets/HTML_Mathe1/HTML_komplexeRechnung.html").toURI().toURL());
            objkomplexePanel.buildPane();
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL");
        }
    }//GEN-LAST:event_jButton28MouseClicked

    /**
     * Wenn die vorhandene Java Version nicht aktuell ist und somit das Programm nicht ausgeführt werden kann,
     * werden folgende Meldungen in der Konsole ausgegeben.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inFormel_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inFormel_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inFormel_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inFormel_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inFormel_GUI().setVisible(true);
            }
        });
    }
 /*
 * Im Konstruktor werden unsere Variablen deklariert, also unsere Objekte, welche wir im Designer verwenden.
 * Dies ist normalerweise im Kopf des Konstruktors angezeigt, jedoch wurden die Variablen durch den Designer am Ende des Codes eingefügt.
 */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Arrays;
    private javax.swing.JPanel Basics;
    private javax.swing.JPanel Bruchrechnen;
    private javax.swing.JPanel Darstellungsformen;
    private javax.swing.JPanel Dreiecke;
    private javax.swing.JPanel GrundbegriffeMathe;
    private javax.swing.JPanel Hauptscreen;
    private javax.swing.JPanel IfAbfragen;
    private javax.swing.JPanel Klassendefinition;
    private javax.swing.JPanel KomplexeRechnung;
    private javax.swing.JPanel Mathe;
    private javax.swing.JPanel ObjundKlassen;
    private javax.swing.JPanel Programmieren;
    private javax.swing.JPanel Schleifen;
    private javax.swing.JPanel Taschenrechner;
    private javax.swing.JPanel TypoCont;
    private javax.swing.JScrollPane arrayPane;
    private javax.swing.JScrollPane bruchPane;
    private javax.swing.JScrollPane darstellungPane;
    private javax.swing.JScrollPane dreieckePane;
    private javax.swing.JScrollPane grundbegPane;
    private javax.swing.JScrollPane ifPane;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane10;
    private javax.swing.JEditorPane jEditorPane12;
    private javax.swing.JEditorPane jEditorPane13;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JEditorPane jEditorPane3;
    private javax.swing.JEditorPane jEditorPane4;
    private javax.swing.JEditorPane jEditorPane5;
    private javax.swing.JEditorPane jEditorPane6;
    private javax.swing.JEditorPane jEditorPane7;
    private javax.swing.JEditorPane jEditorPane8;
    private javax.swing.JEditorPane jEditorPane9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane klassdefPane;
    private javax.swing.JScrollPane komplexePane;
    private javax.swing.JScrollPane objklassPane;
    private javax.swing.JScrollPane schleifenPane;
    private javax.swing.JScrollPane taschenrechnerPane;
    private javax.swing.JScrollPane typoPane;
    // End of variables declaration//GEN-END:variables
}
