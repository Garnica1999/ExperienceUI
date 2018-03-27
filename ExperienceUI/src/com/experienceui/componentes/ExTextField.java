/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experienceui.componentes;

import com.experienceui.color.ColorUI;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author sala7
 */
public class ExTextField extends TextUtilities{
    private Font fuente;
    private Border border;

    public ExTextField(Font fuente, Border border, ColorUI colorUI) {
        super(colorUI);
        this.fuente = fuente;
        this.border = border;
    }

    public ExTextField(ColorUI colorUI) {
        super(colorUI);
        this.fuente = new Font("Segoe UI", Font.BOLD, 14);
        this.border = BorderFactory.createMatteBorder(0, 0, 2, 0, colorUI.getColorBorde());
    }

    public ExTextField(Font fuente, ColorUI colorUI) {
        super(colorUI);
        this.fuente = fuente;
        this.border = BorderFactory.createMatteBorder(0, 0, 2, 0, colorUI.getColorBorde());
    }

    public ExTextField(Border border, ColorUI colorUI) {
        super(colorUI);
        this.border = border;
        this.fuente = new Font("Segoe UI", 14, Font.BOLD);
    }

    public static TextUtilities createUI(JComponent c) {
        return new TextUtilities(colorUI);
    }
    
    
    public void crearDisenio(){
        UIManager.put("TextField.border", this.border);
        UIManager.put("TextField.background", colorUI.getColorFondo());
        UIManager.put("TextField.font", this.fuente);
        UIManager.put("TextField.foreground", colorUI.getColorForeground());
    }
    
    public void modificarUI(JTextField tf){
        tf.setUI(this);
        
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    public Border getBorder() {
        return border;
    }

    public void setBorder(Border border) {
        this.border = border;
    }
    
    
    
}
