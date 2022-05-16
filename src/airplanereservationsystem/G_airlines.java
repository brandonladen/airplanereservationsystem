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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Brandon
 */
public class G_airlines implements ActionListener {
    
    
     private JLabel label , label1 , label2 , label3 , label4 , label5;
     private JButton button , button1 , button2 , button3 , button4;
     protected JComboBox box1 , box2 ;
     private JFrame frame; 
     
     G_ticketdetails obj = new G_ticketdetails();
 
    public G_airlines(){
        
     frame = new JFrame();
        
        frame.setSize(1150,600); 
        frame.setUndecorated(true);
        frame.setLayout(new BorderLayout());
        

       frame.setContentPane(new JLabel(new ImageIcon(getClass().getResource("/image/Airline.jpg"))));
        
        
        label = new JLabel();
        frame.add(label);
        frame.pack();
       
       
    
       label1 = new JLabel("FROM :");
       label1.setBounds(0, 400, 1000, 30);
       label1.setFont(new Font("Elephant",Font.BOLD,30));
       label1.setForeground(Color.YELLOW);
       frame.add(label1);
       
       
       label2 = new JLabel("TO :");
       label2.setBounds(550, 400, 1000, 30);
       label2.setFont(new Font("Elephant",Font.BOLD,30));
       label2.setForeground(Color.YELLOW);
       frame.add(label2);
        
       label3 = new JLabel("AFRICA");
       label3.setBounds(100,450,1000,30);
       label3.setFont(new Font("Times New Roman",Font.BOLD,30));
       label3.setForeground(Color.GREEN);
       frame.add(label3);
       
       
       label4 = new JLabel("SINGA PORE");
       label4.setBounds(550,450,1000,30);
       label4.setFont(new Font("Times New Roman",Font.BOLD,30));
       label4.setForeground(Color.GREEN);
       frame.add(label4);
       
       String [] airports = {"Choose Airport","Tambo International Airport",
           "Cairo International Airport","Cape Town International Airport",
           "Mohamed V International Airport",
           "Addis Ababa International Airport","Houari International Airport",
           "Jomo Kenyatta International Airport","Murtala Muhammed International Airport",
           "King Shaka International Airport","Tunis Carthage International Airport",
           "Menara International Airport","Hurghada International Airpor",
           "Monastir Habib International Airport","Sir Seewoosagur Ramgoolam International Airport",
           "Moi International Airport","Wilson International Airport","Malindi International Airport",
           "Kisumu International Airport","Eldoret International Airport","Isiolo International Airport",
           "Mitito Andei Airport"};
                
        box1 = new JComboBox(airports);
       box1.setBounds(230, 450, 250, 30);
       frame.add(box1);
       box1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String airports = String.valueOf(e.getItem());
               
               obj.text1.setText(airports);
                    }
        });
      
       String [] airports2 = {"Choose Airport","Singapore Changi Airport","Seletar International Airport",
           "Sudong Island Airport","Changi Airports International",
           "Paya Lebar Air Base","THAI Airways","Senai International Airport",
           "Hang Nadim International Airport","Tengah Air Base","Sei Bati Airport"}; 
       
        box2 = new JComboBox(airports2);
       box2.setBounds(750, 450, 200, 30);
       frame.add(box2);
       box2.addItemListener(new ItemListener(){
         @Override
         public void itemStateChanged(ItemEvent e){
           String airports2 = String.valueOf(e.getItem());
          obj.text2.setText(airports2);
       }
    });
       
       
       label5 = new JLabel("Choose Your Destination");
       label5.setFont(new Font("Elephant",Font.BOLD,40));
       label5.setForeground(Color.YELLOW);
       label5.setBounds(200,0, 1000, 30);
       frame.add(label5);
       
       
       button = new JButton("Finish");
       button.setBounds(750,620,200,50);
       button.addActionListener(this);
       frame.add(button);
       
       
        button3 = new JButton("Flight Schedules");
       button3.setBounds(500,620,200,50);
       button3.addActionListener(this);
       frame.add(button3);
       
       button1 = new JButton("Save Choice");
       button1.setBounds(500,520,200,50);
       button1.addActionListener(obj);
       frame.add(button1);
       
      
       
       
       button2 = new JButton("Click me to see affordable prices for you");
       button2.setBounds(200,200,500,50);
       button2.addActionListener(this);
       frame.add(button2);
       
       button4 = new JButton("Close");
       button4.setBounds(925,0,75,25);
       button4.addActionListener(this);
       frame.add(button4);
       
       
       frame.setVisible(true);
       
  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
           frame.dispose();
        
        }
        if(e.getSource()==button2){
            G_prices P = new G_prices();
        }
        if(e.getSource()==button3){
            
           Flightschedule F = new Flightschedule();
        }
       
        if(e.getSource()==button4){
           frame.dispose();
       }
    }
    
}

    

