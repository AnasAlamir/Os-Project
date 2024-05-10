/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpu.scheduling.pkg2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class MyFrame extends JFrame/* implements ActionListener*/{
    MyFrame(){
        this.setSize(720,620);
        this.setTitle("Priority (Non-Preemptive)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true); 
        ImageIcon icon = new ImageIcon("D:/anas/os-project-and-task-main/cpu scheduling 2/cpu.jpg");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(242, 242, 242));
        this.setVisible(true);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==)
//    }
    
}
