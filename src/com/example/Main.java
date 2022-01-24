package com.example;

import com.example.shapes.CustomShape;
import com.example.shapes.ShapeCoordinates;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import java.util.Random;

public class Main {

    private static JFrame IMAGEFRAME;

    public static void main(String[] args) {
        int w = 940;
        int h = 780;

        JPanel pane = new JPanel();
        pane.setBorder(new EmptyBorder(5,5,5,5));
        pane.setLayout(null);

        JFrame f = new JFrame();
        f.setSize(400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(pane);
        f.setLocationRelativeTo(null);
        f.setAlwaysOnTop(true);

        JLabel lbl1 = new JLabel();
        lbl1.setBounds(0,10,130,30);
        lbl1.setText("R");
        lbl1.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbl1.setHorizontalAlignment(SwingConstants.CENTER);
        pane.add(lbl1);

        JLabel lbl2 = new JLabel();
        lbl2.setBounds(135,10,130,30);
        lbl2.setText("G");
        lbl2.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbl2.setHorizontalAlignment(SwingConstants.CENTER);
        pane.add(lbl2);

        JLabel lbl3 = new JLabel();
        lbl3.setBounds(270,10,130,30);
        lbl3.setText("B");
        lbl3.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbl3.setHorizontalAlignment(SwingConstants.CENTER);
        pane.add(lbl3);

        JTextField txtR = new JTextField();
        txtR.setBounds(10,50,120,30);
        txtR.setFont(new Font("Tahoma",Font.PLAIN,16));
        pane.add(txtR);

        JTextField txtG = new JTextField();
        txtG.setBounds(140,50,120,30);
        txtG.setFont(new Font("Tahoma",Font.PLAIN,16));
        pane.add(txtG);

        JTextField txtB = new JTextField();
        txtB.setBounds(270,50,120,30);
        txtB.setFont(new Font("Tahoma",Font.PLAIN,16));
        pane.add(txtB);

        JButton b = new JButton("Generisi Sliku");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (IMAGEFRAME != null){
                    IMAGEFRAME.dispose();
                }
                generateImage(w,h);
            }
        });
        b.setBounds(20,150,170,50);
        b.setFont(new Font("Tahoma", Font.PLAIN, 15));
        pane.add(b);

        JButton b1 = new JButton("Promeni Pozadinu");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (IMAGEFRAME != null && !txtR.getText().isEmpty() && !txtG.getText().isEmpty() && !txtB.getText().isEmpty()){
                    try{
                        int r = Integer.parseInt(txtR.getText());
                        int g = Integer.parseInt(txtG.getText());
                        int b = Integer.parseInt(txtB.getText());
                        if(r < 255 && g < 255 && b < 255){
                            IMAGEFRAME.getContentPane().setBackground(new Color(r,g,b,40));
                        }else{
                            JOptionPane.showMessageDialog(null, "Brojevi moraju biti manji od 255!");
                        }
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Brojevi moraju biti uneti u pravom formatu!");
                    }
                }
            }
        });
        b1.setBounds(210,150,170,50);
        b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        pane.add(b1);

        f.setVisible(true);
    }

    private static void generateImage(int w, int h){
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(5,5,5,5));
        panel.setLayout(null);
        JFrame f = new JFrame();
        f.setSize(w,h);
        f.setTitle("Random Image");
        Random rnd = new Random();
        f.setContentPane(panel);
        panel.setBackground(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255), 40));
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);

        //DrawingShape ds = new DrawingShape(1);
        //ds.setBounds(0,0,panel.getWidth(),panel.getHeight());
        //panel.add(ds);

        LoadImage loadImage = new LoadImage();
        JLabel lab;
        for(int i=0;i<10;i++){
            lab = loadImage.loadImage();
            panel.add(lab);
        }

        f.setVisible(true);
        IMAGEFRAME = f;
    }



}
