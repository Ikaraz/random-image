package com.example.shapes;

import java.awt.*;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomShape extends Path2D.Double {
    private List<ShapeCoordinates> list;
    private Graphics2D g2d;

    public CustomShape(List<ShapeCoordinates> list, Graphics2D g2d) {
        this.list = list;
        this.g2d = g2d;
        createShape(list, g2d);
    }

    private void createShape(List<ShapeCoordinates> list, Graphics2D g2d){
        Random rnd = new Random();
        int posX = rnd.nextInt(1000) - 50;
        int posY = rnd.nextInt(800) - 50;
        double size = (double) rnd.nextInt(30) / 10;
        int r = rnd.nextInt(255);
        int g = rnd.nextInt(255);
        int b = rnd.nextInt(255);
        int alpha = rnd.nextInt(40) + 30;
        this.moveTo(posX,posY);
        double diffX = posX - list.get(0).getX() * size;
        double diffY = posY - list.get(0).getY() * size;
        for(int i=1;i<list.size();i++){
            this.lineTo(list.get(i).getX() * size + diffX, list.get(i).getY() * size + diffY);
        }
        g2d.setColor(new Color(r,g,b,alpha));
        g2d.rotate(Math.toRadians(rnd.nextInt(100) - 50));
        g2d.fill(this);
    }
}
