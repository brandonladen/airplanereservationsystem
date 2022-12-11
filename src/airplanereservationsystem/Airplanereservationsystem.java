/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airplanereservationsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



/**
 *
 * @author Brandon
 */
public class Airplanereservationsystem  extends JFrame implements ActionListener  {

      private JPanel panel;
      private ImageIcon image, image1, image2,image3 ;
      private JLabel label , label1 , label2 , label3 , label4 , label6 , label5 ;
      private JButton button1 ,button2 , button3 ,button4 , button5 , button6;
    ;
 
     /* @param args the command line arguments
     */
    public Airplanereservationsystem(){
        
        
        panel = new JPanel();
      panel.setBackground(Color.green);
      panel.setLayout(null);
      add(panel);
     
      
     setTitle("Home Window");
     setSize(1150, 600);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocation(400,100);
     setUndecorated(true);
     
      
     
      
     image = new ImageIcon(getClass().getResource("/image/Login 1.png"));
     Image dabImage = image.getImage();
     Image modifiedDabImage = dabImage.getScaledInstance(200, 150,java.awt.Image.SCALE_SMOOTH);
     image = new ImageIcon(modifiedDabImage);
     
     label = new JLabel(image);
     label.setBounds(0, 0, 2050, 750);
     panel.add(label);
     
     
     image1 = new ImageIcon(getClass().getResource("/image/Login.png"));
     Image dabImages = image1.getImage();
     Image modifiedDabImages = dabImages.getScaledInstance(200, 150,java.awt.Image.SCALE_SMOOTH);
     image1 = new ImageIcon(modifiedDabImages);
     
     label4 = new JLabel(image1);
     label4.setBounds(0, 0, 200, 750);
     panel.add(label4);
     
     
     
     image2 = new ImageIcon(getClass().getResource("/image/Airplane.png"));
     Image dabImage1 = image2.getImage();
     Image modifiedDabImage1 = dabImage1.getScaledInstance(500, 150,java.awt.Image.SCALE_SMOOTH);
     image2 = new ImageIcon(modifiedDabImage1);
     
     label5 = new JLabel(image2);
     label5.setBounds(0, 0, 1150,150);
     panel.add(label5);
     
     
      image3 = new ImageIcon(getClass().getResource("/image/About Us.png"));
     Image dabImage2 = image3.getImage();
     Image modifiedDabImage2 = dabImage2.getScaledInstance(75,75,java.awt.Image.SCALE_SMOOTH);
     image3 = new ImageIcon(modifiedDabImage2);
     
     label6 = new JLabel(image3);
     label6.setBounds(0, 0, 800,900);
     panel.add(label6);
      
      
      
      label1 = new JLabel("Airline Ticket Reservation System");
     label1.setBounds(90,150, 1000, 75);
     label1.setFont(new Font("Serif",Font.BOLD,65));
     label1.setForeground(Color.blue);
     panel.add(label1);
     
     label2 = new JLabel ("Register to get upto 35% discount"); 
     label2.setBounds(300,200, 1000, 100);
     label2.setFont(new Font("Aerial",Font.ITALIC,35));
     label2.setForeground(Color.black);
     panel.add(label2);
     
     button1 = new JButton("Welcome As Guest");
     button1.setBounds(450,300 , 200, 50);
    // button1.setContentAreaFilled(false);
    // button1.setBorderPainted(false);
     button1.addActionListener(this);
     button1.setContentAreaFilled(false);
     panel.add(button1);
     
     
     
     button2 = new JButton("Log in");
     button2.setBounds(10,450 , 200, 50);
     button2.addActionListener(this);
     button2.setContentAreaFilled(false);
     panel.add(button2);
     
     button3 = new JButton("Register");
     button3.setBounds(920,450 , 200, 50);
     button3.addActionListener(this);
     button3.setContentAreaFilled(false);
     panel.add(button3);
     
     button6 = new JButton("CLOSE");
     button6.setBounds(1050,0 , 100, 25);
     button6.addActionListener(this);
     //button6.setContentAreaFilled(false);
     panel.add(button6);
     
     
      button4 = new JButton("About us");
     button4.setBounds(350,400 , 100, 90);
     button4.addActionListener(this);
     button4.setContentAreaFilled(false);
     panel.add(button4);
     
     
      button5 = new JButton("Help");
     button5.setBounds(650,450 , 200, 50);
     button5.addActionListener(this);
     button5.setContentAreaFilled(false);
     panel.add(button5);
     
     
     
     
     label3 = new JLabel("© Brandon Lyden");
     label3.setFont(new Font("Wide Latin",Font.BOLD,20));
     label3.setBounds(400,500, 1000, 100);
     panel.add(label3);
     
     setVisible(true);
    }    
    
   public static void main(String[] args) {
      //  System.out.format("\nCurrent Date time: %tcn\n", System.currentTimeMillis());
     // new Airplanereservationsystem();
      new G_airlines();
      // new G_Payment();
       //new Payment();
    
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button1){
         //   WelcomeAsGuest W = new WelcomeAsGuest();
             JOptionPane.showMessageDialog(null, "We recommend you to register if you dont have any account and get upto 35% discount.\n "
            + " Please click OK to continue as Guest 😊");
              new Guest();
            } 
        
       else if(e.getSource()==button3){
             Register R = new Register();
             }
       else if(e.getSource()==button2){
           Login L = new Login();
            }
       else if(e.getSource()==button4){
           JOptionPane.showMessageDialog(null, "This is basically Brandon's 2022 java project");
       }
       else if(e.getSource()==button5){
           JOptionPane.showMessageDialog(null,"Contact me through 0702499923");
       }
        else if(e.getSource()==button6){
           dispose();
       
 }
}
}