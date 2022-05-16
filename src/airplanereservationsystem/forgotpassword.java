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
public class forgotpassword extends JFrame implements ActionListener{
    private JPanel panel;
    private JLabel label , label1 , label2;
    private JTextField email , code ;
    private JButton button , button1 , button2;
    
    public forgotpassword(){
        
       
        setSize(800,300);
        setUndecorated(true);
       
       panel = new JPanel();
       panel.setLayout(null);
       panel.setBackground(Color.white);
       add(panel);
       
       
       label = new JLabel("Dear customer,kindly provide us with your email");
       label.setBounds(100,25, 1000, 50);
       label.setFont(new Font("Times New Roman",Font.PLAIN,30));
       panel.add(label);
       
       label1 = new JLabel("Email");
       label1.setBounds(50,100, 200, 50);
       label1.setFont(new Font("Elephant",Font.ITALIC,20));
       panel.add(label1);
       
       label2 = new JLabel("Verification Code");
       label2.setBounds(50,200, 200, 50);
       label2.setFont(new Font("Elephant",Font.ITALIC,20));
       panel.add(label2);
       
       email = new JTextField("  eg your name@gmail.com");
       email.setBounds(250,100, 300, 30);
       panel.add(email);
       
       code = new JTextField(" Four digit code ");
       code.setBounds(250,200, 300, 30);
       panel.add(code);
           
       button = new JButton("Request code");
       button.setBounds(300, 150, 150, 25);
       panel.add(button);
       
       button1 = new JButton("Verify");
       button1.setBounds(300, 250, 150, 25);
       button1.addActionListener(this);
       panel.add(button1);
       
       button2 = new JButton("Close");
       button2.setBounds(725,0, 75, 25);
       button2.addActionListener(this);
       panel.add(button2);
       
       
       setVisible(true);
       
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            dispose ();
            verificationflash C = new verificationflash();
        }
        if(e.getSource()==button2){
            dispose();
        }
    }
    
    
}
