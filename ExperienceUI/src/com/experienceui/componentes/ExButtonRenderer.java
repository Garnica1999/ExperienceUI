/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experienceui.componentes;

import com.experienceui.color.ColorUI;
import com.sun.glass.ui.Cursor;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Carlos
 */
@SuppressWarnings("serial")
public class ExButtonRenderer extends JButton implements TableCellRenderer {
    private ColorUI colorUI;
    private Border borde;
    
    public ExButtonRenderer(ColorUI colorUI) {
        setOpaque(true);
        this.colorUI = colorUI;
        borde = BorderFactory.createMatteBorder(0, 0, 2, 0, this.colorUI.getColorBorde());
    }

    public ExButtonRenderer(ColorUI colorUI, Border borde) {
        this.colorUI = colorUI;
        this.borde = borde;
    }
    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        if (isSelected) {
            setForeground(table.getSelectionForeground());
            setBackground(table.getSelectionBackground());
        } else {
            /*setForeground(table.getForeground());
            setBackground(UIManager.getColor("Button.background"));*/
            setBackground(this.colorUI.getColorFondo());
            setForeground(this.colorUI.getColorForeground());
            setBorder(borde);
        }
        setText((value == null) ? "" : value.toString());
        setCursor(new java.awt.Cursor(Cursor.CURSOR_POINTING_HAND));
        return this;
    }
}
