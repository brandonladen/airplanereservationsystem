/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplanereservationsystem;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author Brandon
 */
public class Flightschedule  {
    
    private JFrame frame;
    private JTable table;
    
    public Flightschedule(){
        
        frame = new JFrame();
        frame.setSize(600,400);
        frame.setTitle("Flight Schedule");
       
 
        String column [] = {"DAY","PLANE","DEPATURE TIME"};
        String data [][] = {
            {"MONDAY","FLY 540","08:00 AM"}, // row number 1
            {"","BOEING 737-700s","11:00 PM"},
            {"","BOEING 737-800s","03:00 PM"},
            
            {"TUESDAY","BOEING 737-800s","10:00 AM"},
            {"","FLY 540","12:00 PM"},
            {"","BOEING 737-700s","05:00 PM"},
            
            {"WEDNESDAY","BOEING 737-700s","10:00 AM"},
            {"","BOEING 737-800s","12:00 PM"},
            {"","FLY 540","05:00 PM"},
            
            {"THURSDAY","FLY 540","10:00 AM"},
            {"","BOEING 737-700s","12:00 PM"},
            {"","BOEING 737-800s","05:00 PM"},
            
            {"FRIDAY","BOEING 737-800s","10:00 AM"},
            {"","FLY 540","12:00 PM"},
            {"","BOEING 737-700s","05:00 PM"}
                
        };
        table = new JTable(data , column);
        frame.add(table.getTableHeader(),BorderLayout.BEFORE_FIRST_LINE);
        frame.add(table);
        
        
   
        frame.setVisible(true);
    }
    

}

