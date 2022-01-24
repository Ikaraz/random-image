package com.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class LoadImage {

    public LoadImage() {

    }

    private String pickImage(){
        List<String> list = new ArrayList<>();
        list.add("lib/trouglovi/1.png");
        list.add("lib/trouglovi/2.png");
        list.add("lib/trouglovi/3.png");
        list.add("lib/trouglovi/4.png");
        list.add("lib/trouglovi/5.png");
        list.add("lib/trouglovi/6.png");
        list.add("lib/trouglovi/7.png");

        Random rnd = new Random();
        int index = rnd.nextInt(list.size());
        return list.get(index);
    }

    public JLabel loadImage() {
        // Slike razlicitih velicina i boja i pod razlicitim uglom, iz razlicitih foldera da povlaci i na razlicita mesta da postavlja na frame
        JLabel l = null;
        try {
            BufferedImage img = ImageIO.read(new File(pickImage()));
            /*BufferedImage img1 = new BufferedImage(400,400,BufferedImage.TYPE_INT_RGB);
            Graphics2D gr = img1.createGraphics();
            RenderingHints rh = new RenderingHints(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            gr.setRenderingHints(rh);
            gr.drawImage(img,0,0,400,400,null);*/

            img = changeImgAlpha(img);

            Random rnd = new Random();
            int posX = rnd.nextInt(1000) - 50;
            int posY = rnd.nextInt(800) - 50;

            l = new JLabel(new ImageIcon(img));
            l.setBounds(posX,posY,img.getWidth(),img.getHeight());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return l;
    }

    private BufferedImage changeImgAlpha(BufferedImage img){
        for(int x=0;x<img.getWidth();x++){
            for(int y=0;y<img.getHeight();y++){
                Color pixel = new Color(img.getRGB(x,y));
                int r = pixel.getRed();
                int g = pixel.getGreen();
                int b = pixel.getBlue();
                if(r!=b && r!=g){
                    img.setRGB(x,y,new Color(r,g,b,70).getRGB());
                }
            }
        }
        return img;
    }
}
