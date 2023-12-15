import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;

public class Triangle extends Shape{
    PImage img;
    public Triangle(int x, int y, int width, int height, PImage img) {
        super(width, height);
        this.x = x;
        this.y = y;
        this.img = img;
    }

    @Override
    public void draw(PApplet window) {
        window.image(img, x, y, width, height);
    }
}
