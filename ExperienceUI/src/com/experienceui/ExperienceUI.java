/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experienceui;

import com.experienceui.color.ColorUI;
import com.experienceui.componentes.ExComboBox;
import com.experienceui.componentes.ExListBox;
import com.experienceui.componentes.ExScrollPane;
import com.experienceui.componentes.ExTabbedPane;
import com.experienceui.componentes.ExTable;
import com.experienceui.componentes.ExTextField;
import com.experienceui.componentes.ExTextPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Carlos
 */
public class ExperienceUI {

    private static ColorUI colorUI;

    public ExperienceUI(ColorUI colorUI) {
        this.colorUI = colorUI;
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            this.colorUI = colorUI;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExperienceUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ExperienceUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ExperienceUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ExperienceUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createUI() {
        createIndependentUI();
        createDependentUI();
    }

    public void createIndependentUI() {
        ExListBox exListBox = new ExListBox(colorUI);
        ExTabbedPane exTabbedPane = new ExTabbedPane(colorUI);
        ExScrollPane exScrollPane = new ExScrollPane(colorUI);
        
        exListBox.crearDisenio();
        exTabbedPane.crearDisenio();
        exScrollPane.crearDisenio();
    }

    public void createDependentUI() {
        ExTable exTable = new ExTable(colorUI);
        ExTextField exTextField = new ExTextField(colorUI);
        ExTextPane exTextPane = new ExTextPane(colorUI);
        ExComboBox exComboBox = new ExComboBox(colorUI);
        exTable.crearDisenio();
        exTextField.crearDisenio();
        exTextPane.crearDisenio();
        exComboBox.crearDisenio();
    }

}
