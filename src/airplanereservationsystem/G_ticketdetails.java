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
public class G_ticketdetails extends JFrame implements ActionListener {
    
    protected JLabel label1,label2,label3,label4,label5,label6 , label , label7,label8;
     protected JTextField text1,text2,text4,text5, text6;
     private JComboBox box1 , box2 , box3 , box4 ,box5,box6,box7 , box;
     private JButton button , button1;
    
    public G_ticketdetails(){
        setTitle("");
        setSize(850,500);
        setLayout(new BorderLayout());
        setUndecorated(true);
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/image/Plane.png"))));
        //setLayout(new FlowLayout());
        
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
        if(e.getSource()==button){
            dispose();
            Payment P = new Payment();
        }
        
     if(e.getSource()==button1){
            dispose();
         
        }
        String airport1 = text1.getText();
        String airport2 = text2.getText();
        
        if(airport1.equals("Tambo International Airport") && airport2.equals("Singapore Changi Airport")){
            text5.setText( "KSH " + java.lang.Math.round(45000*1.35) );
        }
     if( airport1.equals("Tambo International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(40000*1.35));
        }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(47000*1.35));
        }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH "+ java.lang.Math.round(50000*1.35));
    }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(45000*1.35));
         }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(44000*1.35));
         }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(24000*1.35));
         }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(34000*1.35));
         }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(43000*1.35));
         }
        if( airport1.equals("Tambo International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(45000*1.35));
         }
        if( airport1.equals("Cairo International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(46000*1.35));
         }
        if( airport1.equals("Cairo International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(26000*1.35));
         }
         if( airport1.equals("Cairo International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(56000*1.35));
         }
         if( airport1.equals("Cairo International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(76000*1.35));
         }
          if( airport1.equals("Cairo International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(20000*1.35));
         }
          if( airport1.equals("Cairo International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(20000*1.35));
         }
           if( airport1.equals("Cairo International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(45000*1.35));
         }
            if( airport1.equals("Cairo International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(50000*1.35));
         }
             if( airport1.equals("Cairo International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(60000*1.35));
         }
             if( airport1.equals("Cairo International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(64000*1.35));
         }
             if( airport1.equals("Cape Town International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(24000*1.35));
         }
        if( airport1.equals("Cape Town International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(45000*1.35));
         }
         if( airport1.equals("Cape Town International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(50000*1.35));
         }
         if( airport1.equals("Cape Town International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(55000*1.35));
         }
          if( airport1.equals("Cape Town International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(44000*1.35));
         }
          if( airport1.equals("Cape Town International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(37000*1.35));
         }
           if( airport1.equals("Cape Town International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(65000*1.35));
         }
            if( airport1.equals("Cape Town International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(57000*1.35));
         }
             if( airport1.equals("Cape Town International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(60000*1.35));
         }
             if( airport1.equals("Cape Town International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(64000*1.35));/////////
         }
              if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(34000*1.35));
         }
        if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(25000*1.35));
         }
         if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(80000*1.35));
         }
         if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(45000*1.35));
         }
          if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(41000*1.35));
         }
          if( airport1.equals("Mohamed V International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(17000*1.35));
         }
           if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(35000*1.35));
         }
            if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(38000*1.35));
         }
             if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(44000*1.35));
         }
             if( airport1.equals("Mohamed V International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(24000*1.35));///////
             }
           if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(44000*1.35));
         }
        if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(23000*1.35));
         }
         if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(80000*1.35));
         }
         if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(70000*1.35));
         }
          if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(33000*1.35));
         }
          if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(77000*1.35));
         }
           if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(90000*1.35));
         }
            if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(78000*1.35));
         }
             if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(64000*1.35));
         }
             if( airport1.equals("Addis Ababa International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(74000*1.35));/////
             }
            if( airport1.equals("Houari International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(44000*1.35));
         }
        if( airport1.equals("Houari International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(23000*1.35));
         }
         if( airport1.equals("Houari International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(80000*1.35));
         }
         if( airport1.equals("Houari International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(50000*1.35));
         }
          if( airport1.equals("Houari International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(33000*1.35));
         }
          if( airport1.equals("Houari International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(97000*1.35));
         }
           if( airport1.equals("Houari International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(30000*1.35));
         }
            if( airport1.equals("Houari International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(58000*1.35));
         }
             if( airport1.equals("Houari International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(64000*1.35));
         }
             if( airport1.equals("Houari International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(74000*1.35));/////
          }
            
            if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(54000*1.35));
         }
        if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(23000*1.35));
         }
         if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(90000*1.35));
         }
         if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(50000*1.35));
         }
          if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(93000*1.35));
         }
          if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(97000*1.35));
         }
           if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(100000*1.35));
         }
            if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(18000*1.35));
         }
             if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(164000*1.35));
         }
             if( airport1.equals("Jomo Kenyatta International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(74000*1.35));/////
          }
             if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(64000*1.35));
         }
        if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(43000*1.35));
         }
         if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(40000*1.35));
         }
         if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(55000*1.35));
         }
          if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(63000*1.35));
         }
          if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(37000*1.35));
         }
           if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(10000*1.35));
         }
            if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(108000*1.35));
         }
             if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(64000*1.35));
         }
             if( airport1.equals("Murtala Muhammed International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(24000*1.35));/////
          }
            if( airport1.equals("King Shaka International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(74000*1.35));
         }
        if( airport1.equals("King Shaka International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(33000*1.35));
         }
         if( airport1.equals("King Shaka International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(70000*1.35));
         }
         if( airport1.equals("King Shaka International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(51000*1.35));
         }
          if( airport1.equals("King Shaka International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(62000*1.35));
         }
          if( airport1.equals("King Shaka International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(57000*1.35));
         }
           if( airport1.equals("King Shaka International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(70000*1.35));
         }
            if( airport1.equals("King Shaka International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(58000*1.35));
         }
             if( airport1.equals("King Shaka International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(64000*1.35));
         }
             if( airport1.equals("King Shaka International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(32000*1.35));/////
          } 
            
            if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(74000*1.35));
         }
        if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(33000*1.35));
         }
         if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(70000*1.35));
         }
         if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(51000*1.35));
         }
          if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(62000*1.35));
         }
          if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(57000*1.35));
         }
           if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(70000*1.35));
         }
            if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(58000*1.35));
         }
             if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(64000*1.35));
         }
             if( airport1.equals("Tunis Carthage International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(32000*1.35));/////
          } 
             
             if( airport1.equals("Menara International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(44000*1.35));
         }
        if( airport1.equals("Menara International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(35000*1.35));
         }
         if( airport1.equals("Menara International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(60000*1.35));
         }
         if( airport1.equals("Menara International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(21000*1.35));
         }
          if( airport1.equals("Menara International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(45000*1.35));
         }
          if( airport1.equals("Menara International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(40000*1.35));
         }
           if( airport1.equals("Menara International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(20000*1.35));
         }
            if( airport1.equals("Menara International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(54000*1.35));
         }
             if( airport1.equals("Menara International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(24000*1.35));
         }
             if( airport1.equals("Menara International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(83000*1.35));/////
          } 
             
             if( airport1.equals("Hurghada International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(44000*1.35));
         }
        if( airport1.equals("Hurghada International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(35000*1.35));
         }
         if( airport1.equals("Hurghada International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(90000*1.35));
         }
         if( airport1.equals("Hurghada International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(23000*1.35));
         }
          if( airport1.equals("Hurghada International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(47000*1.35));
         }
          if( airport1.equals("Hurghada International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(42000*1.35));
         }
           if( airport1.equals("Hurghada International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(29000*1.35));
         }
            if( airport1.equals("Hurghada International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(52000*1.35));
         }
             if( airport1.equals("Hurghada International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(64000*1.35));
         }
             if( airport1.equals("Hurghada International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(93000*1.35));/////
          } 
            
             if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(54000*1.35));
         }
        if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(85000*1.35));
         }
         if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(40000*1.35));
         }
         if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(73000*1.35));
         }
          if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(87000*1.35));
         }
          if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(22000*1.35));
         }
           if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(79000*1.35));
         }
            if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(62000*1.35));
         }
             if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(24000*1.35));
         }
             if( airport1.equals("Monastir Habib International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH "+ java.lang.Math.round(33000*1.35));/////
          } 
             
              if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(55000*1.35));
         }
        if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(15000*1.35));
         }
         if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(47000*1.35));
         }
         if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(74000*1.35));
         }
          if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(83000*1.35));
         }
          if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(72000*1.35));
         }
           if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(89000*1.35));
         }
            if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(32000*1.35));
         }
             if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(24000*1.35));
         }
             if( airport1.equals("Sir Seewoosagur Ramgoolam International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(63000*1.35));/////
          } 
             
               if( airport1.equals("Moi International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(25000*1.35));
         }
        if( airport1.equals("Moi International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(65000*1.35));
         }
         if( airport1.equals("Moi International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(77000*1.35));
         }
         if( airport1.equals("Moi International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(70000*1.35));
         }
          if( airport1.equals("Moi International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(80000*1.35));
         }
          if( airport1.equals("Moi International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(52000*1.35));
         }
           if( airport1.equals("Moi International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(85000*1.35));
         }
            if( airport1.equals("Moi International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(30000*1.35));
         }
             if( airport1.equals("Moi International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(54000*1.35));
         }
             if( airport1.equals("Moi International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(23000*1.35));/////
          } 
             
               if( airport1.equals("Wilson International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(26000*1.35));
         }
        if( airport1.equals("Wilson International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(64000*1.35));
         }
         if( airport1.equals("Wilson International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(70000*1.35));
         }
         if( airport1.equals("Wilson International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(40000*1.35));
         }
          if( airport1.equals("Wilson International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(50000*1.35));
         }
          if( airport1.equals("Wilson International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(42000*1.35));
         }
           if( airport1.equals("Wilson International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(55000*1.35));
         }
            if( airport1.equals("Wilson International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(40000*1.35));
         }
             if( airport1.equals("Wilson International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(55000*1.35));
         }
             if( airport1.equals("Wilson International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(73000*1.35));/////
          } 
           
             if( airport1.equals("Malindi International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(46000*1.35));
         }
        if( airport1.equals("Malindi International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(45000*1.35));
         }
         if( airport1.equals("Malindi International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(72000*1.35));
         }
         if( airport1.equals("Malindi International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(30000*1.35));
         }
          if( airport1.equals("Malindi International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(70000*1.35));
         }
          if( airport1.equals("Malindi International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(46000*1.35));
         }
           if( airport1.equals("Malindi International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(50000*1.35));
         }
            if( airport1.equals("Malindi International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(30000*1.35));
         }
             if( airport1.equals("Malindi International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(65000*1.35));
         }
             if( airport1.equals("Malindi International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(80000*1.35));/////
          } 
             
              if( airport1.equals("Kisumu International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(75000*1.35));
         }
        if( airport1.equals("Kisumu International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(88000*1.35));
         }
         if( airport1.equals("Kisumu International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(32000*1.35));
         }
         if( airport1.equals("Kisumu International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(84000*1.35));
         }
          if( airport1.equals("Kisumu International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(80000*1.35));
         }
          if( airport1.equals("Kisumu International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(69000*1.35));
         }
           if( airport1.equals("Kisumu International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(93000*1.35));
         }
            if( airport1.equals("Kisumu International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(95000*1.35));
         }
             if( airport1.equals("Kisumu International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(55000*1.35));
         }
             if( airport1.equals("Kisumu International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(40000*1.35));/////
          } 
            
             if( airport1.equals("Eldoret International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(45000*1.35));
         }
        if( airport1.equals("Eldoret International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(48000*1.35));
         }
         if( airport1.equals("Eldoret International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(42000*1.35));
         }
         if( airport1.equals("Eldoret International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(84000*1.35));
         }
          if( airport1.equals("Eldoret International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(80000*1.35));
         }
          if( airport1.equals("Eldoret International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(59000*1.35));
         }
           if( airport1.equals("Eldoret International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(43000*1.35));
         }
            if( airport1.equals("Eldoret International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(45000*1.35));
         }
             if( airport1.equals("Eldoret International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(75000*1.35));
         }
             if( airport1.equals("Eldoret International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(40000*1.35));/////
          } 
   
             if( airport1.equals("Isiolo International Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(65000*1.35));
         }
        if( airport1.equals("Isiolo International Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(68000*1.35));
         }
         if( airport1.equals("Isiolo International Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(62000*1.35));
         }
         if( airport1.equals("Isiolo International Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(64000*1.35));
         }
          if( airport1.equals("Isiolo International Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(60000*1.35));
         }
          if( airport1.equals("Isiolo International Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(59000*1.35));
         }
           if( airport1.equals("Isiolo International Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(63000*1.35));
         }
            if( airport1.equals("Isiolo International Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(45000*1.35));
         }
             if( airport1.equals("Isiolo International Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(75000*1.35));
         }
             if( airport1.equals("Isiolo International Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(80000*1.35));/////
          } 
             
            if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Singapore Changi Airport")){
           text5.setText("KSH " + java.lang.Math.round(35000*1.35));
         }
        if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Seletar International Airport")){
           text5.setText("KSH " + java.lang.Math.round(38000*1.35));
         }
         if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Sudong Island Airport")){
           text5.setText("KSH " + java.lang.Math.round(32000*1.35));
         }
         if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Changi Airports International")){
           text5.setText("KSH " + java.lang.Math.round(34000*1.35));
         }
          if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Paya Lebar Air Base")){
           text5.setText("KSH " + java.lang.Math.round(60000*1.35));
         }
          if( airport1.equals("Mitito Andei Airport")&& airport2.equals("THAI Airways")){
           text5.setText("KSH " + java.lang.Math.round(59000*1.35));
         }
           if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Senai International Airport")){
           text5.setText("KSH " + java.lang.Math.round(63000*1.35));
         }
            if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Hang Nadim International Airport")){
           text5.setText("KSH " + java.lang.Math.round(65000*1.35));
         }
             if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Tengah Air Base")){
           text5.setText("KSH " + java.lang.Math.round(75000*1.35));
         }
             if( airport1.equals("Mitito Andei Airport")&& airport2.equals("Sei Bati Airport")){
           text5.setText("KSH " + java.lang.Math.round(20000*1.35));/////
          } 
            
}
}
