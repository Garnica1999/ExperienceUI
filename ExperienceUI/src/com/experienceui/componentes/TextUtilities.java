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
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicTextPaneUI;
import javax.swing.text.JTextComponent;

/**
 *
 * @author sala7
 */
public class TextUtilities extends BasicTextPaneUI{
    protected static ColorUI colorUI;

    public TextUtilities() {
    }

    public TextUtilities(ColorUI colorUI) {
        this.colorUI = colorUI;
    }
    
    
    public static TextUtilities createUI(JComponent c) {
        return new TextUtilities();
    }
    
    public static void addPlaceHolder(JTextComponent componente, String textoActual, String nuevoTexto) {
        if (componente.getText().equals(textoActual)) {
            componente.setText(nuevoTexto);
        }
    }

    public static void addFocusBorder(JTextComponent textField) {
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                ExUtilities.addFocusOnSelectedComponent(textField, ColorUI.colorFocus);
            }

            @Override
            public void focusLost(FocusEvent e) {
                ExUtilities.addFocusOnSelectedComponent(textField, ColorUI.colorNoFocus);
            }
        });
    }
    
    protected static void addFocusOnSelectedComponent(JTextComponent componente, Color newColor) {
        componente.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, newColor));
    }

    public ColorUI getColorUI() {
        return colorUI;
    }

    public void setColorUI(ColorUI colorUI) {
        this.colorUI = colorUI;
    }
}
