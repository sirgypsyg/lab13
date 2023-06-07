package org.example;

import javax.imageio.ImageIO;
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
    }

    public void saveImage(String path) throws IOException {
        File file = new File(path);
        ImageIO.write(image, "png", new File(path));
    }
}
