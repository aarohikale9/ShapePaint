import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;

public class Triangle{
    int red;
    int blue;
    int green;

    public Triangle(int x, int y) {
        red = (int) (Math.random()*255);
        green = (int) (Math.random()*255);
        blue = (int) (Math.random()*255);
    }
    public void draw(PApplet window, PImage img) {
        window.fill(red, blue, green);
        window.image(img, red, blue);
    }

}
