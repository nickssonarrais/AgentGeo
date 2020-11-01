/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ultilitarios;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Nicksson
 */
public class FormatoTabla extends DefaultTableCellRenderer{

    private final int col;

    public FormatoTabla(int col)
    {
        this.col = col;
    }

    @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column )
    {        
      //  setBackground(Color.white);//color de fondo
       // table.setForeground(Color.black);//color de texto
      
        if( table.getValueAt(row,col).equals("A Pagar")){
            setBackground(Color.YELLOW);
        }else if(table.getValueAt(row,col).equals("A Receber")){
            setBackground(Color.LIGHT_GRAY);
        }else if(table.getValueAt(row,col).equals("Recebidas")){
            setBackground(Color.BLUE);
        }else if(table.getValueAt(row,col).equals("Pagas")){
            setBackground(Color.white);
        }

        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
 }
    
}