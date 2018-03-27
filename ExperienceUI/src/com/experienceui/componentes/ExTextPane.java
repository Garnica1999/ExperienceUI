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
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTextPaneUI;

/**
 *
 * @author Carlos
 */
public class ExTextPane extends BasicTextPaneUI{
    private static ColorUI colorUI;
    private Border border;
    private Font fuente;
    
    public ExTextPane(ColorUI colorUI) {
        this.colorUI = colorUI;
        border = BorderFactory.createLineBorder(this.colorUI.getColorBorde());
        fuente = new Font("Segoe UI", Font.BOLD,14);
    }

    public ExTextPane(ColorUI colorUI, Border border, Font fuente) {
        this.colorUI = colorUI;
        this.border = border;
        this.fuente = fuente;
    }

    public static ComponentUI createUI(JComponent c){
        return new ExTextPane(colorUI);
    }
    
    public void crearDisenio(){
        UIManager.put("TextPane.border", border);
        UIManager.put("TextPane.background", this.colorUI.getColorFondo());
        UIManager.put("TextPane.foreground", this.colorUI.getColorForeground());
        UIManager.put("TextPane.font", fuente);
    }
    
    public static ColorUI getColorUI() {
        return colorUI;
    }

    public static void setColorUI(ColorUI aColorUI) {
        colorUI = aColorUI;
    }
    
    public void modificarUI(JTextPane tp){
        tp.setUI(this);
    }

    public Border getBorder() {
        return border;
    }

    public void setBorder(Border border) {
        this.border = border;
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }
    
    
}
