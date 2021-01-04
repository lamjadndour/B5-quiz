/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.application.app.JFrames;

import jaco.mp3.player.MP3Player;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amimi
 */
public class QUIZ extends javax.swing.JFrame {

    /**
     * Creates new form All_LEVEL
     */
    static int score = 0;
    static LinkedList<String> responses = new LinkedList<>();
    static LinkedList<String> incorrects = new LinkedList<>();

    public QUIZ() {
        initComponents();
        // Timer code Goes Here config
        final long Five_MINUTES = 300000;
        final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("mm : ss");
        ActionListener al = new ActionListener() {
            long x = Five_MINUTES - 1000;

            @Override
            public void actionPerformed(ActionEvent ae) {
                jLabel3.setText(sdf.format(new Date(x)));
                x -= 1000;
                if (x == 0) {
                    JOptionPane.showMessageDialog(null, "You Loose");
                    System.exit(0);
                }
            }
        };
        new javax.swing.Timer(1000, al).start();
        // End Of Timer Code config

        // RdioButtons Instantiation config
        // Level 1
        jRadioButton1.setActionCommand("Compilé");
        jRadioButton2.setActionCommand("Interprété");
        jRadioButton3.setActionCommand("Compilé et interpreté");

        jRadioButton4.setActionCommand("Main");
        jRadioButton5.setActionCommand("Object");
        jRadioButton6.setActionCommand("AWT");

        jRadioButton7.setActionCommand("est en minuscule");
        jRadioButton8.setActionCommand("commence par une majuscule");
        jRadioButton9.setActionCommand("est en majuscules");

        jRadioButton10.setActionCommand("oui");
        jRadioButton11.setActionCommand("non");

        jRadioButton13.setActionCommand("Interface");
        jRadioButton14.setActionCommand("Classe parent");
        jRadioButton15.setActionCommand("Package");

        // Level 2
        jRadioButton16.setActionCommand("a) aucun des choix");
        jRadioButton17.setActionCommand("b) .JAVA");
        jRadioButton18.setActionCommand("c) .Class");

        jRadioButton19.setActionCommand("a) aucun des choix");
        jRadioButton20.setActionCommand("b) Bonjour Nous sommes en 2018 !");
        jRadioButton21.setActionCommand("c) Nous sommes en 2018 !");

        jRadioButton22.setActionCommand("a) vrai");
        jRadioButton23.setActionCommand("b) faux");

        jRadioButton25.setActionCommand("a) aucun des choix");
        jRadioButton26.setActionCommand("b) final");
        jRadioButton27.setActionCommand("c) const");

        jRadioButton28.setActionCommand("a) aucun des choix");
        jRadioButton29.setActionCommand("b) this");
        jRadioButton30.setActionCommand("c) super");

        // Level 3
        jRadioButton31.setActionCommand("a) aucun des choix");
        jRadioButton32.setActionCommand("b) surchargée");
        jRadioButton33.setActionCommand("c) redéfinie");

        jRadioButton34.setActionCommand("a) vrai");
        jRadioButton35.setActionCommand("b) faux");

        jRadioButton37.setActionCommand("a) vrai");
        jRadioButton38.setActionCommand("b) faux");

        jRadioButton40.setActionCommand("a) vrai");
        jRadioButton41.setActionCommand("b) faux");

        jRadioButton43.setActionCommand("a) aucun des choix");
        jRadioButton44.setActionCommand("b) a=10 b=0 Je suis à l’intérieur de finally");
        jRadioButton45.setActionCommand("c) a=10 b=0 diviser par 0! je suis à l’intérieur de finally");

        // End Of RadioButtons Instantiation config
        // ButtonGroups config
        // Level 1
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);

        buttonGroup2.add(jRadioButton4);
        buttonGroup2.add(jRadioButton5);
        buttonGroup2.add(jRadioButton6);

        buttonGroup3.add(jRadioButton7);
        buttonGroup3.add(jRadioButton8);
        buttonGroup3.add(jRadioButton9);

        buttonGroup4.add(jRadioButton10);
        buttonGroup4.add(jRadioButton11);

        buttonGroup5.add(jRadioButton13);
        buttonGroup5.add(jRadioButton14);
        buttonGroup5.add(jRadioButton15);
        // Level 2

        buttonGroup6.add(jRadioButton16);
        buttonGroup6.add(jRadioButton17);
        buttonGroup6.add(jRadioButton18);

        buttonGroup7.add(jRadioButton19);
        buttonGroup7.add(jRadioButton20);
        buttonGroup7.add(jRadioButton21);

        buttonGroup8.add(jRadioButton22);
        buttonGroup8.add(jRadioButton23);

        buttonGroup9.add(jRadioButton25);
        buttonGroup9.add(jRadioButton26);
        buttonGroup9.add(jRadioButton27);

        buttonGroup10.add(jRadioButton28);
        buttonGroup10.add(jRadioButton29);
        buttonGroup10.add(jRadioButton30);

        // Level 3
        buttonGroup11.add(jRadioButton31);
        buttonGroup11.add(jRadioButton32);
        buttonGroup11.add(jRadioButton33);

        buttonGroup12.add(jRadioButton34);
        buttonGroup12.add(jRadioButton35);

        buttonGroup13.add(jRadioButton37);
        buttonGroup13.add(jRadioButton38);

        buttonGroup14.add(jRadioButton40);
        buttonGroup14.add(jRadioButton41);

        buttonGroup15.add(jRadioButton43);
        buttonGroup15.add(jRadioButton44);
        buttonGroup15.add(jRadioButton45);

        // End ButtonGroups config
        // TextAreas config
        jTextArea1.setEditable(false);
        jTextArea2.setEditable(false);
        jTextArea3.setEditable(false);
        jTextArea4.setEditable(false);
        jTextArea5.setEditable(false);
        jTextArea6.setEditable(false);
        jTextArea7.setEditable(false);
        jTextArea8.setEditable(false);
        jTextArea9.setEditable(false);
        jTextArea10.setEditable(false);
        jTextArea11.setEditable(false);
        jTextArea12.setEditable(false);
        jTextArea13.setEditable(false);
        jTextArea14.setEditable(false);
        jTextArea15.setEditable(false);
        // End Of TextAreas config

        // TabdedPane Config
        // Main
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);
        // Level 1
        jTabbedPane2.setEnabledAt(1, false);
        jTabbedPane2.setEnabledAt(2, false);
        jTabbedPane2.setEnabledAt(3, false);
        jTabbedPane2.setEnabledAt(4, false);
        jTabbedPane2.setEnabledAt(5, false);
        // Level 2
        jTabbedPane3.setEnabledAt(1, false);
        jTabbedPane3.setEnabledAt(2, false);
        jTabbedPane3.setEnabledAt(3, false);
        jTabbedPane3.setEnabledAt(4, false);
        jTabbedPane3.setEnabledAt(5, false);
        // Level 3
        jTabbedPane4.setEnabledAt(1, false);
        jTabbedPane4.setEnabledAt(2, false);
        jTabbedPane4.setEnabledAt(3, false);
        jTabbedPane4.setEnabledAt(4, false);
        jTabbedPane4.setEnabledAt(5, false);

        // End Of TabdedPane Config
        // Display The Current Score config
        jLabel2.setText(display_Score());
        // End Of Display The Current Score config

        // Buttons ActionListeners Configs 
        jButton1.addActionListener(((e) -> {
            if (e.getSource() == jButton1) {
                String response = buttonGroup1.getSelection().getActionCommand();
                if (response.equals("Compilé et interpreté")) {
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane2.setEnabledAt(0, false);
                    jTabbedPane2.setSelectedIndex(1);
                    jTabbedPane2.setEnabledAt(1, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane2.setEnabledAt(0, false);
                    jTabbedPane2.setSelectedIndex(1);
                    jTabbedPane2.setEnabledAt(1, true);
                    jLabel2.setText(display_Score());
                }
            }
        }));

        jButton2.addActionListener(((e) -> {
            if (e.getSource() == jButton2) {
                String response = buttonGroup2.getSelection().getActionCommand();
                if (response.equals("Object")) {
                    jButton2.setEnabled(false);
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane2.setEnabledAt(1, false);
                    jTabbedPane2.setSelectedIndex(2);
                    jTabbedPane2.setEnabledAt(2, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    jButton2.setEnabled(false);
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane2.setEnabledAt(1, false);
                    jTabbedPane2.setSelectedIndex(2);
                    jTabbedPane2.setEnabledAt(2, true);
                    jLabel2.setText(display_Score());
                }
            }
        }));

        jButton3.addActionListener(((e) -> {
            if (e.getSource() == jButton3) {
                String response = buttonGroup3.getSelection().getActionCommand();
                if (response.equals("est en minuscule")) {
                    jButton3.setEnabled(false);
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane2.setEnabledAt(2, false);
                    jTabbedPane2.setSelectedIndex(3);
                    jTabbedPane2.setEnabledAt(3, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    jButton3.setEnabled(false);
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane2.setEnabledAt(2, false);
                    jTabbedPane2.setSelectedIndex(3);
                    jTabbedPane2.setEnabledAt(3, true);
                    jLabel2.setText(display_Score());
                }
            }
        }));

        jButton4.addActionListener(((e) -> {
            if (e.getSource() == jButton4) {
                String response = buttonGroup4.getSelection().getActionCommand();
                if (response.equals("oui")) {
                    jButton4.setEnabled(false);
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane2.setEnabledAt(3, false);
                    jTabbedPane2.setSelectedIndex(4);
                    jTabbedPane2.setEnabledAt(4, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    jButton4.setEnabled(false);
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane2.setEnabledAt(3, false);
                    jTabbedPane2.setSelectedIndex(4);
                    jTabbedPane2.setEnabledAt(4, true);
                    jLabel2.setText(display_Score());
                }
            }
        }));

        jButton5.addActionListener(((e) -> {
            if (e.getSource() == jButton5) {
                String response = buttonGroup5.getSelection().getActionCommand();
                if (response.equals("Interface")) {
                    jButton5.setEnabled(false);
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane2.setEnabledAt(4, false);
                    jTabbedPane2.setSelectedIndex(5);
                    jTabbedPane2.setEnabledAt(5, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    jButton5.setEnabled(false);
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane2.setEnabledAt(4, false);
                    jLabel2.setText(display_Score());
                }
                if (score >= 60) {
                    System.out.println("Your Score Is Greater than 40 Points :) You Can Procced To The Second Level");
                    jTabbedPane1.setEnabledAt(0, false);
                    jTabbedPane1.setSelectedIndex(1);
                    jTabbedPane1.setEnabledAt(1, true);

                } else {
                    JOptionPane.showMessageDialog(null, "Oop's You can't Procced To The Next Level Due Your Score is Less Than 60");
                }
            }
        }));

        // Level 2
        jButton6.addActionListener(((e) -> {
            if (e.getSource() == jButton6) {
                String response = buttonGroup6.getSelection().getActionCommand();
                if (response.equals("c) .Class")) {
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane3.setEnabledAt(0, false);
                    jTabbedPane3.setSelectedIndex(1);
                    jTabbedPane3.setEnabledAt(1, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane3.setEnabledAt(0, false);
                    jTabbedPane3.setSelectedIndex(1);
                    jTabbedPane3.setEnabledAt(1, true);
                    jLabel2.setText(display_Score());
                }
            }
        }));

        jButton7.addActionListener(((e) -> {
            if (e.getSource() == jButton7) {
                String response = buttonGroup7.getSelection().getActionCommand();
                if (response.equals("a) aucun des choix")) {
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane3.setEnabledAt(1, false);
                    jTabbedPane3.setSelectedIndex(2);
                    jTabbedPane3.setEnabledAt(2, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane3.setEnabledAt(1, false);
                    jTabbedPane3.setSelectedIndex(2);
                    jTabbedPane3.setEnabledAt(2, true);
                    jLabel2.setText(display_Score());
                }
            }
        }));

        jButton8.addActionListener(((e) -> {
            if (e.getSource() == jButton8) {
                String response = buttonGroup8.getSelection().getActionCommand();
                if (response.equals("a) vrai")) {
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane3.setEnabledAt(2, false);
                    jTabbedPane3.setSelectedIndex(3);
                    jTabbedPane3.setEnabledAt(3, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane3.setEnabledAt(2, false);
                    jTabbedPane3.setSelectedIndex(3);
                    jTabbedPane3.setEnabledAt(3, true);
                    jLabel2.setText(display_Score());
                }
            }
        }));

        jButton15.addActionListener(((e) -> {
            if (e.getSource() == jButton15) {
                String response = buttonGroup9.getSelection().getActionCommand();
                if (response.equals("b) final")) {
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane3.setEnabledAt(3, false);
                    jTabbedPane3.setSelectedIndex(4);
                    jTabbedPane3.setEnabledAt(4, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane3.setEnabledAt(3, false);
                    jTabbedPane3.setSelectedIndex(4);
                    jTabbedPane3.setEnabledAt(4, true);
                    jLabel2.setText(display_Score());
                }
            }
        }));

        jButton9.addActionListener(((e) -> {
            if (e.getSource() == jButton9) {
                String response = buttonGroup10.getSelection().getActionCommand();
                if (response.equals("b) this")) {
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane3.setEnabledAt(4, false);
                    jTabbedPane3.setSelectedIndex(5);
                    jTabbedPane3.setEnabledAt(5, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    jButton5.setEnabled(false);
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane3.setEnabledAt(4, false);
                    jTabbedPane3.setSelectedIndex(5);
                    jTabbedPane3.setEnabledAt(5, true);
                    jLabel2.setText(display_Score());
                }
                if (score >= 160) {
                    System.out.println("Your Score Is Greater than 40 Points :) You Can Procced To The Second Level");
                    jTabbedPane1.setEnabledAt(1, false);
                    jTabbedPane1.setSelectedIndex(2);
                    jTabbedPane1.setEnabledAt(2, true);
                } else {
                    JOptionPane.showMessageDialog(null, "Oop's You can't Procced To The Next Level Due Your Score is Less Than 180");
                }
            }
        }));

        // Level 3
        jButton10.addActionListener(((e) -> {
            if (e.getSource() == jButton10) {
                String response = buttonGroup11.getSelection().getActionCommand();
                if (response.equals("b) surchargée")) {
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane4.setEnabledAt(0, false);
                    jTabbedPane4.setSelectedIndex(1);
                    jTabbedPane4.setEnabledAt(1, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane4.setEnabledAt(0, false);
                    jTabbedPane4.setSelectedIndex(1);
                    jTabbedPane4.setEnabledAt(1, true);
                    jLabel2.setText(display_Score());
                }
            }
        }));

        jButton11.addActionListener(((e) -> {
            if (e.getSource() == jButton11) {
                String response = buttonGroup12.getSelection().getActionCommand();
                if (response.equals("a) vrai")) {

                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane4.setEnabledAt(1, false);
                    jTabbedPane4.setSelectedIndex(2);
                    jTabbedPane4.setEnabledAt(2, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane4.setEnabledAt(1, false);
                    jTabbedPane4.setSelectedIndex(2);
                    jTabbedPane4.setEnabledAt(2, true);
                    jLabel2.setText(display_Score());
                }
            }
        }));

        jButton12.addActionListener(((e) -> {
            if (e.getSource() == jButton12) {
                String response = buttonGroup13.getSelection().getActionCommand();
                if (response.equals("a) vrai")) {

                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane4.setEnabledAt(2, false);
                    jTabbedPane4.setSelectedIndex(3);
                    jTabbedPane4.setEnabledAt(3, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane4.setEnabledAt(2, false);
                    jTabbedPane4.setSelectedIndex(3);
                    jTabbedPane4.setEnabledAt(3, true);
                    jLabel2.setText(display_Score());
                }
            }
        }));

        jButton13.addActionListener(((e) -> {
            if (e.getSource() == jButton13) {
                String response = buttonGroup14.getSelection().getActionCommand();
                if (response.equals("a) vrai")) {
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane4.setEnabledAt(3, false);
                    jTabbedPane4.setSelectedIndex(4);
                    jTabbedPane4.setEnabledAt(4, true);
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane4.setEnabledAt(3, false);
                    jTabbedPane4.setSelectedIndex(4);
                    jTabbedPane4.setEnabledAt(4, true);
                    jLabel2.setText(display_Score());
                }
            }
        }));

        jButton14.addActionListener(((e) -> {
            if (e.getSource() == jButton14) {
                String response = buttonGroup15.getSelection().getActionCommand();
                if (response.equals("c) a=10 b=0 diviser par 0! je suis à l’intérieur de finally")) {
                    responses.add(response);
                    score += 20;
                    System.out.println("Score = " + score);
                    System.out.println("selected response : " + responses.getLast() + " Correct");
                    System.out.println(responses);
                    jTabbedPane4.setEnabledAt(4, false);
                    jTabbedPane4.setSelectedIndex(5);
                    jTabbedPane4.setEnabledAt(5, true);
                    addCorrectToJTable();
                    addInCorrectToJTable();
                    jLabel2.setText(display_Score());
                } else {
                    incorrects.add(response);
                    score += 0;
                    System.out.println(" " + incorrects.getLast() + " Incorrect ");
                    System.out.println("Score = " + score);
                    System.out.println(incorrects);
                    jTabbedPane4.setEnabledAt(4, false);
                    jTabbedPane4.setSelectedIndex(5);
                    jTabbedPane4.setEnabledAt(5, true);
                    addInCorrectToJTable();
                    addCorrectToJTable();
                    jLabel2.setText(display_Score());
                }
                if (score >= 280) {
                    System.out.println("Your Score Is Greater than 40 Points :) You Can Procced To The Second Level");
                    final String sound = "C:\\Users\\Amimi\\OneDrive\\Documents\\NetBeansProjects\\QUIZ APPLICATION APP\\congratulations.mp3";
                    MP3Player mP3Player = new MP3Player(new File(sound));
                    mP3Player.play();
                    JOptionPane.showMessageDialog(null, "YOU WIN CONGRATULATIONS :) ");

                } else {
                    final String sound_ = "C:\\Users\\Amimi\\OneDrive\\Documents\\NetBeansProjects\\QUIZ APPLICATION APP\\loose.mp3";
                    MP3Player mP3Player = new MP3Player(new File(sound_));
                    mP3Player.play();
                    JOptionPane.showMessageDialog(null, "Oop's You LOOSE :( Sorry");
                }
            }
        }));
        //  End Of Buttons ActionListeners Configs
    }

    // Display Score Function
    private String display_Score() {
        return " Your Score Is : " + score;
    }

    // Adding answers to the Tables
    private void addCorrectToJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[1];
        for (int i = 0; i < responses.size(); i++) {
            rowData[0] = responses.get(i);
            model.addRow(rowData);
        }
    }

    private void addInCorrectToJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        Object rowData[] = new Object[1];
        for (int i = 0; i < incorrects.size(); i++) {
            rowData[0] = incorrects.get(i);
            model.addRow(rowData);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jButton8 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jButton15 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jButton9 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel25 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jButton10 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jButton11 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jButton12 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jButton13 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jButton14 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel46 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel47 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Score");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jInternalFrame1.setVisible(true);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Timer");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(551, 551, 551))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("JAVA est un langage ?");
        jScrollPane1.setViewportView(jTextArea1);

        jRadioButton1.setText("Compilé");

        jRadioButton2.setText("Interprété");

        jRadioButton3.setText("Compilé et interpreté");

        jButton1.setText("Confirm");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("QUESTION 1", jPanel11);

        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Toutes les classes héritent de la classe ?");
        jScrollPane2.setViewportView(jTextArea2);

        jRadioButton4.setText("Main");

        jRadioButton5.setText("Object");

        jRadioButton6.setText("AWT");

        jButton2.setText("Confirm");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("QUESTION 2", jPanel12);

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Par convention une classe ?");
        jScrollPane3.setViewportView(jTextArea3);

        jRadioButton7.setText("est en minuscule");

        jRadioButton8.setText("commence par une majuscule");

        jRadioButton9.setText("est en majuscules");

        jButton3.setText("Confirm");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 489, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("QUESTION 3", jPanel13);

        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Est-ce que on peut avoir plusieurs constructeurs pour la même classe");
        jScrollPane4.setViewportView(jTextArea4);

        jRadioButton10.setText("oui");

        jRadioButton11.setText("non");

        jButton4.setText("Confirm");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton11)
                .addGap(35, 35, 35)
                .addComponent(jButton4)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("QUESTION 4", jPanel14);

        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("Dans la ligne \"public class A implements B\", B est : ");
        jScrollPane5.setViewportView(jTextArea5);

        jRadioButton13.setText("Interface");

        jRadioButton14.setText("Classe parent");

        jRadioButton15.setText("Package");

        jButton5.setText("Confirm");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jRadioButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("QUESTION 5", jPanel15);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("RECAP", jPanel16);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("LEVEL_1", jPanel7);

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("Après la compilation, un programme écrit en JAVA, il se transforme \nen programme en bytecode Quelle est l’extension du programme en\nbytecode ?");
        jScrollPane6.setViewportView(jTextArea6);

        jRadioButton16.setText("a) aucun des choix");

        jRadioButton17.setText("b) .JAVA");

        jRadioButton18.setText("c) .Class");

        jButton6.setText("Confirm");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jRadioButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("QUESTION 1", jPanel18);

        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText("Class Test{\n\tPublic Test () {\n\t\tSystem.out.println(”Bonjour”);\n\t}\n\tpublic Test (int i) {\n\t\tthis();\n\t\tSystem.out.println(”Nous sommes en ”+i+ ” !”);};\n\t}\nqu’affichera l’instruction suivante?\nTest t1=new Test (2018);");
        jScrollPane7.setViewportView(jTextArea7);

        jRadioButton19.setText("a) aucun des choix");

        jRadioButton20.setText("b) Bonjour Nous sommes en 2018 !");

        jRadioButton21.setText("c) Nous sommes en 2018 !");

        jButton7.setText("Confirm");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 461, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("QUESTION 2", jPanel19);

        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("Voici un constructeur de la classe Employee, y-at'il un problème ?\n\tPublic void Employe(String n){\n\t\tNom=n;\n\t}");
        jScrollPane8.setViewportView(jTextArea8);

        jRadioButton22.setText("a) vrai");

        jRadioButton23.setText("b) faux");

        jButton8.setText("Confirm");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton23, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton23)
                .addGap(46, 46, 46)
                .addComponent(jButton8)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("QUESTION 3", jPanel20);

        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setText("Pour spécifier que la variable ne pourra plus être modifiée et doit \nêtre initialisée dès sa déclaration, on la déclare comme une \nconstante avec le mot réservé");
        jScrollPane9.setViewportView(jTextArea9);

        jRadioButton25.setText("a) aucun des choix");

        jRadioButton26.setText("b) final");

        jRadioButton27.setText("c) const");

        jButton15.setText("Confirm");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton25, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jRadioButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton27)
                .addGap(18, 18, 18)
                .addComponent(jButton15)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("QUESTION 4", jPanel21);

        jPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jTextArea10.setText("Dans une classe, on accède à ses variables grâce au mot clé ?");
        jScrollPane10.setViewportView(jTextArea10);

        jRadioButton28.setText("a) aucun des choix");

        jRadioButton29.setText("b) this");

        jRadioButton30.setText("c) super");

        jButton9.setText("Confirm");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton28, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jRadioButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton30)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("QUESTION 5", jPanel22);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("RECAP", jPanel23);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("LEVEL_2", jPanel8);

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jTextArea11.setText("calculerSalaire(int)\ncalculerSalaire(int, double)\nLa méthode calculerSalaire est ?");
        jScrollPane11.setViewportView(jTextArea11);

        jRadioButton31.setText("a) aucun des choix");

        jRadioButton32.setText("b) surchargée");

        jRadioButton33.setText("c) redéfinie");

        jButton10.setText("Confirm");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton31, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jRadioButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton33)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("QUESTION 1", jPanel25);

        jPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jTextArea12.setText("Une classe qui contient au moins une méthode abstraite doit être \ndéclarée abstraite.");
        jScrollPane12.setViewportView(jTextArea12);

        jRadioButton34.setText("a) vrai");

        jRadioButton35.setText("b) faux");

        jButton11.setText("Confirm");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton35, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton35)
                .addGap(46, 46, 46)
                .addComponent(jButton11)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("QUESTION 2", jPanel26);

        jPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jTextArea13.setText("Est-ce qu’une classe peut implémenter plusieurs interfaces ?");
        jScrollPane13.setViewportView(jTextArea13);

        jRadioButton37.setText("a) vrai");

        jRadioButton38.setText("b) faux");

        jButton12.setText("Confirm");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton38, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton38)
                .addGap(46, 46, 46)
                .addComponent(jButton12)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("QUESTION 3", jPanel27);

        jPanel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jTextArea14.setText("La déclaration d'une méthode suivante :\n\tpublic void traitement()throws IOException\nprécise que la méthode propage une exception contrôlée ?");
        jScrollPane14.setViewportView(jTextArea14);

        jRadioButton40.setText("a) vrai");

        jRadioButton41.setText("b) faux");

        jButton13.setText("Confirm");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton41, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton41)
                .addGap(46, 46, 46)
                .addComponent(jButton13)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("QUESTION 4", jPanel28);

        jPanel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea15.setColumns(20);
        jTextArea15.setRows(5);
        jTextArea15.setText("class Test{\n\tpublic static void main (String[] args) {\n\ttry {\n \t\tint a =10;\n \t\tSystem.out.println (\"a = \" + a );\n \t\tint b = 0 / a;\n \t\tSystem.out.println (\"b = \" + b);\n\t} catch(ArithmeticException e){\n \t\tSystem.out.println (\"diviser par 0!\"); \n\t}finally{\n\t\tSystem.out.println (\"je suis à l’intérieur de\nfinally\");\n\t}\n\t}\n\t}");
        jScrollPane15.setViewportView(jTextArea15);

        jRadioButton43.setText("a) aucun des choix");

        jRadioButton44.setText("b) a=10 b=0 Je suis à l’intérieur de finally");

        jRadioButton45.setText("c) a=10 b=0 diviser par 0! je suis à l’intérieur de finally");

        jButton14.setText("Confirm");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 373, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton45)
                .addGap(18, 18, 18)
                .addComponent(jButton14)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("QUESTION 5", jPanel29);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Correct Answers"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane17.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Correct Answers", jPanel46);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Incorrect Answers"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane18.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Incorrect Answers", jPanel47);

        jScrollPane16.setViewportView(jTabbedPane5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("RECAP", jPanel30);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("LEVEL_3", jPanel9);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
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
            java.util.logging.Logger.getLogger(QUIZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QUIZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QUIZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QUIZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QUIZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    // End of variables declaration//GEN-END:variables
}
