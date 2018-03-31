/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experienceui.componentes;

import com.experienceui.color.ColorUI;
import java.awt.Insets;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.plaf.ScrollPaneUI;
import javax.swing.plaf.basic.BasicScrollPaneUI;

/**
 *
 * @author Carlos
 */
public class ExScrollPane extends BasicScrollPaneUI implements IComponents{
    private static ColorUI colorUI;

    public ExScrollPane(ColorUI colorUI){
        this.colorUI = colorUI;
    }

    public static ColorUI getColorUI() {
        return colorUI;
    }

    public static void setColorUI(ColorUI aColorUI) {
        colorUI = aColorUI;
    }

    public static ScrollPaneUI createUI(JComponent c){
        return new ExScrollPane(colorUI);
    }
    
    @Override
    public void crearDisenio(){
        UIManager.put("ScrollPane.border", null);
        UIManager.put("ScrollPane.viewportBorder", null);
        UIManager.put("ScrollPane.viewportBorderInsets", new Insets(0,0,0,0));
    }

    @Override
    public void modificarUI(JComponent c) {
        if(c instanceof JScrollPane){
            JScrollPane js = (JScrollPane)c;
            js.setUI(this);
        }
    }
}
