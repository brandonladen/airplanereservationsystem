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
public class verificationflash extends JFrame implements ActionListener {
    
    private JPanel panel;
    private JLabel label;
    private JButton button;
    
    public verificationflash(){
    
    setSize(500,130);
    setLocation(400,300);
    setUndecorated(true);
    
 
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    panel.setBackground(Color.WHITE);
    
    label = new JLabel("Verified Successfully. Click Ok to change password");
    label.setBounds(30, 25, 1050, 50);
    label.setForeground(Color.BLACK);
    label.setFont(new Font("Serif",Font.ITALIC,20));
    panel.add(label);
    
    button = new JButton("Ok");
    button.setBounds(175,75, 100, 30);
    button.addActionListener(this);
    panel.add(button);
    
    setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            dispose();
           changepassword C = new changepassword();
    }
    
}
}
