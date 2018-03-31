/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experienceui.componentes;

import com.experienceui.color.ColorUI;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.plaf.TabbedPaneUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

/**
 *
 * @author Carlos
 */
public class ExTabbedPane extends BasicTabbedPaneUI implements IComponents{
    private static ColorUI colorUI;
    private Font fuente;

    public ExTabbedPane(Font fuente) {
        this.fuente = fuente;
    }
    
    public ExTabbedPane(ColorUI colorUI){
        this.colorUI = colorUI;
    }
    
    public static ColorUI getColorUI() {
        return colorUI;
    }

    public static void setColorUI(ColorUI aColorUI) {
        colorUI = aColorUI;
    }
    
    
    public static TabbedPaneUI createUI(JComponent c){
        return new ExTabbedPane(colorUI);
    }
    
    @Override
    public void crearDisenio(){
        UIManager.put("TabbedPane.focus", this.colorUI.getColorTerciario());
        UIManager.put("TabbedPane.selected", this.colorUI.getColorTerciario());
        UIManager.put("TabbedPane.contentBorderInsets", new Insets(0,0,0,0));
        UIManager.put("TabbedPane.contentAreaColor", this.colorUI.getColorTerciario());
        UIManager.put("TabbedPane.tabsOverlapBorder", false);
        UIManager.put("TabbedPane.tabAreaInsets", new Insets(0,0,0,0));
        UIManager.put("TabbedPane.highlight", this.colorUI.getColorTerciario());
        UIManager.put("TabbedPane.light", this.colorUI.getColorTerciario());
        UIManager.put("TabbedPane.tabAreaBackground", this.colorUI.getColorTerciario());
        UIManager.put("TabbedPane.tabsOverlapBorder", false);
        UIManager.put("TabbedPane.darkShadow", this.colorUI.getColorTerciario());    
        UIManager.put("TabbedPane.selectHighlight", this.colorUI.getColorTerciario());
        UIManager.put("TabbedPane.selectionFollowsFocus", false);
        UIManager.put("TabbedPane.selectedTabPadInsets", new Insets(0,0,0,0));
        UIManager.put("TabbedPane.shadow", this.colorUI.getColorTerciario());
        UIManager.put("TabbedPane.font", this.fuente);
        UIManager.put("TabbedPane.background", this.colorUI.getColorTerciario());
        UIManager.put("TabbedPane.foreground", this.colorUI.getColorForeground());
        //UIManager.put("TabbedPane.tabsOverlapBorder", false);
        //UIManager.put("TabbedPane.tabsOpaque", true);
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }
    
    @Override
    public void modificarUI(JComponent c){
        if(c instanceof JTabbedPane){
            JTabbedPane tp = (JTabbedPane)c;
            tp.setUI(this);
        }
        
    }
    
    public void modificarUI(JTabbedPane... tps) throws IllegalArgumentException{
        if(tps.length == 0){
            throw new IllegalArgumentException("Debe haber por lo menos un argumento de entrada en la función");
        }
        
        for(int i = 0 ; i < tps.length; i++){
            tps[i].setUI(this);
        }
    }
    
    
}
