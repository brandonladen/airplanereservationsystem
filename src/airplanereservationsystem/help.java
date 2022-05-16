/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplanereservationsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Brandon
 */
public class help extends JFrame implements ActionListener {
    
    private JLabel label;
    private JPanel panel;
    private JButton button;
    
    
    public help(){

    setSize(400,100);
    setUndecorated(true);
    setLocation(450,400);
   
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    panel.setBackground(Color.WHITE);
    
    label = new JLabel("     Contact me through 0702499923");
    label.setBounds(30,15, 1000, 50);
    label.setForeground(Color.BLACK);
    label.setFont(new Font("Serif",Font.BOLD,20));
    panel.add(label);
    
    button = new JButton("Exit");
    button.setBounds(150,60, 100, 30);
    button.addActionListener(this);
    panel.add(button);
    
    setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            dispose();
        }
    }
}

   
