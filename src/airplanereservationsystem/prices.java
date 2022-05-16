/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplanereservationsystem;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

/**
 *
 * @author Brandon
 */
public class prices extends JFrame {
    private JTable table;
    
    public prices(){
        
        String column []  = {"HOME (FROM)","DESTINATION (TO)", "PRICE"};
        String data [][] = {
        
            {"Tambo International Airport","Singapore Changi Airport","KSH 45,000"},
            {"Tambo International Airport","Seletar International Airport","KSH 40,000"},
            {"Tambo International Airport","Sudong Island Airport","KSH 47,000"},
            {"Tambo International Airport","Changi Airports International","KSH 50,000"},
            {"Tambo International Airport","Paya Lebar Air Base","KSH 45,000"},
            {"Tambo International Airport","THAI Airways","KSH 44,000"},
            {"Tambo International Airport","Senai International Airport","KSH 24,000"},
            {"Tambo International Airport","Hang Nadim International Airport","KSH 24,000"},
            {"Tambo International Airport","Tengah Air Base","KSH 43,000"},
            {"Tambo International Airport","Sei Bati Airport","KSH 45,000"},//
              {"Cairo International Airport","Singapore Changi Airport","KSH 46,000"},
            {"Cairo International Airport","Seletar International Airport","KSH 26,000"},
            {"Cairo International Airport","Sudong Island Airport","KSH 56,000"},
            {"Cairo International Airport","Changi Airports International","KSH 76,000"},
            {"Cairo International Airport","Paya Lebar Air Base","KSH 20,000"},
            {"Cairo International Airport","THAI Airways","KSH 20,000"},
            {"Cairo International Airport","Senai International Airport","KSH 45,000"},
            {"Cairo International Airport","Hang Nadim International Airport","KSH 50,000"},
            {"Cairo International Airport","Tengah Air Base","KSH 60,000"},
            {"Cairo International Airport","Sei Bati Airport","KSH 64,000"},//
              {"Cape Town International Airport","Singapore Changi Airport","KSH 24,000"},
            {"Cape Town International Airport","Seletar International Airport","KSH 45,000"},
            {"Cape Town International Airport","Sudong Island Airport","KSH 50,000"},
            {"Cape Town International Airport","Changi Airports International","KSH 55,000"},
            {"Cape Town International Airport","Paya Lebar Air Base","KSH 44,000"},
            {"Cape Town International Airport","THAI Airways","KSH 37,000"},
            {"Cape Town International Airport","Senai International Airport","KSH 65,000"},
            {"Cape Town International Airport","Hang Nadim International Airport","KSH 57,000"},
            {"Cape Town International Airport","Tengah Air Base","KSH 65,000"},
            {"Cape Town International Airport","Sei Bati Airport","KSH 64,000"},//
                {"Mohamed V International Airport","Singapore Changi Airport","KSH 34,000"},
            {"Mohamed V International Airport","Seletar International Airport","KSH 25,000"},
            {"Mohamed V International Airport","Sudong Island Airport","KSH 80,000"},
            {"Mohamed V International Airport","Changi Airports International","KSH 45,000"},
            {"Mohamed V International Airport","Paya Lebar Air Base","KSH 41,000"},
            {"Mohamed V International Airport","THAI Airways","KSH 17,000"},
            {"Mohamed V International Airport","Senai International Airport","KSH 35,000"},
            {"Mohamed V International Airport","Hang Nadim International Airport","KSH 38,000"},
            {"Mohamed V International Airport","Tengah Air Base","KSH 44,000"},
            {"Mohamed V International Airport","Sei Bati Airport","KSH 24,000"},//
               {"Addis Ababa International Airport","Singapore Changi Airport","KSH 44,000"},
            {"Addis Ababa International Airport","Seletar International Airport","KSH 23,000"},
            {"Addis Ababa International Airport","Sudong Island Airport","KSH 80,000"},
            {"Addis Ababa International Airport","Changi Airports International","KSH 70,000"},
            {"Addis Ababa International Airport","Paya Lebar Air Base","KSH 33,000"},
            {"Addis Ababa International Airport","THAI Airways","KSH 77,000"},
            {"Addis Ababa International Airport","Senai International Airport","KSH 90,000"},
            {"Addis Ababa International Airport","Hang Nadim International Airport","KSH 78,000"},
            {"Addis Ababa International Airport","Tengah Air Base","KSH 64,000"},
            {"Addis Ababa International Airport","Sei Bati Airport","KSH 74,000"},///
              {"Houari International Airport","Singapore Changi Airport","KSH 44,000"},
            {"Houari International Airport","Seletar International Airport","KSH 23,000"},
            {"Houari International Airport","Sudong Island Airport","KSH 80,000"},
            {"Houari International Airport","Changi Airports International","KSH 50,000"},
            {"Houari International Airport","Paya Lebar Air Base","KSH 33,000"},
            {"Houari International Airport","THAI Airways","KSH 97,000"},
            {"Houari International Airport","Senai International Airport","KSH 30,000"},
            {"Houari International Airport","Hang Nadim International Airport","KSH 58,000"},
            {"Houari International Airport","Tengah Air Base","KSH 64,000"},
            {"Houari International Airport","Sei Bati Airport","KSH 74,000"},///
                 {"Jomo Kenyatta International Airport","Singapore Changi Airport","KSH 54,000"},
            {"Jomo Kenyatta International Airport","Seletar International Airport","KSH 23,000"},
            {"Jomo Kenyatta International Airport","Sudong Island Airport","KSH 90,000"},
            {"Jomo Kenyatta International Airport","Changi Airports International","KSH 50,000"},
            {"Jomo Kenyatta International Airport","Paya Lebar Air Base","KSH 93,000"},
            {"Jomo Kenyatta International Airport","THAI Airways","KSH 97,000"},
            {"Jomo Kenyatta International Airport","Senai International Airport","KSH 100,000"},
            {"Jomo Kenyatta International Airport","Hang Nadim International Airport","KSH 18,000"},
            {"Jomo Kenyatta International Airport","Tengah Air Base","KSH 614,000"},
            {"Jomo Kenyatta International Airport","Sei Bati Airport","KSH 74,000"},//
               {"Murtala Muhammed International Airport","Singapore Changi Airport","KSH 43,000"},
            {"Murtala Muhammed International Airport","Seletar International Airport","KSH 90,000"},
            {"Murtala Muhammed International Airport","Sudong Island Airport","KSH 40,000"},
            {"Murtala Muhammed International Airport","Changi Airports International","KSH 55,000"},
            {"Murtala Muhammed International Airport","Paya Lebar Air Base","KSH 63,000"},
            {"Murtala Muhammed International Airport","THAI Airways","KSH 37,000"},
            {"Murtala Muhammed International Airport","Senai International Airport","KSH 10,000"},
            {"Murtala Muhammed International Airport","Hang Nadim International Airport","KSH 108,000"},
            {"Murtala Muhammed International Airport","Tengah Air Base","KSH 64,000"},
            {"Murtala Muhammed International Airport","Sei Bati Airport","KSH 24,000"},///
              {"King Shaka International Airport","Singapore Changi Airport","KSH 74,000"},
            {"King Shaka International Airport","Seletar International Airport","KSH 33,000"},
            {"King Shaka International Airport","Sudong Island Airport","KSH 70,000"},
            {"King Shaka International Airport","Changi Airports International","KSH 51,000"},
            {"King Shaka International Airport","Paya Lebar Air Base","KSH 62,000"},
            {"King Shaka International Airport","THAI Airways","KSH 57,000"},
            {"King Shaka International Airport","Senai International Airport","KSH 70,000"},
            {"King Shaka International Airport","Hang Nadim International Airport","KSH 58,000"},
            {"King Shaka International Airport","Tengah Air Base","KSH 64,000"},
            {"King Shaka International Airport","Sei Bati Airport","KSH 32,000"},///
              {"Tunis Carthage International Airport","Singapore Changi Airport","KSH 74,000"},
            {"Tunis Carthage International Airport","Seletar International Airport","KSH 33,000"},
            {"Tunis Carthage International Airport","Sudong Island Airport","KSH 70,000"},
            {"Tunis Carthage International Airport","Changi Airports International","KSH 51,000"},
            {"Tunis Carthage International Airport","Paya Lebar Air Base","KSH 62,000"},
            {"Tunis Carthage International Airport","THAI Airways","KSH 57,000"},
            {"Tunis Carthage International Airport","Senai International Airport","KSH 70,000"},
            {"Tunis Carthage International Airport","Hang Nadim International Airport","KSH 58,000"},
            {"Tunis Carthage International Airport","Tengah Air Base","KSH 64,000"},
            {"Tunis Carthage International Airport","Sei Bati Airport","KSH 32,000"},////
              {"Menara International Airport","Singapore Changi Airport","KSH 44,000"},
            {"Menara International Airport","Seletar International Airport","KSH 35,000"},
            {"Menara International Airport","Sudong Island Airport","KSH 60,000"},
            {"Menara International Airport","Changi Airports International","KSH 21,000"},
            {"Menara International Airport","Paya Lebar Air Base","KSH 45,000"},
            {"Menara International Airport","THAI Airways","KSH 40,000"},
            {"Menara International Airport","Senai International Airport","KSH 20,000"},
            {"Menara International Airport","Hang Nadim International Airport","KSH 54,000"},
            {"Menara International Airport","Tengah Air Base","KSH 24,000"},
            {"Menara International Airport","Sei Bati Airport","KSH 83,000"},////
               {"Hurghada International Airport","Singapore Changi Airport","KSH 44,000"},
            {"Hurghada International Airport","Seletar International Airport","KSH 35,000"},
            {"Hurghada International Airport","Sudong Island Airport","KSH 90,000"},
            {"Hurghada International Airport","Changi Airports International","KSH 23,000"},
            {"Hurghada International Airport","Paya Lebar Air Base","KSH 47,000"},
            {"Hurghada International Airport","THAI Airways","KSH 42,000"},
            {"Hurghada International Airport","Senai International Airport","KSH 29,000"},
            {"Hurghada International Airport","Hang Nadim International Airport","KSH 52,000"},
            {"Hurghada International Airport","Tengah Air Base","KSH 64,000"},
            {"Hurghada International Airport","Sei Bati Airport","KSH 93,000"},///
              {"Monastir Habib International Airport","Singapore Changi Airport","KSH 54,000"},
            {"Monastir Habib International Airport","Seletar International Airport","KSH 85,000"},
            {"Monastir Habib International Airport","Sudong Island Airport","KSH 40,000"},
            {"Monastir Habib International Airport","Changi Airports International","KSH 73,000"},
            {"Monastir Habib International Airport","Paya Lebar Air Base","KSH 87,000"},
            {"Monastir Habib International Airport","THAI Airways","KSH 22,000"},
            {"Monastir Habib International Airport","Senai International Airport","KSH 79,000"},
            {"Monastir Habib International Airport","Hang Nadim International Airport","KSH 62,000"},
            {"Monastir Habib International Airport","Tengah Air Base","KSH 24,000"},
            {"Monastir Habib International Airport","Sei Bati Airport","KSH 33,000"},///
              {"Sir Seewoosagur Ramgoolam International Airport","Singapore Changi Airport","KSH 55,000"},
            {"Sir Seewoosagur Ramgoolam International Airport","Seletar International Airport","KSH 15,000"},
            {"Sir Seewoosagur Ramgoolam International Airport","Sudong Island Airport","KSH 47,000"},
            {"Sir Seewoosagur Ramgoolam International Airport","Changi Airports International","KSH 74,000"},
            {"Sir Seewoosagur Ramgoolam International Airport","Paya Lebar Air Base","KSH 83,000"},
            {"Sir Seewoosagur Ramgoolam International Airport","THAI Airways","KSH 72,000"},
            {"Sir Seewoosagur Ramgoolam International Airport","Senai International Airport","KSH 89,000"},
            {"Sir Seewoosagur Ramgoolam International Airport","Hang Nadim International Airport","KSH 32,000"},
            {"Sir Seewoosagur Ramgoolam International Airport","Tengah Air Base","KSH 24,000"},
            {"Sir Seewoosagur Ramgoolam International Airport","Sei Bati Airport","KSH 63,000"},///
               {"Moi International Airport","Singapore Changi Airport","KSH 25,000"},
            {"Moi International Airport","Seletar International Airport","KSH 65,000"},
            {"Moi International Airport","Sudong Island Airport","KSH 77,000"},
            {"Moi International Airport","Changi Airports International","KSH 70,000"},
            {"Moi International Airport","Paya Lebar Air Base","KSH 80,000"},
            {"Moi International Airport","THAI Airways","KSH 52,000"},
            {"Moi International Airport","Senai International Airport","KSH 85,000"},
            {"Moi International Airport","Hang Nadim International Airport","KSH 30,000"},
            {"Moi International Airport","Tengah Air Base","KSH 54,000"},
            {"Moi International Airport","Sei Bati Airport","KSH 23,000"},///
              {"Wilson International Airport","Singapore Changi Airport","KSH 26,000"},
            {"Wilson International Airport","Seletar International Airport","KSH 64,000"},
            {"Wilson International Airport","Sudong Island Airport","KSH 70,000"},
            {"Wilson International Airport","Changi Airports International","KSH 40,000"},
            {"Wilson International Airport","Paya Lebar Air Base","KSH 50,000"},
            {"Wilson International Airport","THAI Airways","KSH 42,000"},
            {"Wilson International Airport","Senai International Airport","KSH 55,000"},
            {"Wilson International Airport","Hang Nadim International Airport","KSH 40,000"},
            {"Wilson International Airport","Tengah Air Base","KSH 55,000"},
            {"Wilson International Airport","Sei Bati Airport","KSH 73,000"},///
               {"Malindi International Airport","Singapore Changi Airport","KSH 46,000"},
            {"Malindi International Airport","Seletar International Airport","KSH 45,000"},
            {"Malindi International Airport","Sudong Island Airport","KSH 72,000"},
            {"Malindi International Airport","Changi Airports International","KSH 30,000"},
            {"Malindi International Airport","Paya Lebar Air Base","KSH 70,000"},
            {"Malindi International Airport","THAI Airways","KSH 46,000"},
            {"Malindi International Airport","Senai International Airport","KSH 50,000"},
            {"Malindi International Airport","Hang Nadim International Airport","KSH 30,000"},
            {"Malindi International Airport","Tengah Air Base","KSH 65,000"},
            {"Malindi International Airport","Sei Bati Airport","KSH 80,000"},///
               {"Kisumu International Airport","Singapore Changi Airport","KSH 75,000"},
            {"Kisumu International Airport","Seletar International Airport","KSH 88,000"},
            {"Kisumu International Airport","Sudong Island Airport","KSH 32,000"},
            {"Kisumu International Airport","Changi Airports International","KSH 84,000"},
            {"Kisumu International Airport","Paya Lebar Air Base","KSH 80,000"},
            {"Kisumu International Airport","THAI Airways","KSH 69,000"},
            {"Kisumu International Airport","Senai International Airport","KSH 93,000"},
            {"Kisumu International Airport","Hang Nadim International Airport","KSH 95,000"},
            {"Kisumu International Airport","Tengah Air Base","KSH 55,000"},
            {"Kisumu International Airport","Sei Bati Airport","KSH 40,000"},///
               {"Eldoret International Airport","Singapore Changi Airport","KSH 45,000"},
            {"Eldoret International Airport","Seletar International Airport","KSH 48,000"},
            {"Eldoret International Airport","Sudong Island Airport","KSH 42,000"},
            {"Eldoret International Airport","Changi Airports International","KSH 84,000"},
            {"Eldoret International Airport","Paya Lebar Air Base","KSH 80,000"},
            {"Eldoret International Airport","THAI Airways","KSH 59,000"},
            {"Eldoret International Airport","Senai International Airport","KSH 43,000"},
            {"Eldoret International Airport","Hang Nadim International Airport","KSH 45,000"},
            {"Eldoret International Airport","Tengah Air Base","KSH 75,000"},
            {"Eldoret International Airport","Sei Bati Airport","KSH 40,000"},///
                {"Isiolo International Airport","Singapore Changi Airport","KSH 65,000"},
            {"Isiolo International Airport","Seletar International Airport","KSH 68,000"},
            {"Isiolo International Airport","Sudong Island Airport","KSH 62,000"},
            {"Isiolo International Airport","Changi Airports International","KSH 64,000"},
            {"Isiolo International Airport","Paya Lebar Air Base","KSH 60,000"},
            {"Isiolo International Airport","THAI Airways","KSH 59,000"},
            {"Isiolo International Airport","Senai International Airport","KSH 63,000"},
            {"Isiolo International Airport","Hang Nadim International Airport","KSH 45,000"},
            {"Isiolo International Airport","Tengah Air Base","KSH 75,000"},
            {"Isiolo International Airport","Sei Bati Airport","KSH 80,000"},///
               {"Mitito Andei Airport","Singapore Changi Airport","KSH 35,000"},
            {"Mitito Andei Airport","Seletar International Airport","KSH 38,000"},
            {"Mitito Andei Airport","Sudong Island Airport","KSH 32,000"},
            {"Mitito Andei Airport","Changi Airports International","KSH 34,000"},
            {"Mitito Andei Airport","Paya Lebar Air Base","KSH 60,000"},
            {"Mitito Andei Airport","THAI Airways","KSH 59,000"},
            {"Mitito Andei Airport","Senai International Airport","KSH 63,000"},
            {"Mitito Andei Airport","Hang Nadim International Airport","KSH 65,000"},
            {"Mitito Andei Airport","Tengah Air Base","KSH 75,000"},
            {"Mitito Andei Airport","Sei Bati Airport","KSH 20,000"}
            
        };
        
        table = new JTable( data ,column );
        add(table.getTableHeader(),BorderLayout.BEFORE_FIRST_LINE);
        add(table);
        
        JScrollPane pane = new JScrollPane(table);
        add(pane);
     
        setTitle("                                                           HAVE A LOOK AT OUR FLIGHT PRICES BEFORE BOOKING");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,600);
        setVisible(true);
        
        
    }
}
