/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplanereservationsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Brandon
 */
public class Login extends JFrame implements ActionListener{
    
    private JLabel label , label1 , label2 , label3;
    private JPanel panel;
    private JTextField userText;
    private JPasswordField pass;
    private JButton button , button1  , button2 , button3;
    private ImageIcon image;
    
    public Login(){
       
        setSize(600,500);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(700,80);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        add(panel);
        
        label = new JLabel("User Name");
        label.setBounds(50,100, 200, 50);
        label.setFont(new Font("Elephant",Font.ITALIC,20));
        panel.add(label);
        
        label1 = new JLabel("Password");
        label1.setBounds(50,200, 200, 50);
        label1.setFont(new Font("Elephant",Font.ITALIC,20));
        panel.add(label1);
        
        userText = new JTextField("");
        userText.setBounds(200,100, 300, 30);
        panel.add(userText);
        
        
        pass = new JPasswordField ();
        pass.setBounds(200,200, 300, 30);
        panel.add(pass);
        
        button1 = new JButton ("Forgot Password ?");
        button1.setBounds(250, 250, 150, 25);
        button1.setContentAreaFilled(false);
        button1.setBorderPainted(false);
        button1.addActionListener(this);
        panel.add(button1);
        
        
        button = new JButton("Log in");
        button.setBounds(200, 370, 150, 25);
        button.addActionListener(this);
        panel.add(button);
        
        button2 = new JButton("Register");
        button2.setBounds(370,79,150,25);
        button2.setContentAreaFilled(false);
        button2.setBorderPainted(false);
        button2.addActionListener(this);
        panel.add(button2);
        
        label2 = new JLabel("Need an account?");
        label2.setBounds(300,65,200,50);
        label2.setFont(new Font("Times New Roman",Font.BOLD,15));
        panel.add(label2);
        
        
        button3 = new JButton("Close");
        button3.setBounds(525,0,75,25);
        button3.addActionListener(this);
        panel.add(button3);
        
        
        image = new ImageIcon(getClass().getResource("/image/Login 1.png"));
     Image dabImage = image.getImage();
     Image modifiedDabImage = dabImage.getScaledInstance(200, 150,java.awt.Image.SCALE_SMOOTH);
     image = new ImageIcon(modifiedDabImage);
     
     label3 = new JLabel(image);
     label3.setBounds(0, 0, 200, 650);
     panel.add(label3);
        
       setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button1){
           dispose();
          forgotpassword F = new forgotpassword(); 
       }
       if(e.getSource()==button2){
           dispose();
           Register R = new Register();
       }
       if(e.getSource()==button){
          // airlines A = new airlines();
           JOptionPane.showMessageDialog(null,"This button is still under modifications \n Try welcome as guest");
           this.dispose();
           
       }
       if(e.getSource()==button3){
           dispose();
       }
    }
}
