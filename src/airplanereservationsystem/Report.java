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
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Brandon
 */
public class Report extends JFrame implements ActionListener{
    
    private JPanel panel ;
    protected JLabel label , label2 , label3 , label4 , label5 , label6 ,label7 , label8 , label9 , label10 ;
    protected JTextField text , text1, text2 , text3 , text4 , text5;
    private JButton button;
    
    
    
    public Report(){
        
      
        setSize(800,400);
        setLocation(400,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        
        panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        
        label = new JLabel("Transaction Successful !!");
        label.setBounds(200,50,1000,50);
        label.setFont(new Font("Wide Latin",Font.ITALIC,20));
        label.setForeground(Color.blue);
        panel.add(label);
        
        label2 = new JLabel("Thankyou for booking ticket with us");
        label2.setBounds(260,75,1000,50);
        label2.setFont(new Font("Times New Roman",Font.PLAIN ,20));
        label2.setForeground(Color.black);
        panel.add(label2);
        
        label3 = new JLabel("___________________________________"
                + "___________________________________________"
                + "_____________________________________________");
        label3.setBounds(0,100,1000,50);
        panel.add(label3);
        
        label4 = new JLabel("NAME OF PASSANGER");
        label4.setBounds(10,120,1000,50);
        panel.add(label4);
        
        text = new JTextField();
        text.setBounds(10,170,250,25);
        panel.add(text);
        
        
        label5 = new JLabel("PLANE");
        label5.setBounds(350,120,1000,50);
        panel.add(label5);
        
        text1 = new JTextField();
        text1.setBounds(350,170,100,25);
        panel.add(text1);
        
        label6 = new JLabel("DATE");
        label6.setBounds(520,120,1000,50);
        panel.add(label6);
        
        text2 = new JTextField();
        text2.setBounds(520,170,100,25);
        panel.add(text2);
        
        label7 = new JLabel("SEAT");
        label7.setBounds(690,120,1000,50);
        panel.add(label7);
        
        text3 = new JTextField();
        text3.setBounds(690,170,100,25);
        panel.add(text3);
        
        label8 = new JLabel("FROM :");
        label8.setBounds(10,230,1000,50);
        panel.add(label8);
        
        text4 = new JTextField();
        text4.setBounds(75,240,300,25);
        panel.add(text4);
        
        
        label9 = new JLabel("TO :");
        label9.setBounds(10,300,1000,50);
        panel.add(label9);
        
        text5 = new JTextField();
        text5.setBounds(75,310,300,25);
        panel.add(text5);
        
        label10 = new JLabel("___________________________________"
                + "___________________________________________"
                + "_____________________________________________");
        label10.setBounds(0,310,1000,50);
        panel.add(label10);
        
        button = new JButton("Finish");
        button.setBounds(350,360,100,25);
        button.addActionListener(this);
        panel.add(button);
        
        
        
        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
              dispose();
              
        }
       
    }
}
