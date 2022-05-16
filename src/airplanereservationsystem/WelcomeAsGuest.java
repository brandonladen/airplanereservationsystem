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
public class WelcomeAsGuest extends JFrame implements ActionListener{
    private JLabel label;
    private JPanel panel;
    private JButton button , button1;
    
    
    public WelcomeAsGuest(){
    setTitle("Flash Message");
    setSize(1100,130);
    //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocation(200,300);
    setUndecorated(true);
   
    
    
    
    panel = new JPanel();
    panel.setLayout(null);
    add(panel);
    panel.setBackground(Color.WHITE);
    
    label = new JLabel("We recommend you to register if you dont have any account to get upto 35% discount. "
            + " Please click OK to continue as Guest 😊");
    label.setBounds(30,25, 1050, 50);
    label.setForeground(Color.BLACK);
    label.setFont(new Font("Serif",Font.ITALIC,20));
    panel.add(label);
    
    button = new JButton("Ok");
    button.setBounds(250,100, 100, 30);
    button.addActionListener(this);
    panel.add(button);
    
    button1 = new JButton("Register");
    button1.setBounds(750,100, 100, 30);
    button1.addActionListener(this);
    panel.add(button1);
    
     setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            dispose();
           Guest G = new Guest();
           }
        else if(e.getSource()==button1){
            dispose();
            Register R = new Register();
        }
   }
}
