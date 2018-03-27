/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experienceui.color;

import java.awt.Color;
import java.util.Objects;

/**
 * Clase que define los colores de un componente dentro de la aplicacion.
 * @author Carlos
 */
public class ColorUI {
    private Color colorPrincipal;
    private Color colorSecundario;
    private Color colorTerciario;
    private Color colorBorde;
    private Color colorFondo;
    private Color colorForeground;
    private Color colorBordeSecundario;
    
    public static final Color colorFocus = new Color(0,107,196);
    public static final Color colorNoFocus = new Color(153,153,153);

    public ColorUI(Color colorPrincipal, Color colorSecundario, 
            Color colorTerciario, Color colorBorde, Color colorFondo, 
            Color colorForeground, Color colorBordeSecundario) {
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        this.colorTerciario = colorTerciario;
        this.colorBorde = colorBorde;
        this.colorFondo = colorFondo;
        this.colorForeground = colorForeground;
        this.colorBordeSecundario = colorBordeSecundario;
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public void setColorPrincipal(Color colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Color getColorTerciario() {
        return colorTerciario;
    }

    public void setColorTerciario(Color colorTerciario) {
        this.colorTerciario = colorTerciario;
    }

    public Color getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(Color colorBorde) {
        this.colorBorde = colorBorde;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public Color getColorForeground() {
        return colorForeground;
    }

    public void setColorForeground(Color colorForeground) {
        this.colorForeground = colorForeground;
    }

    public Color getColorBordeSecundario() {
        return colorBordeSecundario;
    }

    public void setColorBordeSecundario(Color colorBordeSecundario) {
        this.colorBordeSecundario = colorBordeSecundario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.colorPrincipal);
        hash = 29 * hash + Objects.hashCode(this.colorSecundario);
        hash = 29 * hash + Objects.hashCode(this.colorTerciario);
        hash = 29 * hash + Objects.hashCode(this.colorBorde);
        hash = 29 * hash + Objects.hashCode(this.colorFondo);
        hash = 29 * hash + Objects.hashCode(this.colorForeground);
        hash = 29 * hash + Objects.hashCode(this.colorBordeSecundario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ColorUI other = (ColorUI) obj;
        if (!Objects.equals(this.colorPrincipal, other.colorPrincipal)) {
            return false;
        }
        if (!Objects.equals(this.colorSecundario, other.colorSecundario)) {
            return false;
        }
        if (!Objects.equals(this.colorTerciario, other.colorTerciario)) {
            return false;
        }
        if (!Objects.equals(this.colorBorde, other.colorBorde)) {
            return false;
        }
        if (!Objects.equals(this.colorFondo, other.colorFondo)) {
            return false;
        }
        if (!Objects.equals(this.colorForeground, other.colorForeground)) {
            return false;
        }
        if (!Objects.equals(this.colorBordeSecundario, other.colorBordeSecundario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ColorUI{" + "colorPrincipal=" + colorPrincipal + ", colorSecundario=" + colorSecundario + ", colorTerciario=" + colorTerciario + ", colorBorde=" + colorBorde + ", colorFondo=" + colorFondo + ", colorForeground=" + colorForeground + ", colorBordeSecundario=" + colorBordeSecundario + '}';
    }
    
    
    
    
}
