/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airplanereservationsystem;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Brandon
 */
public class G_prices extends JFrame {
    
     private JTable table;
    
    public G_prices(){
        
        String column []  = {"HOME (FROM)","DESTINATION (TO)", "PRICE"};
        String data [][] = {
        
            {"Tambo International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(45000*1.35)},
            {"Tambo International Airport","Seletar International Airport","KSH " + java.lang.Math.round(40000*1.35)},
            {"Tambo International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(47000*1.35)},
            {"Tambo International Airport","Changi Airports International","KSH " + java.lang.Math.round(50000*1.35)},
            {"Tambo International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(45000*1.35)},
            {"Tambo International Airport","THAI Airways","KSH " + java.lang.Math.round(44000*1.35)},
            {"Tambo International Airport","Senai International Airport","KSH " + java.lang.Math.round(24000*1.35)},
            {"Tambo International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(24000*1.35)},
            {"Tambo International Airport","Tengah Air Base","KSH " + java.lang.Math.round(43000*1.35)},
            {"Tambo International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(45000*1.35)},//
              {"Cairo International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(46000*1.35)},
            {"Cairo International Airport","Seletar International Airport","KSH " + java.lang.Math.round(26000*1.35)},
            {"Cairo International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(56000*1.35)},
            {"Cairo International Airport","Changi Airports International","KSH " + java.lang.Math.round(76000*1.35)},
            {"Cairo International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(20000*1.35)},
            {"Cairo International Airport","THAI Airways","KSH " + java.lang.Math.round(20000*1.35)},
            {"Cairo International Airport","Senai International Airport","KSH " + java.lang.Math.round(45000*1.35)},
            {"Cairo International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(50000*1.35)},
            {"Cairo International Airport","Tengah Air Base","KSH " + java.lang.Math.round(60000*1.35)},
            {"Cairo International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(64000*1.35)},//
              {"Cape Town International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(24000*1.35)},
            {"Cape Town International Airport","Seletar International Airport","KSH " + java.lang.Math.round(45000*1.35)},
            {"Cape Town International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(50000*1.35)},
            {"Cape Town International Airport","Changi Airports International","KSH " + java.lang.Math.round(55000*1.35)},
            {"Cape Town International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(44000*1.35)},
            {"Cape Town International Airport","THAI Airways","KSH " + java.lang.Math.round(37000*1.35)},
            {"Cape Town International Airport","Senai International Airport","KSH " + java.lang.Math.round(65000*1.35)},
            {"Cape Town International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(57000*1.35)},
            {"Cape Town International Airport","Tengah Air Base","KSH " + java.lang.Math.round(65000*1.35)},
            {"Cape Town International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(64000*1.35)},//
                {"Mohamed V International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(34000*1.35)},
            {"Mohamed V International Airport","Seletar International Airport","KSH " + java.lang.Math.round(25000*1.35)},
            {"Mohamed V International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(80000*1.35)},
            {"Mohamed V International Airport","Changi Airports International","KSH " + java.lang.Math.round(45000*1.35)},
            {"Mohamed V International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(41000*1.35)},
            {"Mohamed V International Airport","THAI Airways","KSH " + java.lang.Math.round(17000*1.35)},
            {"Mohamed V International Airport","Senai International Airport","KSH " + java.lang.Math.round(35000*1.35)},
            {"Mohamed V International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(38000*1.35)},
            {"Mohamed V International Airport","Tengah Air Base","KSH " + java.lang.Math.round(44000*1.35)},
            {"Mohamed V International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(24000*1.35)},//
               {"Addis Ababa International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(44000*1.35)},
            {"Addis Ababa International Airport","Seletar International Airport","KSH " + java.lang.Math.round(23000*1.35)},
            {"Addis Ababa International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(80000*1.35)},
            {"Addis Ababa International Airport","Changi Airports International","KSH " + java.lang.Math.round(70000*1.35)},
            {"Addis Ababa International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(33000*1.35)},
            {"Addis Ababa International Airport","THAI Airways","KSH " + java.lang.Math.round(77000*1.35)},
            {"Addis Ababa International Airport","Senai International Airport","KSH " + java.lang.Math.round(90000*1.35)},
            {"Addis Ababa International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(78000*1.35)},
            {"Addis Ababa International Airport","Tengah Air Base","KSH " + java.lang.Math.round(64000*1.35)},
            {"Addis Ababa International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(74000*1.35)},///
              {"Houari International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(44000*1.35)},
            {"Houari International Airport","Seletar International Airport","KSH " + java.lang.Math.round(23000*1.35)},
            {"Houari International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(80000*1.35)},
            {"Houari International Airport","Changi Airports International","KSH " + java.lang.Math.round(50000*1.35)},
            {"Houari International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(33000*1.35)},
            {"Houari International Airport","THAI Airways","KSH " + java.lang.Math.round(97000*1.35)},
            {"Houari International Airport","Senai International Airport","KSH " + java.lang.Math.round(30000*1.35)},
            {"Houari International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(58000*1.35)},
            {"Houari International Airport","Tengah Air Base","KSH " + java.lang.Math.round(64000*1.35)},
            {"Houari International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(74000*1.35)},///
                 {"Jomo Kenyatta International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(54000*1.35)},
            {"Jomo Kenyatta International Airport","Seletar International Airport","KSH " + java.lang.Math.round(23000*1.35)},
            {"Jomo Kenyatta International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(90000*1.35)},
            {"Jomo Kenyatta International Airport","Changi Airports International","KSH " + java.lang.Math.round(50000*1.35)},
            {"Jomo Kenyatta International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(93000*1.35)},
            {"Jomo Kenyatta International Airport","THAI Airways","KSH " + java.lang.Math.round(97000*1.35)},
            {"Jomo Kenyatta International Airport","Senai International Airport","KSH " + java.lang.Math.round(100000*1.35)},
            {"Jomo Kenyatta International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(18000*1.35)},
            {"Jomo Kenyatta International Airport","Tengah Air Base","KSH " + java.lang.Math.round(614000*1.35)},
            {"Jomo Kenyatta International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(74000*1.35)},//
               {"Murtala Muhammed International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(43000*1.35)},
            {"Murtala Muhammed International Airport","Seletar International Airport","KSH " + java.lang.Math.round(90000*1.35)},
            {"Murtala Muhammed International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(40000*1.35)},
            {"Murtala Muhammed International Airport","Changi Airports International","KSH " + java.lang.Math.round(55000*1.35)},
            {"Murtala Muhammed International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(63000*1.35)},
            {"Murtala Muhammed International Airport","THAI Airways","KSH " + java.lang.Math.round(37000*1.35)},
            {"Murtala Muhammed International Airport","Senai International Airport","KSH " + java.lang.Math.round(10000*1.35)},
            {"Murtala Muhammed International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(108000*1.35)},
            {"Murtala Muhammed International Airport","Tengah Air Base","KSH " + java.lang.Math.round(64000*1.35)},
            {"Murtala Muhammed International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(24000*1.35)},///
              {"King Shaka International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(74000*1.35)},
            {"King Shaka International Airport","Seletar International Airport","KSH " + java.lang.Math.round(33000*1.35)},
            {"King Shaka International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(70000*1.35)},
            {"King Shaka International Airport","Changi Airports International","KSH " + java.lang.Math.round(51000*1.35)},
            {"King Shaka International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(62000*1.35)},
            {"King Shaka International Airport","THAI Airways","KSH " + java.lang.Math.round(57000*1.35)},
            {"King Shaka International Airport","Senai International Airport","KSH " + java.lang.Math.round(70000*1.35)},
            {"King Shaka International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(58000*1.35)},
            {"King Shaka International Airport","Tengah Air Base","KSH " + java.lang.Math.round(64000*1.35)},
            {"King Shaka International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(32000*1.35)},///
              {"Tunis Carthage International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(74000*1.35)},
            {"Tunis Carthage International Airport","Seletar International Airport","KSH " + java.lang.Math.round(33000*1.35)},
            {"Tunis Carthage International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(70000*1.35)},
            {"Tunis Carthage International Airport","Changi Airports International","KSH " + java.lang.Math.round(51000*1.35)},
            {"Tunis Carthage International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(62000*1.35)},
            {"Tunis Carthage International Airport","THAI Airways","KSH " + java.lang.Math.round(57000*1.35)},
            {"Tunis Carthage International Airport","Senai International Airport","KSH " + java.lang.Math.round(70000*1.35)},
            {"Tunis Carthage International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(58000*1.35)},
            {"Tunis Carthage International Airport","Tengah Air Base","KSH " + java.lang.Math.round(64000*1.35)},
            {"Tunis Carthage International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(32000*1.35)},////
              {"Menara International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(44000*1.35)},
            {"Menara International Airport","Seletar International Airport","KSH " + java.lang.Math.round(35000*1.35)},
            {"Menara International Airport","Sudong Island Airport","KSH 60,000"},
            {"Menara International Airport","Changi Airports International","KSH " + java.lang.Math.round(21000*1.35)},
            {"Menara International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(45000*1.35)},
            {"Menara International Airport","THAI Airways","KSH " + java.lang.Math.round(40000*1.35)},
            {"Menara International Airport","Senai International Airport","KSH " + java.lang.Math.round(20000*1.35)},
            {"Menara International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(54000*1.35)},
            {"Menara International Airport","Tengah Air Base","KSH " + java.lang.Math.round(24000*1.35)},
            {"Menara International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(83000*1.35)},////
               {"Hurghada International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(44000*1.35)},
            {"Hurghada International Airport","Seletar International Airport","KSH " + java.lang.Math.round(35000*1.35)},
            {"Hurghada International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(90000*1.35)},
            {"Hurghada International Airport","Changi Airports International","KSH " + java.lang.Math.round(23000*1.35)},
            {"Hurghada International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(47000*1.35)},
            {"Hurghada International Airport","THAI Airways","KSH " + java.lang.Math.round(42000*1.35)},
            {"Hurghada International Airport","Senai International Airport","KSH " + java.lang.Math.round(29000*1.35)},
            {"Hurghada International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(52000*1.35)},
            {"Hurghada International Airport","Tengah Air Base","KSH " + java.lang.Math.round(64000*1.35)},
            {"Hurghada International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(93000*1.35)},///
              {"Monastir Habib International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(54000*1.35)},
            {"Monastir Habib International Airport","Seletar International Airport","KSH " + java.lang.Math.round(85000*1.35)},
            {"Monastir Habib International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(40000*1.35)},
            {"Monastir Habib International Airport","Changi Airports International","KSH " + java.lang.Math.round(73000*1.35)},
            {"Monastir Habib International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(87000*1.35)},
            {"Monastir Habib International Airport","THAI Airways","KSH " + java.lang.Math.round(22000*1.35)},
            {"Monastir Habib International Airport","Senai International Airport","KSH " + java.lang.Math.round(79000*1.35)},
            {"Monastir Habib International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(62000*1.35)},
            {"Monastir Habib International Airport","Tengah Air Base","KSH " + java.lang.Math.round(24000*1.35)},
            {"Monastir Habib International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(33000*1.35)},///
              {"Sir Seewoosagur Ramgoolam International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(55000*1.35)},
            {"Sir Seewoosagur Ramgoolam International Airport","Seletar International Airport","KSH " + java.lang.Math.round(15000*1.35)},
            {"Sir Seewoosagur Ramgoolam International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(47000*1.35)},
            {"Sir Seewoosagur Ramgoolam International Airport","Changi Airports International","KSH " + java.lang.Math.round(74000*1.35)},
            {"Sir Seewoosagur Ramgoolam International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(83000*1.35)},
            {"Sir Seewoosagur Ramgoolam International Airport","THAI Airways","KSH " + java.lang.Math.round(72000*1.35)},
            {"Sir Seewoosagur Ramgoolam International Airport","Senai International Airport","KSH " + java.lang.Math.round(89000*1.35)},
            {"Sir Seewoosagur Ramgoolam International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(32000*1.35)},
            {"Sir Seewoosagur Ramgoolam International Airport","Tengah Air Base","KSH " + java.lang.Math.round(24000*1.35)},
            {"Sir Seewoosagur Ramgoolam International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(63000*1.35)},///
               {"Moi International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(25000*1.35)},
            {"Moi International Airport","Seletar International Airport","KSH " + java.lang.Math.round(65000*1.35)},
            {"Moi International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(77000*1.35)},
            {"Moi International Airport","Changi Airports International","KSH " + java.lang.Math.round(70000*1.35)},
            {"Moi International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(80000*1.35)},
            {"Moi International Airport","THAI Airways","KSH " + java.lang.Math.round(52000*1.35)},
            {"Moi International Airport","Senai International Airport","KSH " + java.lang.Math.round(85000*1.35)},
            {"Moi International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(30000*1.35)},
            {"Moi International Airport","Tengah Air Base","KSH " + java.lang.Math.round(54000*1.35)},
            {"Moi International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(23000*1.35)},///
              {"Wilson International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(26000*1.35)},
            {"Wilson International Airport","Seletar International Airport","KSH " + java.lang.Math.round(64000*1.35)},
            {"Wilson International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(70000*1.35)},
            {"Wilson International Airport","Changi Airports International","KSH " + java.lang.Math.round(40000*1.35)},
            {"Wilson International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(50000*1.35)},
            {"Wilson International Airport","THAI Airways","KSH " + java.lang.Math.round(42000*1.35)},
            {"Wilson International Airport","Senai International Airport","KSH " + java.lang.Math.round(55000*1.35)},
            {"Wilson International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(40000*1.35)},
            {"Wilson International Airport","Tengah Air Base","KSH " + java.lang.Math.round(55000*1.35)},
            {"Wilson International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(73000*1.35)},///
               {"Malindi International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(46000*1.35)},
            {"Malindi International Airport","Seletar International Airport","KSH " + java.lang.Math.round(45000*1.35)},
            {"Malindi International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(72000*1.35)},
            {"Malindi International Airport","Changi Airports International","KSH " + java.lang.Math.round(30000*1.35)},
            {"Malindi International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(70000*1.35)},
            {"Malindi International Airport","THAI Airways","KSH " + java.lang.Math.round(46000*1.35)},
            {"Malindi International Airport","Senai International Airport","KSH " + java.lang.Math.round(50000*1.35)},
            {"Malindi International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(30000*1.35)},
            {"Malindi International Airport","Tengah Air Base","KSH " + java.lang.Math.round(65000*1.35)},
            {"Malindi International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(80000*1.35)},///
               {"Kisumu International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(75000*1.35)},
            {"Kisumu International Airport","Seletar International Airport","KSH " + java.lang.Math.round(88000*1.35)},
            {"Kisumu International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(32000*1.35)},
            {"Kisumu International Airport","Changi Airports International","KSH " + java.lang.Math.round(84000*1.35)},
            {"Kisumu International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(80000*1.35)},
            {"Kisumu International Airport","THAI Airways","KSH " + java.lang.Math.round(69000*1.35)},
            {"Kisumu International Airport","Senai International Airport","KSH " + java.lang.Math.round(93000*1.35)},
            {"Kisumu International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(95000*1.35)},
            {"Kisumu International Airport","Tengah Air Base","KSH " + java.lang.Math.round(55000*1.35)},
            {"Kisumu International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(40000*1.35)},///
               {"Eldoret International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(45000*1.35)},
            {"Eldoret International Airport","Seletar International Airport","KSH " + java.lang.Math.round(48000*1.35)},
            {"Eldoret International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(42000*1.35)},
            {"Eldoret International Airport","Changi Airports International","KSH " + java.lang.Math.round(84000*1.35)},
            {"Eldoret International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(80000*1.35)},
            {"Eldoret International Airport","THAI Airways","KSH " + java.lang.Math.round(59000*1.35)},
            {"Eldoret International Airport","Senai International Airport","KSH " + java.lang.Math.round(43000*1.35)},
            {"Eldoret International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(45000*1.35)},
            {"Eldoret International Airport","Tengah Air Base","KSH " + java.lang.Math.round(75000*1.35)},
            {"Eldoret International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(40000*1.35)},///
                {"Isiolo International Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(65000*1.35)},
            {"Isiolo International Airport","Seletar International Airport","KSH " + java.lang.Math.round(68000*1.35)},
            {"Isiolo International Airport","Sudong Island Airport","KSH " + java.lang.Math.round(62000*1.35)},
            {"Isiolo International Airport","Changi Airports International","KSH " + java.lang.Math.round(64000*1.35)},
            {"Isiolo International Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(60000*1.35)},
            {"Isiolo International Airport","THAI Airways","KSH " + java.lang.Math.round(59000*1.35)},
            {"Isiolo International Airport","Senai International Airport","KSH " + java.lang.Math.round(63000*1.35)},
            {"Isiolo International Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(45000*1.35)},
            {"Isiolo International Airport","Tengah Air Base","KSH " + java.lang.Math.round(75000*1.35)},
            {"Isiolo International Airport","Sei Bati Airport","KSH " + java.lang.Math.round(80000*1.35)},///
               {"Mitito Andei Airport","Singapore Changi Airport","KSH " + java.lang.Math.round(35000*1.35)},
            {"Mitito Andei Airport","Seletar International Airport","KSH " + java.lang.Math.round(38000*1.35)},
            {"Mitito Andei Airport","Sudong Island Airport","KSH " + java.lang.Math.round(32000*1.35)},
            {"Mitito Andei Airport","Changi Airports International","KSH " + java.lang.Math.round(34000*1.35)},
            {"Mitito Andei Airport","Paya Lebar Air Base","KSH " + java.lang.Math.round(60000*1.35)},
            {"Mitito Andei Airport","THAI Airways","KSH " + java.lang.Math.round(59000*1.35)},
            {"Mitito Andei Airport","Senai International Airport","KSH " + java.lang.Math.round(63000*1.35)},
            {"Mitito Andei Airport","Hang Nadim International Airport","KSH " + java.lang.Math.round(65000*1.35)},
            {"Mitito Andei Airport","Tengah Air Base","KSH " + java.lang.Math.round(75000*1.35)},
            {"Mitito Andei Airport","Sei Bati Airport","KSH " + java.lang.Math.round(20000*1.35)}
            
        };
        
        table = new JTable( data ,column );
        add(table.getTableHeader(),BorderLayout.BEFORE_FIRST_LINE);
        add(table);
        
        JScrollPane pane = new JScrollPane(table);
        add(pane);
     
        setTitle("                                                           HAVE A LOOK AT OUR FLIGHT PRICES BEFORE BOOKING (GUEST)");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,600);
        setVisible(true);
        
        
    }
    
}
