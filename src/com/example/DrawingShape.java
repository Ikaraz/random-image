package com.example;

import com.example.shapes.CustomShape;
import com.example.shapes.ShapeCoordinates;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DrawingShape extends JComponent {
    private int type;


    public DrawingShape(int type) {
        this.type = type;
    }

    private void shape1(Graphics2D g2d){
        List<ShapeCoordinates> list = new ArrayList<>();

        list.add(new ShapeCoordinates( 150,60));
        list.add(new ShapeCoordinates( 170,160));
        list.add(new ShapeCoordinates( 220,130));
        list.add(new ShapeCoordinates( 190,180));
        list.add(new ShapeCoordinates( 280,200));
        list.add(new ShapeCoordinates( 190,220));
        list.add(new ShapeCoordinates( 220,270));
        list.add(new ShapeCoordinates( 170,240));
        list.add(new ShapeCoordinates( 150,380));
        list.add(new ShapeCoordinates( 130,240));
        list.add(new ShapeCoordinates( 80,270));
        list.add(new ShapeCoordinates( 110,220));
        list.add(new ShapeCoordinates( 20,200));
        list.add(new ShapeCoordinates( 110,180));
        list.add(new ShapeCoordinates( 80,130));
        list.add(new ShapeCoordinates( 130,160));

        for(int i=0;i<10;i++){
            new CustomShape(list, g2d);
        }
    }

    private void shape2(Graphics2D g2d){
        List<ShapeCoordinates> list = new ArrayList<>();

        list.add(new ShapeCoordinates(110,10));
        list.add(new ShapeCoordinates(130,10));
        list.add(new ShapeCoordinates(150,30));
        list.add(new ShapeCoordinates(170,10));
        list.add(new ShapeCoordinates(190,10));
        list.add(new ShapeCoordinates(190,30));
        list.add(new ShapeCoordinates(170,50));
        list.add(new ShapeCoordinates(190,70));
        list.add(new ShapeCoordinates(210,70));
        list.add(new ShapeCoordinates(230,90));
        list.add(new ShapeCoordinates(250,70));
        list.add(new ShapeCoordinates(270,70));
        list.add(new ShapeCoordinates(270,90));
        list.add(new ShapeCoordinates(250,110));
        list.add(new ShapeCoordinates(270,130));
        list.add(new ShapeCoordinates(270,150));
        list.add(new ShapeCoordinates(290,170));
        list.add(new ShapeCoordinates(270,190));
        list.add(new ShapeCoordinates(270,210));
        list.add(new ShapeCoordinates(250,230));
        list.add(new ShapeCoordinates(270,250));
        list.add(new ShapeCoordinates(270,270));
        list.add(new ShapeCoordinates(250,270));
        list.add(new ShapeCoordinates(230,250));
        list.add(new ShapeCoordinates(210,270));
        list.add(new ShapeCoordinates(190,270));
        list.add(new ShapeCoordinates(170,290));
        list.add(new ShapeCoordinates(190,310));
        list.add(new ShapeCoordinates(190,330));
        list.add(new ShapeCoordinates(170,330));
        list.add(new ShapeCoordinates(150,310));
        list.add(new ShapeCoordinates(130,330));
        list.add(new ShapeCoordinates(110,330));
        list.add(new ShapeCoordinates(110,310));
        list.add(new ShapeCoordinates(130,290));
        list.add(new ShapeCoordinates(110,270));
        list.add(new ShapeCoordinates(90,270));
        list.add(new ShapeCoordinates(70,250));
        list.add(new ShapeCoordinates(50,270));
        list.add(new ShapeCoordinates(30,270));
        list.add(new ShapeCoordinates(30,250));
        list.add(new ShapeCoordinates(50,230));
        list.add(new ShapeCoordinates(30,210));
        list.add(new ShapeCoordinates(30,190));
        list.add(new ShapeCoordinates(10,170));
        list.add(new ShapeCoordinates(30,150));
        list.add(new ShapeCoordinates(30,130));
        list.add(new ShapeCoordinates(50,110));
        list.add(new ShapeCoordinates(30,90));
        list.add(new ShapeCoordinates(30,70));
        list.add(new ShapeCoordinates(50,70));
        list.add(new ShapeCoordinates(70,90));
        list.add(new ShapeCoordinates(90,70));
        list.add(new ShapeCoordinates(110,70));
        list.add(new ShapeCoordinates(130,50));
        list.add(new ShapeCoordinates(110,30));

        for(int i=0;i<10;i++){
            new CustomShape(list, g2d);
        }
    }

    private void shape3(Graphics2D g2d){
        List<ShapeCoordinates> list = new ArrayList<>();

        list.add(new ShapeCoordinates(160,40));
        list.add(new ShapeCoordinates(190,80));
        list.add(new ShapeCoordinates(170,100));
        list.add(new ShapeCoordinates(190,130));
        list.add(new ShapeCoordinates(180,165));
        list.add(new ShapeCoordinates(210,140));
        list.add(new ShapeCoordinates(240,145));
        list.add(new ShapeCoordinates(250,115));
        list.add(new ShapeCoordinates(300,115));
        list.add(new ShapeCoordinates(280,165));
        list.add(new ShapeCoordinates(250,160));
        list.add(new ShapeCoordinates(235,190));
        list.add(new ShapeCoordinates(200,200));
        list.add(new ShapeCoordinates(235,210));
        list.add(new ShapeCoordinates(250,240));
        list.add(new ShapeCoordinates(280,235));
        list.add(new ShapeCoordinates(300,285));
        list.add(new ShapeCoordinates(250,285));
        list.add(new ShapeCoordinates(240,255));
        list.add(new ShapeCoordinates(210,260));
        list.add(new ShapeCoordinates(180,235));
        list.add(new ShapeCoordinates(190,270));
        list.add(new ShapeCoordinates(170,300));
        list.add(new ShapeCoordinates(190,320));
        list.add(new ShapeCoordinates(160,360));
        list.add(new ShapeCoordinates(130,320));
        list.add(new ShapeCoordinates(150,300));
        list.add(new ShapeCoordinates(130,270));
        list.add(new ShapeCoordinates(140,235));
        list.add(new ShapeCoordinates(110,260));
        list.add(new ShapeCoordinates(80,255));
        list.add(new ShapeCoordinates(70,285));
        list.add(new ShapeCoordinates(20,285));
        list.add(new ShapeCoordinates(40, 235));
        list.add(new ShapeCoordinates(70,240));
        list.add(new ShapeCoordinates(85,210));
        list.add(new ShapeCoordinates(120,200));
        list.add(new ShapeCoordinates(85,190));
        list.add(new ShapeCoordinates(70,160));
        list.add(new ShapeCoordinates(40,165));
        list.add(new ShapeCoordinates(20,115));
        list.add(new ShapeCoordinates(70,115));
        list.add(new ShapeCoordinates(80,145));
        list.add(new ShapeCoordinates(110,140));
        list.add(new ShapeCoordinates(140,165));
        list.add(new ShapeCoordinates(130,130));
        list.add(new ShapeCoordinates(150,100));
        list.add(new ShapeCoordinates(130,80));

        for(int i=0;i<10;i++){
            new CustomShape(list, g2d);
        }
    }

    private void shape4(Graphics2D g2d){
        List<ShapeCoordinates> list = new ArrayList<>();

        list.add(new ShapeCoordinates(150,100));
        list.add(new ShapeCoordinates(160,110));
        list.add(new ShapeCoordinates(170,100));
        list.add(new ShapeCoordinates(180,110));
        list.add(new ShapeCoordinates(180,120));
        list.add(new ShapeCoordinates(190,110));
        list.add(new ShapeCoordinates(200,110));
        list.add(new ShapeCoordinates(200,120));
        list.add(new ShapeCoordinates(210,120));
        list.add(new ShapeCoordinates(210,130));
        list.add(new ShapeCoordinates(200,140));
        list.add(new ShapeCoordinates(210,140));
        list.add(new ShapeCoordinates(220,150));
        list.add(new ShapeCoordinates(210,160));
        list.add(new ShapeCoordinates(220,170));
        list.add(new ShapeCoordinates(210,180));
        list.add(new ShapeCoordinates(200,180));
        list.add(new ShapeCoordinates(210,190));
        list.add(new ShapeCoordinates(210,200));
        list.add(new ShapeCoordinates(200,200));
        list.add(new ShapeCoordinates(200,210));
        list.add(new ShapeCoordinates(190,210));
        list.add(new ShapeCoordinates(180,200));
        list.add(new ShapeCoordinates(180,210));
        list.add(new ShapeCoordinates(170,220));
        list.add(new ShapeCoordinates(160,210));
        list.add(new ShapeCoordinates(150,220));
        list.add(new ShapeCoordinates(140,210));
        list.add(new ShapeCoordinates(140,200));
        list.add(new ShapeCoordinates(130,210));
        list.add(new ShapeCoordinates(120,210));
        list.add(new ShapeCoordinates(120,200));
        list.add(new ShapeCoordinates(110,200));
        list.add(new ShapeCoordinates(110,190));
        list.add(new ShapeCoordinates(120,180));
        list.add(new ShapeCoordinates(110,180));
        list.add(new ShapeCoordinates(100,170));
        list.add(new ShapeCoordinates(110,160));
        list.add(new ShapeCoordinates(100,150));
        list.add(new ShapeCoordinates(110,140));
        list.add(new ShapeCoordinates(120,140));
        list.add(new ShapeCoordinates(110,130));
        list.add(new ShapeCoordinates(110,120));
        list.add(new ShapeCoordinates(120,120));
        list.add(new ShapeCoordinates(120,110));
        list.add(new ShapeCoordinates(130,110));
        list.add(new ShapeCoordinates(140,120));
        list.add(new ShapeCoordinates(140,110));

        for(int i=0;i<10;i++){
            new CustomShape(list, g2d);
        }
    }

    private void shape5(Graphics2D g2d){
        List<ShapeCoordinates> list = new ArrayList<>();

        list.add(new ShapeCoordinates(230,110));
        list.add(new ShapeCoordinates(240,120));
        list.add(new ShapeCoordinates(240,160));
        list.add(new ShapeCoordinates(310,110));
        list.add(new ShapeCoordinates(260,170));
        list.add(new ShapeCoordinates(300,170));
        list.add(new ShapeCoordinates(310,180));
        list.add(new ShapeCoordinates(300,190));
        list.add(new ShapeCoordinates(260,190));
        list.add(new ShapeCoordinates(310,260));
        list.add(new ShapeCoordinates(240,200));
        list.add(new ShapeCoordinates(240,240));
        list.add(new ShapeCoordinates(230,250));
        list.add(new ShapeCoordinates(220,240));
        list.add(new ShapeCoordinates(220,200));
        list.add(new ShapeCoordinates(150,260));
        list.add(new ShapeCoordinates(200,190));
        list.add(new ShapeCoordinates(160,190));
        list.add(new ShapeCoordinates(150,180));
        list.add(new ShapeCoordinates(160,170));
        list.add(new ShapeCoordinates(200,170));
        list.add(new ShapeCoordinates(150,110));
        list.add(new ShapeCoordinates(220,160));
        list.add(new ShapeCoordinates(220,120));

        for(int i=0;i<10;i++){
            new CustomShape(list, g2d);
        }
    }

    private void shape6(Graphics2D g2d){
        List<ShapeCoordinates> list = new ArrayList<>();

        list.add(new ShapeCoordinates(300,100));
        list.add(new ShapeCoordinates(310,120));
        list.add(new ShapeCoordinates(300,140));
        list.add(new ShapeCoordinates(300,170));
        list.add(new ShapeCoordinates(310,160));
        list.add(new ShapeCoordinates(310,210));
        list.add(new ShapeCoordinates(300,230));
        list.add(new ShapeCoordinates(300,240));
        list.add(new ShapeCoordinates(310,245));
        list.add(new ShapeCoordinates(320,240));
        list.add(new ShapeCoordinates(330,220));
        list.add(new ShapeCoordinates(370,200));
        list.add(new ShapeCoordinates(360,220));
        list.add(new ShapeCoordinates(400,200));
        list.add(new ShapeCoordinates(410,180));
        list.add(new ShapeCoordinates(430,180));
        list.add(new ShapeCoordinates(420,200));
        list.add(new ShapeCoordinates(400,200));
        list.add(new ShapeCoordinates(360,220));
        list.add(new ShapeCoordinates(380,220));
        list.add(new ShapeCoordinates(340,240));
        list.add(new ShapeCoordinates(320,240));
        list.add(new ShapeCoordinates(310,245));
        list.add(new ShapeCoordinates(310,255));
        list.add(new ShapeCoordinates(320,260));
        list.add(new ShapeCoordinates(340,260));
        list.add(new ShapeCoordinates(380,280));
        list.add(new ShapeCoordinates(360,280));
        list.add(new ShapeCoordinates(400,300));
        list.add(new ShapeCoordinates(420,300));
        list.add(new ShapeCoordinates(430,320));
        list.add(new ShapeCoordinates(410,320));
        list.add(new ShapeCoordinates(400,300));
        list.add(new ShapeCoordinates(360,280));
        list.add(new ShapeCoordinates(370,300));
        list.add(new ShapeCoordinates(330,280));
        list.add(new ShapeCoordinates(320,260));
        list.add(new ShapeCoordinates(310,255));
        list.add(new ShapeCoordinates(300,260));
        list.add(new ShapeCoordinates(300,270));
        list.add(new ShapeCoordinates(310,290));
        list.add(new ShapeCoordinates(310,340));
        list.add(new ShapeCoordinates(300,320));
        list.add(new ShapeCoordinates(300,360));
        list.add(new ShapeCoordinates(310,380));
        list.add(new ShapeCoordinates(300,400));
        list.add(new ShapeCoordinates(290,380));
        list.add(new ShapeCoordinates(300,360));
        list.add(new ShapeCoordinates(300,320));
        list.add(new ShapeCoordinates(290,340));
        list.add(new ShapeCoordinates(290,290));
        list.add(new ShapeCoordinates(300,270));
        list.add(new ShapeCoordinates(300,260));
        list.add(new ShapeCoordinates(290,255));
        list.add(new ShapeCoordinates(280,260));
        list.add(new ShapeCoordinates(270,280));
        list.add(new ShapeCoordinates(230,300));
        list.add(new ShapeCoordinates(240,280));
        list.add(new ShapeCoordinates(200,300));
        list.add(new ShapeCoordinates(190,320));
        list.add(new ShapeCoordinates(170,320));
        list.add(new ShapeCoordinates(180,300));
        list.add(new ShapeCoordinates(200,300));
        list.add(new ShapeCoordinates(240,280));
        list.add(new ShapeCoordinates(220,280));
        list.add(new ShapeCoordinates(260,260));
        list.add(new ShapeCoordinates(280,260));
        list.add(new ShapeCoordinates(290,255));
        list.add(new ShapeCoordinates(290,245));
        list.add(new ShapeCoordinates(280,240));
        list.add(new ShapeCoordinates(260,240));
        list.add(new ShapeCoordinates(220,220));
        list.add(new ShapeCoordinates(240,220));
        list.add(new ShapeCoordinates(200,200));
        list.add(new ShapeCoordinates(180,200));
        list.add(new ShapeCoordinates(170,180));
        list.add(new ShapeCoordinates(190,180));
        list.add(new ShapeCoordinates(200,200));
        list.add(new ShapeCoordinates(240,220));
        list.add(new ShapeCoordinates(230,200));
        list.add(new ShapeCoordinates(270,220));
        list.add(new ShapeCoordinates(280,240));
        list.add(new ShapeCoordinates(290,245));
        list.add(new ShapeCoordinates(300,240));
        list.add(new ShapeCoordinates(300,230));
        list.add(new ShapeCoordinates(290,210));
        list.add(new ShapeCoordinates(290,160));
        list.add(new ShapeCoordinates(300,170));
        list.add(new ShapeCoordinates(300,140));
        list.add(new ShapeCoordinates(290,120));

        for(int i=0;i<10;i++){
            new CustomShape(list, g2d);
        }
    }

    private void shape7(Graphics2D g2d){
        List<ShapeCoordinates> list = new ArrayList<>();

        /*list.add(new ShapeCoordinates(26,12));
        list.add(new ShapeCoordinates(28,15));
        list.add(new ShapeCoordinates(27,16));
        list.add(new ShapeCoordinates(29,23));
        list.add(new ShapeCoordinates(32,20));
        list.add(new ShapeCoordinates(31,24));
        list.add(new ShapeCoordinates(38,22));
        list.add(new ShapeCoordinates(38,21));
        list.add(new ShapeCoordinates(42,21));
        list.add(new ShapeCoordinates(40,24.5));
        list.add(new ShapeCoordinates(39,24));
        list.add(new ShapeCoordinates(34.5,29));
        list.add(new ShapeCoordinates(39,30));
        list.add(new ShapeCoordinates(34.5,31));
        list.add(new ShapeCoordinates(39,36));
        list.add(new ShapeCoordinates(40,35.5));
        list.add(new ShapeCoordinates(42,40));
        list.add(new ShapeCoordinates(38,40));
        list.add(new ShapeCoordinates(38,39));
        list.add(new ShapeCoordinates(31,36));
        list.add(new ShapeCoordinates(32,41));
        list.add(new ShapeCoordinates(29,38));
        list.add(new ShapeCoordinates(27,45));
        list.add(new ShapeCoordinates(28,46));
        list.add(new ShapeCoordinates(26,49));
        list.add(new ShapeCoordinates(24,46));
        list.add(new ShapeCoordinates(25,45));
        list.add(new ShapeCoordinates(23,38));
        list.add(new ShapeCoordinates(20,41));
        list.add(new ShapeCoordinates(21,36));
        list.add(new ShapeCoordinates(14,39));
        list.add(new ShapeCoordinates(14,40));
        list.add(new ShapeCoordinates(10,40));
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());
        list.add(new ShapeCoordinates());*/

        for(int i=0;i<10;i++){
            new CustomShape(list, g2d);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        switch (type){
            case 1: shape1(g2d); shape2(g2d); shape3(g2d); shape4(g2d); shape5(g2d); shape6(g2d); break;
        }

        /*Ellipse2D.Double e = new Ellipse2D.Double(15,20,200,50);
        g2d.setColor(Color.DARK_GRAY);
        g2d.fill(e);

        Path2D.Double p = new Path2D.Double();
        p.moveTo(400, 200);
        p.curveTo(500,500, 700, 550, 700,400);
        //g2d.rotate(Math.toRadians(-20));
        g2d.fill(p);*/




        /*Path2D.Double p2 = new Path2D.Double();
        p2.moveTo(21.42 * 30,16.86 * 30);
        p2.lineTo(18.88 * 30,10.16 * 30);
        p2.lineTo(25.06 * 30,14.38 * 30);
        p2.lineTo(18.06 * 30,14.44 * 30);
        p2.lineTo(23.78 * 30,10.12 * 30);
        g2d.setColor(new Color(222,222,32,50));

        g2d.fill(p2);

        /*g2d.rotate(Math.toRadians(20));
        Rectangle2D.Double r = new Rectangle2D.Double(50,75,100,250);
        g2d.setColor(Color.BLUE);
        g2d.fill(r);*/

    }
}
