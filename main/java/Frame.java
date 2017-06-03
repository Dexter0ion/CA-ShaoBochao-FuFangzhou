package test;

import java.awt.*;

import javax.swing.*;

public class Frame extends JFrame{

    private JButton[] jb = new JButton[100];



    //构造函数  
    public Frame(){

        for(int i=0; i<100; i++)
            jb[i] = new JButton(String.valueOf(i));

        this.setLayout(new GridLayout(10,10,10,10));

        for(int i=0; i<100; i++)
            this.add(jb[i]);

        this.setTitle("你好啊！");
        this.setLocation(100,200);
        this.setSize(1000,1000) ;
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true) ;
    }

}  