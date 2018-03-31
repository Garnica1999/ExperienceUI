/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experienceui;

import com.experienceui.color.ColorUI;
import com.experienceui.componentes.ExButton;
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

    public static ColorUI getColorUI() {
        return colorUI;
    }

    public static void setColorUI(ColorUI aColorUI) {
        colorUI = aColorUI;
    }
    private ExListBox exListBox;
    private ExTabbedPane exTabbedPane;
    private ExScrollPane exScrollPane;
    private ExTable exTable;
    private ExTextField exTextField;
    private ExTextPane exTextPane;
    private ExComboBox exComboBox;
    private ExButton exButton;

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
        exListBox = new ExListBox(colorUI);
        exTabbedPane = new ExTabbedPane(colorUI);
        exScrollPane = new ExScrollPane(colorUI);
        exButton = new ExButton(colorUI);
        
        exListBox.crearDisenio();
        exTabbedPane.crearDisenio();
        exScrollPane.crearDisenio();
    }

    public void createDependentUI() {
        exTable = new ExTable(colorUI);
        exTextField = new ExTextField(colorUI);
        exTextPane = new ExTextPane(colorUI);
        exComboBox = new ExComboBox(colorUI);
        exTable.crearDisenio();
        exTextField.crearDisenio();
        exTextPane.crearDisenio();
        exComboBox.crearDisenio();
    }

    public ExListBox getExListBox() {
        return exListBox;
    }

    public void setExListBox(ExListBox exListBox) {
        this.exListBox = exListBox;
    }

    public ExTabbedPane getExTabbedPane() {
        return exTabbedPane;
    }

    public void setExTabbedPane(ExTabbedPane exTabbedPane) {
        this.exTabbedPane = exTabbedPane;
    }

    public ExScrollPane getExScrollPane() {
        return exScrollPane;
    }

    public void setExScrollPane(ExScrollPane exScrollPane) {
        this.exScrollPane = exScrollPane;
    }

    public ExTable getExTable() {
        return exTable;
    }

    public void setExTable(ExTable exTable) {
        this.exTable = exTable;
    }

    public ExTextField getExTextField() {
        return exTextField;
    }

    public void setExTextField(ExTextField exTextField) {
        this.exTextField = exTextField;
    }

    public ExTextPane getExTextPane() {
        return exTextPane;
    }

    public void setExTextPane(ExTextPane exTextPane) {
        this.exTextPane = exTextPane;
    }

    public ExComboBox getExComboBox() {
        return exComboBox;
    }

    public void setExComboBox(ExComboBox exComboBox) {
        this.exComboBox = exComboBox;
    }

    public ExButton getExButton() {
        return exButton;
    }

    public void setExButton(ExButton exButton) {
        this.exButton = exButton;
    }

    
}
