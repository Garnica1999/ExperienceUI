/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experienceui.componentes;

import com.experienceui.color.ColorUI;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author sala7
 */
public class ExComboBox extends BasicComboBoxUI{
    private static ColorUI colorUI;
    private Border borderButton;
    private Color buttonBackground;
    private Color buttonhighlight;
    private Color buttonShadow;
    private Color selectionForeground;
    private Color selectionBackground;
    private Color control;
    
    public ExComboBox(ColorUI colorUI){
        ExComboBox.colorUI = colorUI;
        borderButton = BorderFactory.createMatteBorder(0, 0, 2, 0, colorUI.getColorBorde());
    }

    public ExComboBox(ColorUI colorUI, Border borderButton, Color buttonBackground, Color buttonhighlight, Color buttonShadow, Color selectionForeground, Color selectionBackground, Color control) {
        ExComboBox.colorUI = colorUI;
        this.borderButton = borderButton;
        this.buttonBackground = buttonBackground;
        this.buttonhighlight = buttonhighlight;
        this.buttonShadow = buttonShadow;
        this.selectionForeground = selectionForeground;
        this.selectionBackground = selectionBackground;
        this.control = control;
    }

    public ExComboBox(Color buttonBackground, Color buttonhighlight, Color buttonShadow, Color selectionForeground, Color selectionBackground, Color control) {
        this.buttonBackground = buttonBackground;
        this.buttonhighlight = buttonhighlight;
        this.buttonShadow = buttonShadow;
        this.selectionForeground = selectionForeground;
        this.selectionBackground = selectionBackground;
        this.control = control;
        borderButton = BorderFactory.createMatteBorder(0, 0, 2, 0, colorUI.getColorBorde());
    }
    
    public Border getBorderButton() {
        return borderButton;
    }

    public void setBorderButton(Border borderButton) {
        this.borderButton = borderButton;
    }

    public Color getButtonBackground() {
        return buttonBackground;
    }

    public void setButtonBackground(Color buttonBackground) {
        this.buttonBackground = buttonBackground;
    }

    public Color getButtonhighlight() {
        return buttonhighlight;
    }

    public void setButtonhighlight(Color buttonhighlight) {
        this.buttonhighlight = buttonhighlight;
    }

    public Color getButtonShadow() {
        return buttonShadow;
    }

    public void setButtonShadow(Color buttonShadow) {
        this.buttonShadow = buttonShadow;
    }

    public Color getSelectionForeground() {
        return selectionForeground;
    }

    public void setSelectionForeground(Color selectionForeground) {
        this.selectionForeground = selectionForeground;
    }

    public Color getSelectionBackground() {
        return selectionBackground;
    }

    public void setSelectionBackground(Color selectionBackground) {
        this.selectionBackground = selectionBackground;
    }
    
    public Color getControl() {
        return control;
    }

    public void setControl(Color control) {
        this.control = control;
    }

    public static ComboBoxUI createUI(JComponent c) {
        return new ExComboBox(colorUI);
    }
    
    @Override 
    protected JButton createArrowButton() {
        BasicArrowButton a = new BasicArrowButton(
            BasicArrowButton.SOUTH,
            Color.white, Color.white,
            new Color(204,204,204), Color.white);
        
        a.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        return a;
    }

    public void modificarUI(JComboBox cb){
        cb.setUI(this);
    }
    
     public static void addFocusBorder(JComboBox comboBox){
        comboBox.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                ExUtilities.addFocusOnSelectedComponent(comboBox, ColorUI.colorFocus);
            }

            @Override
            public void focusLost(FocusEvent e) {
                ExUtilities.addFocusOnSelectedComponent(comboBox, ColorUI.colorNoFocus);
            }
        });
        
    }
     
    protected static void addFocusOnSelectedComponent(JComboBox componente, Color newColor) {
        componente.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, newColor));
    }

    public void crearDisenio(){
        UIManager.put("Combobox.rendererUseListColors", true);
        UIManager.put("ComboBox.background", colorUI.getColorFondo());
        UIManager.put("ComboBox.border", this.borderButton);
        UIManager.put("ComboBox.foreground", this.colorUI.getColorForeground());
        UIManager.put("ComboBox.buttonBackground", buttonBackground);
        //UIManager.put("ComboBox.buttonDarkShadow", new Color(255,255,255));
        UIManager.put("ComboBox.buttonHighlight", buttonhighlight);
        UIManager.put("ComboBox.buttonShadow", buttonShadow);
        UIManager.put("ComboBox.control", control);
        UIManager.put("ComboBox.selectionBackground", this.colorUI.getColorPrincipal());
        UIManager.put("ComboBox.selectionForeground", selectionForeground);
        //UIManager.put("Focus.color", new Color(255,255,255));
        //UIManager.put("Button.border", BorderFactory.createLineBorder(Color.WHITE));
        //UIManager.put("List.border", BorderFactory.createLineBorder(new Color(204,204,204),1));*/
    }
    
}

    
