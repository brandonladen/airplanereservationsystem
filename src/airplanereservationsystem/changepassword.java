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
import javax.swing.JTextField;

/**
 *
 * @author Brandon
 */
public class changepassword extends JFrame implements ActionListener{
    private JTextField pass1 , pass2;
    private JPanel panel;
    private JLabel label , label2 , label1;
    private JButton button , button1;
    
    public changepassword(){
        
        setSize(800,300);
        setLocation(400,100);
        setUndecorated(true);
        
         panel = new JPanel();
       panel.setLayout(null);
       panel.setBackground(Color.white);
       add(panel);
       
       
       label = new JLabel("Enter new Password");
       label.setBounds(200,25, 1000, 50);
       label.setFont(new Font("Times New Roman",Font.PLAIN,30));
       panel.add(label);
       
       label1 = new JLabel("New Password");
       label1.setBounds(50,100, 200, 50);
       label1.setFont(new Font("Elephant",Font.ITALIC,20));
       panel.add(label1);
       
       label2 = new JLabel("Confirm Password");
       label2.setBounds(50,200, 200, 50);
       label2.setFont(new Font("Elephant",Font.ITALIC,20));
       panel.add(label2);
       
       pass1 = new JTextField(" ");
       pass1.setBounds(250,100, 300, 30);
       panel.add(pass1);
       
       pass2 = new JTextField("  ");
       pass2.setBounds(250,200, 300, 30);
       panel.add(pass2);
           
   
       
       button = new JButton("Save");
       button.setBounds(300, 250, 150, 25);
       button.addActionListener(this);
       panel.add(button);
       
       button1 = new JButton("Close");
       button1.setBounds(725,0,75, 25);
       button1.addActionListener(this);
       panel.add(button1);
       
       setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            dispose();
            Login L = new Login();
        }
        if(e.getSource()==button1){
            dispose();
        }
    }
    
}
