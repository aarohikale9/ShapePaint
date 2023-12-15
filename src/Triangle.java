import com.sun.beans.editors.ColorEditor;
import processing.core.PApplet;
import processing.core.PImage;
import sun.java2d.cmm.ColorTransform;

import java.awt.*;

public class Triangle extends Shape{

    PImage img;
    public Triangle(int x, int y, PImage img) {
        super(50, 50);
        this.x = x;
        this.y = y;
        this.img = img;




    }

    @Override
    public void draw(PApplet window) {
        window.image(img, x, y, width, height);
    }
}
