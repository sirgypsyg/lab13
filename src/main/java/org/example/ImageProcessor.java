package org.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageProcessor {
    private BufferedImage image;
    private int width;
    private int height;

    public void loadImage(String path) throws IOException {
        File file = new File(path);
        image = ImageIO.read(file);
        height = image.getHeight();
        width = image.getWidth();
        int color = image.getRGB(0, 0);

//        int r = (color >> 16) & 0xff;
//        int g = (color >> 8) & 0xff;
//        int b = color & 0xff;
//
//        r+=100;
//        g+=100;
//        b+=100;
//
//        int result = (r << 16) | (g << 8) | b;
//
//        image.setRGB(0,0,result);

        Color color1 = new Color(color);
        color1.getRed();


        new Color(color1.getBlue(), color1.getRed(), color1.getBlue());
    }
    public void saveImage(String path) throws IOException {
        File file = new File(path);
        ImageIO.write(image, "png", new File(path));
    }

    public int getPixelAfterBright(int oldColor, int factor){
        return 0;
    }

    public void setBrightness(int factor) {
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                Color color = new Color(image.getRGB(x,y));

                int red = color.getRed() + factor;
                int green = color.getGreen() + factor;
                int blue = color.getBlue() + factor;

                red = Math.max(0, Math.min(255, red));
                green = Math.max(0, Math.min(255, green));
                blue = Math.max(0, Math.min(255, blue));

                Color newColor = new Color(red, green, blue);
                image.setRGB(x, y, newColor.getRGB());

            }
        }
    }

}
