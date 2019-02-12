/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uipackage;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javafx.util.Pair;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author imperio2494
 */


public class Myrenderer extends DefaultTableCellRenderer {
    private ArrayList <Pair<Integer,Integer>> cellXY=new ArrayList<Pair<Integer,Integer>>();
    public void addpair(int x,int y)
    {
    cellXY.add(new Pair(x,y));
    }
     
    public void clearpair(){
    cellXY.removeAll(cellXY);
    }
    public Component getTableCellRendererComponent( JTable table, Object value, boolean isSelected,
    boolean hasFocus, int row, int col)
        {
            Component comp = super.getTableCellRendererComponent(table,  value, isSelected, hasFocus, row, col);

            if (cellXY.contains(new Pair<Integer,Integer>(row,col))){
                  comp.setForeground(Color.WHITE);}
            else{
                comp.setForeground(Color.BLACK);}
            return( comp );
        }
    }