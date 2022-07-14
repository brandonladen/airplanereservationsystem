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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Brandon
 */
public class G_Payment extends JFrame implements ActionListener {
     private JPanel panel;
     private JLabel label , label1 , label2 , label3 ,label4 , label5 , label6 , label7;
      JTextField text , text1 , text2;
     private JComboBox box , box1;
     private ImageIcon image;
     private JButton button , button1;
     
   
    
    public G_Payment(){
      
      
        
        setSize(650,450);
        setLocation(400,100);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);
        add(panel);
        
        
        label = new JLabel("Complete Your Payment");
        label.setBounds(150,0,1000,75);
        label.setFont(new Font("Times New Roman",Font.BOLD,30));
        label.setForeground(Color.blue);
        panel.add(label);
         
         label1 = new JLabel("To pay with Debit/Credit Card , Please fill out these details ");
         label1.setBounds(50,50,1000,75);
         label1.setFont(new Font("Times New Roman",Font.ITALIC,20));
         panel.add(label1);
         
         label3 = new JLabel("_____________________________________________________________________");
         label3.setBounds(50,51,1000,75);
         panel.add(label3);
         
         label2 = new JLabel("Credit card name ");
         label2.setBounds(25,100,1000,75);
         label2.setFont(new Font("Elephant",Font.PLAIN,20));
         panel.add(label2);
         
         text = new JTextField("");
         text.setBounds(25,150,300,25);
         panel.add(text);
         
         
         label4 = new JLabel("Credit card number ");
         label4.setBounds(25,170,1000,75);
         label4.setFont(new Font("Elephant",Font.PLAIN,20));
         panel.add(label4);
         
         text1 = new JTextField();
         text1.setBounds(25,220,300,25);
         panel.add(text1);
         
         label5 = new JLabel("Expiration date");
         label5.setBounds(25,250,1000,75);
         label5.setFont(new Font("Elephant",Font.PLAIN,20));
         panel.add(label5);
         
         String year [] = {"MM","January","February","March","April","May","June",
             "July","August","September","October","November","December"};
         String year2 [] = {"YY","2022","2023","2024","2025","2026","2027",
         "2028","2029","2030"};
         
         box = new JComboBox(year);
         box.setBounds(25,300,90,25);
         panel.add(box);
         
         box1 = new JComboBox(year2);
         box1.setBounds(125,300,70,25);
         panel.add(box1);
         
         
     image = new ImageIcon(getClass().getResource("/image/PAY.JPG"));
     Image dabImage = image.getImage();
     Image modifiedDabImage = dabImage.getScaledInstance(200, 200,java.awt.Image.SCALE_SMOOTH);
     image = new ImageIcon(modifiedDabImage);
     
     label6 = new JLabel(image);
     label6.setBounds(0, 0,900,475);
     panel.add(label6);
     
     label7 = new JLabel("Total Amount");
     label7.setBounds(25,325,1000,75);
     label7.setFont(new Font("Times New Roman",Font.BOLD,20));
     panel.add(label7);
     
      text2 = new JTextField();
      text2.setBounds(150,350,150,25);
      text2.setEditable(false); 
      panel.add(text2);
     
     
     button = new JButton("Cancel");
     button.setBounds(10,390,100,25);
     button.addActionListener(this);
     panel.add(button);
     
     button1 = new JButton("Pay");
     button1.setBounds(500,390,100,25);
     button1.addActionListener(this);
     panel.add(button1);
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            dispose();
        }
        if(e.getSource()==button1){
            dispose();
            Report R = new Report();
        }
        
    }

   
}
    

