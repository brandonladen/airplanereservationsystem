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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Brandon
 */
public class Guest extends JFrame implements ActionListener{
    
     private JPanel panel ;
      private JLabel label , label1 , label2 , label3 , label4 , label5;
      private JTextField text1, text2,text3,text4;
      private JPasswordField text5;
      private JButton button , button3;
      
    public Guest(){
        
        setSize(750,700);
        setUndecorated(true);
        
        
        panel = new JPanel ();
        panel.setBackground(Color.white);
        panel.setLayout(null);
        add(panel);
        
        label = new JLabel ("Give in your correct details");
        label.setBounds(150, 0, 1000, 50);
        label.setFont(new Font("Times New Roman",Font.BOLD,30));
        panel.add(label);
        
        label1 = new JLabel("Passport Number");
        label1.setBounds(50, 100, 1000, 30);
        label1.setFont(new Font("Elephant",Font.BOLD,20));
        panel.add(label1);
        
        
        label2 = new JLabel("Surname");
        label2.setBounds(50,200,1000,30);
        label2.setFont(new Font("Elephant",Font.BOLD,20));
        panel.add(label2);
        
        label3 = new JLabel("Other Names");
        label3.setBounds(50,300,1000,20);
        label3.setFont(new Font("Elephant",Font.BOLD,20));
        panel.add(label3);
        
        label4 = new JLabel("Email");
        label4.setBounds(50,400,1000,30);
        label4.setFont(new Font("Elephant",Font.BOLD,20));
        panel.add(label4);
        
        label5 = new JLabel("Password");
        label5.setBounds(50,500,1000,30);
        label5.setFont(new Font("Elephant", Font.BOLD,20));
        panel.add(label5);
        
        
        text1 = new JTextField();
        text1.setBounds(250,100,300,30);
        panel.add(text1);
        
        
         text2 = new JTextField();
        text2.setBounds(250,200,300,30);
        panel.add(text2);
        
        
        text3 = new JTextField();
        text3.setBounds(250,300,300,30);
        panel.add(text3);
        
        
        text4 = new JTextField();
        text4.setBounds(250,400,300,30);
        panel.add(text4);
        
        
         text5 = new JPasswordField();
        text5.setBounds(250,500,300,30);
        panel.add(text5);
        
        
        button = new JButton("Book Flight");
        button.setBounds(300,600,100,30);
        button.addActionListener(this);
        panel.add(button);
        
         button3 = new JButton("Close");
        button3.setBounds(675,0,75,25);
        button3.addActionListener(this);
        panel.add(button3);
        
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            dispose();
            G_airlines G = new G_airlines();
        }
        if(e.getSource()==button3){
            dispose();
        }
    }
}

    
    
