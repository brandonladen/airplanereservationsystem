/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplanereservationsystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Brandon
 */
public class ticketdetails extends JFrame implements ActionListener{
   protected JLabel label1,label2,label3,label4,label5,label6 , label , label7,label8;
     JTextField text1,text2,text4,text5, text6;
     private JComboBox box1 , box2 , box3 , box4 ,box5,box6,box7 , box;
     public JButton button , button1;
     
    /* public JTextField getText5(){
         return text5;
     }
     
     public void  setText5(JTextField newText5){
         this.text5= newText5;
     }
     
     public JButton getButton(){
         return button;
     }
     
     public void  setButton(JButton newButton){
         this.button= newButton;
     }*/
    
     
     
     
    public ticketdetails(){
        setTitle("");
        setSize(850,500);
        setLayout(new BorderLayout());
        setUndecorated(true);
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/image/Plane.png"))));
        setLocation(100,100);
        
        label = new JLabel();
        add(label);
        pack();
        
        label1 = new JLabel("Home (FROM:)");
        label1.setBounds(100,100,1000,30);
        label1.setFont(new Font("Elephant",Font.BOLD,20));
        label1.setForeground(Color.BLUE);
        add(label1);
        
        text1 = new JTextField();
        text1.setBounds(300,100,400,30);
        text1.setEditable(false); 
        add(text1);
        
        label8 = new JLabel("COST");
        label8.setFont(new Font("Wide Latin",Font.BOLD,30));
        label8.setBounds(780,100,1000,30);
        label8.setForeground(Color.red);
        add(label8);
        
        text5 = new JTextField ();
        text5.setBounds(750,150,200,30); 
        text5.setEditable(false); 
        //text5.addActionListener(this);
        add(text5);
        

        label6 = new JLabel("Destination (TO:)");
        label6.setBounds(100,150,1000,30);
        label6.setFont(new Font("Elephant",Font.BOLD,20));
        label6.setForeground(Color.BLUE);
        add(label6);
        
        text2 = new JTextField();
        text2.setBounds(300,150,400,30);
        text2.setEditable(false); 
        add(text2);
        
        label2 = new JLabel("Select Your Class");
        label2.setBounds(100,200,1000,30);
        label2.setFont(new Font("Elephant",Font.BOLD,20));
        label2.setForeground(Color.BLUE);
        add(label2);
        
        
        String [] classes = {"Choose Class","1. First Class",
                              "2 .Bussines Class","3 .Economy Class"};
         box1 = new JComboBox(classes);
         box1.setBounds(300,200,400,30);
         add(box1);
        
        
        label3 = new JLabel("Phone Number");
        label3.setBounds(100,250,1000,30);
        label3.setFont(new Font("Elephant",Font.BOLD,20));
        label3.setForeground(Color.BLUE);
        add(label3);
        
        text4 = new JTextField();
        text4.setBounds(300,250,400,30);
        add(text4);
        
        label4 = new JLabel("Plane");
        label4.setBounds(100,300,1000,30);
        label4.setFont(new Font("Elephant",Font.BOLD,20));
        label4.setForeground(Color.BLUE);
        add(label4);
        
        String planes [] = {"Choose Plane","FLY 540","BOEING 737-700s","BOEING 737-800s"};
        
        box = new JComboBox(planes);
        box.setBounds(300,300, 400, 30);
        add(box);
        
        /*text6 = new JTextField();
        text6.setBounds(300,300,400,30);
        text6.setEditable(false);
        add(text6);*/
        
        
       
        label5 = new JLabel("Date Of Depature");
        label5.setBounds(100,350,1000,30);
        label5.setFont(new Font("Elephant",Font.BOLD,20));
        label5.setForeground(Color.BLUE);
        add(label5);
        
        String [] day = {"Day","01","02","03","04","05","06","07",
            "09","10","11","12","13","14","15","16","17","18",
            "19","20","21","22","23","24","25","26","27","28",
            "29","30","31"};
        String [] month = {"Month","January","February","March",
            "April","May","June","July","August","September","October",
            "November","December"};
        String [] year = {"Year","2022"};
        
        box5 = new JComboBox(day);
        box5.setBounds(300,350,200,30);
        add(box5);
        
         box6 = new JComboBox(month);
        box6.setBounds(500,350,200,30);
        add(box6);
        
         box7 = new JComboBox(year);
        box7.setBounds(700,350,100,30);
        add(box7);
        
        button = new JButton("Next");
        button.setBounds(750,400,200,50);
        button.addActionListener(this);
        add(button);
        
        button1 = new JButton("Cancel");
        button1.setBounds(0,400,200,50);
        button1.addActionListener(this);
        add(button1);
        
        label7 = new JLabel("Give in your correct details");
        label7.setBounds(300, 0, 1000, 30);
        label7.setFont(new Font("Elephant",Font.BOLD,30));
        label7.setForeground(Color.red);
        add(label7);

        
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // PrintStream label7 = System.out.format("\nCurrent Date time: %tcn\n", System.currentTimeMillis());
       /* if(e.getSource()==button1)
        {
            label7.setText(text);
        };*/
        
        if(e.getSource()==button){
             dispose();
            Payment P = new Payment();
        }
        
        
        if(e.getSource()==button1){
            dispose();
         
        }
        
        String airport1 = text1.getText();
        String airport2 = text2.getText();
        
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Singapore Changi Airport")){
          
           text5.setText("KSH 45,000");
        }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 40,000");
        }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 47,000");
        }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 50,000");
    }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 45,000");
         }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 44,000");
         }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 24,000");
         }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 34,000");
         }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 43,000");
         }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 45,000");
         }
        if( airport1.equals("Cairo International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 46,000");
         }
        if( airport1.equals("Cairo International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 26,000");
         }
         if( airport1.equals("Cairo International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 56,000");
         }
         if( airport1.equals("Cairo International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 76,000");
         }
          if( airport1.equals("Cairo International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 20,000");
         }
          if( airport1.equals("Cairo International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 20,000");
         }
           if( airport1.equals("Cairo International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 45,000");
         }
            if( airport1.equals("Cairo International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 50,000");
         }
             if( airport1.equals("Cairo International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 60,000");
         }
             if( airport1.equals("Cairo International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 64,000");
         }
             if( airport1.equals("Cape Town International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 24,000");
         }
        if( airport1.equals("Cape Town International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 45,000");
         }
         if( airport1.equals("Cape Town International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 50,000");
         }
         if( airport1.equals("Cape Town International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 55,000");
         }
          if( airport1.equals("Cape Town International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 44,000");
         }
          if( airport1.equals("Cape Town International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 37,000");
         }
           if( airport1.equals("Cape Town International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 65,000");
         }
            if( airport1.equals("Cape Town International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 57,000");
         }
             if( airport1.equals("Cape Town International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 65,000");
         }
             if( airport1.equals("Cape Town International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 64,000");/////////
         }
              if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 34,000");
         }
        if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 25,000");
         }
         if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 80,000");
         }
         if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 45,000");
         }
          if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 41,000");
         }
          if( airport1.equals("Mohamed V International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 17,000");
         }
           if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 35,000");
         }
            if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 38,000");
         }
             if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 44,000");
         }
             if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 24,000");///////
             }
           if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 44,000");
         }
        if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 23,000");
         }
         if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 80,000");
         }
         if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 70,000");
         }
          if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 33,000");
         }
          if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 77,000");
         }
           if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 90,000");
         }
            if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 78,000");
         }
             if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 64,000");
         }
             if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 74,000");/////
             }
            if( airport1.equals("Houari International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 44,000");
         }
        if( airport1.equals("Houari International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 23,000");
         }
         if( airport1.equals("Houari International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 80,000");
         }
         if( airport1.equals("Houari International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 50,000");
         }
          if( airport1.equals("Houari International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 33,000");
         }
          if( airport1.equals("Houari International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 97,000");
         }
           if( airport1.equals("Houari International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 30,000");
         }
            if( airport1.equals("Houari International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 58,000");
         }
             if( airport1.equals("Houari International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 64,000");
         }
             if( airport1.equals("Houari International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 74,000");/////
          }
            
            if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 54,000");
         }
        if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 23,000");
         }
         if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 90,000");
         }
         if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 50,000");
         }
          if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 93,000");
         }
          if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 97,000");
         }
           if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 100,000");
         }
            if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 18,000");
         }
             if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 164,000");
         }
             if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 74,000");/////
          }
             if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 64,000");
         }
        if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 43,000");
         }
         if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 40,000");
         }
         if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 55,000");
         }
          if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 63,000");
         }
          if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 37,000");
         }
           if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 10,000");
         }
            if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 108,000");
         }
             if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 64,000");
         }
             if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 24,000");/////
          }
            if( airport1.equals("King Shaka International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 74,000");
         }
        if( airport1.equals("King Shaka International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 33,000");
         }
         if( airport1.equals("King Shaka International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 70,000");
         }
         if( airport1.equals("King Shaka International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 51,000");
         }
          if( airport1.equals("King Shaka International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 62,000");
         }
          if( airport1.equals("King Shaka International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 57,000");
         }
           if( airport1.equals("King Shaka International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 70,000");
         }
            if( airport1.equals("King Shaka International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 58,000");
         }
             if( airport1.equals("King Shaka International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 64,000");
         }
             if( airport1.equals("King Shaka International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 32,000");/////
          } 
            
            if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 74,000");
         }
        if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 33,000");
         }
         if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 70,000");
         }
         if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 51,000");
         }
          if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 62,000");
         }
          if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 57,000");
         }
           if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 70,000");
         }
            if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 58,000");
         }
             if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 64,000");
         }
             if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 32,000");/////
          } 
             
             if( airport1.equals("Menara International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 44,000");
         }
        if( airport1.equals("Menara International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 35,000");
         }
         if( airport1.equals("Menara International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 60,000");
         }
         if( airport1.equals("Menara International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 21,000");
         }
          if( airport1.equals("Menara International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 45,000");
         }
          if( airport1.equals("Menara International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 40,000");
         }
           if( airport1.equals("Menara International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 20,000");
         }
            if( airport1.equals("Menara International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 54,000");
         }
             if( airport1.equals("Menara International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 24,000");
         }
             if( airport1.equals("Menara International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 83,000");/////
          } 
             
             if( airport1.equals("Hurghada International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 44,000");
         }
        if( airport1.equals("Hurghada International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 35,000");
         }
         if( airport1.equals("Hurghada International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 90,000");
         }
         if( airport1.equals("Hurghada International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 23,000");
         }
          if( airport1.equals("Hurghada International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 47,000");
         }
          if( airport1.equals("Hurghada International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 42,000");
         }
           if( airport1.equals("Hurghada International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 29,000");
         }
            if( airport1.equals("Hurghada International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 52,000");
         }
             if( airport1.equals("Hurghada International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 64,000");
         }
             if( airport1.equals("Hurghada International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 93,000");/////
          } 
            
             if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 54,000");
         }
        if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 85,000");
         }
         if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 40,000");
         }
         if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 73,000");
         }
          if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 87,000");
         }
          if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 22,000");
         }
           if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 79,000");
         }
            if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 62,000");
         }
             if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 24,000");
         }
             if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 33,000");/////
          } 
             
              if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 55,000");
         }
        if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 15,000");
         }
         if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 47,000");
         }
         if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 74,000");
         }
          if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 83,000");
         }
          if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 72,000");
         }
           if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 89,000");
         }
            if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 32,000");
         }
             if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 24,000");
         }
             if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 63,000");/////
          } 
             
               if( airport1.equals("Moi International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 25,000");
         }
        if( airport1.equals("Moi International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 65,000");
         }
         if( airport1.equals("Moi International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 77,000");
         }
         if( airport1.equals("Moi International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 70,000");
         }
          if( airport1.equals("Moi International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 80,000");
         }
          if( airport1.equals("Moi International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 52,000");
         }
           if( airport1.equals("Moi International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 85,000");
         }
            if( airport1.equals("Moi International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 30,000");
         }
             if( airport1.equals("Moi International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 54,000");
         }
             if( airport1.equals("Moi International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 23,000");/////
          } 
             
               if( airport1.equals("Wilson International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 26,000");
         }
        if( airport1.equals("Wilson International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 64,000");
         }
         if( airport1.equals("Wilson International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 70,000");
         }
         if( airport1.equals("Wilson International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 40,000");
         }
          if( airport1.equals("Wilson International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 50,000");
         }
          if( airport1.equals("Wilson International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 42,000");
         }
           if( airport1.equals("Wilson International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 55,000");
         }
            if( airport1.equals("Wilson International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 40,000");
         }
             if( airport1.equals("Wilson International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 55,000");
         }
             if( airport1.equals("Wilson International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 73,000");/////
          } 
           
             if( airport1.equals("Malindi International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 46,000");
         }
        if( airport1.equals("Malindi International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 45,000");
         }
         if( airport1.equals("Malindi International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 72,000");
         }
         if( airport1.equals("Malindi International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 30,000");
         }
          if( airport1.equals("Malindi International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 70,000");
         }
          if( airport1.equals("Malindi International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 46,000");
         }
           if( airport1.equals("Malindi International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 50,000");
         }
            if( airport1.equals("Malindi International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 30,000");
         }
             if( airport1.equals("Malindi International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 65,000");
         }
             if( airport1.equals("Malindi International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 80,000");/////
          } 
             
              if( airport1.equals("Kisumu International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 75,000");
         }
        if( airport1.equals("Kisumu International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 88,000");
         }
         if( airport1.equals("Kisumu International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 32,000");
         }
         if( airport1.equals("Kisumu International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 84,000");
         }
          if( airport1.equals("Kisumu International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 80,000");
         }
          if( airport1.equals("Kisumu International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 69,000");
         }
           if( airport1.equals("Kisumu International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 93,000");
         }
            if( airport1.equals("Kisumu International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 95,000");
         }
             if( airport1.equals("Kisumu International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 55,000");
         }
             if( airport1.equals("Kisumu International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 40,000");/////
          } 
            
             if( airport1.equals("Eldoret International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 45,000");
         }
        if( airport1.equals("Eldoret International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 48,000");
         }
         if( airport1.equals("Eldoret International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 42,000");
         }
         if( airport1.equals("Eldoret International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 84,000");
         }
          if( airport1.equals("Eldoret International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 80,000");
         }
          if( airport1.equals("Eldoret International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 59,000");
         }
           if( airport1.equals("Eldoret International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 43,000");
         }
            if( airport1.equals("Eldoret International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 45,000");
         }
             if( airport1.equals("Eldoret International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 75,000");
         }
             if( airport1.equals("Eldoret International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 40,000");/////
          } 
   
             if( airport1.equals("Isiolo International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 65,000");
         }
        if( airport1.equals("Isiolo International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 68,000");
         }
         if( airport1.equals("Isiolo International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 62,000");
         }
         if( airport1.equals("Isiolo International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 64,000");
         }
          if( airport1.equals("Isiolo International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 60,000");
         }
          if( airport1.equals("Isiolo International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 59,000");
         }
           if( airport1.equals("Isiolo International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 63,000");
         }
            if( airport1.equals("Isiolo International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 45,000");
         }
             if( airport1.equals("Isiolo International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 75,000");
         }
             if( airport1.equals("Isiolo International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 80,000");/////
          } 
             
            if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH 35,000");
         }
        if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH 38,000");
         }
         if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH 32,000");
         }
         if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH 34,000");
         }
          if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH 60,000");
         }
          if( airport1.equals("Mitito Andei Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH 59,000");
         }
           if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH 63,000");
         }
            if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH 65,000");
         }
             if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH 75,000");
         }
             if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH 20,000");/////
          } 
            
           
           
           
           
             
}
}



