/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author hp
 */
public class Create_Account extends JFrame implements ActionListener{
    private JLabel label , label1, label2;
    private JPanel panel;
    private JTextField userText;
    private JPasswordField pass, pass1;
    private JButton button , button3;
    
    public Create_Account(){
        setSize(600,500);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(700,80);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        add(panel);
        
        label = new JLabel("User Name:");
        label.setBounds(50,100, 200, 50);
        label.setFont(new Font("Elephant",Font.ITALIC,20));
        panel.add(label);
        
        label1 = new JLabel("Password:");
        label1.setBounds(50,200, 200, 50);
        label1.setFont(new Font("Elephant",Font.ITALIC,20));
        panel.add(label1);
        
        
        label2 = new JLabel("Confirm Password:");
        label2.setBounds(50,300, 200, 50);
        label2.setFont(new Font("Elephant",Font.ITALIC,20));
        panel.add(label2);
        
        userText = new JTextField("");
        userText.setBounds(250,100, 300, 30);
        panel.add(userText);
        
        
        pass = new JPasswordField ();
        pass.setBounds(250,200, 300, 30);
        panel.add(pass);
        
        pass1 = new JPasswordField();
        pass1.setBounds(250,300, 300, 30);
        panel.add(pass1);        
        
        button = new JButton("Save");
        button.setBounds(200, 400, 150, 25);
        button.addActionListener(this);
        panel.add(button);
        
        
        button3 = new JButton("Exit");
        button3.setBounds(525,0,75,25);
        button3.addActionListener(this);
        panel.add(button3);
        
       
       
        
         setVisible(true); 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button3){
            dispose();
        }else if(e.getSource() == button){
            new Login();
            dispose();
        }
    }
}
