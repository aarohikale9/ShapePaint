import processing.core.PApplet;

import java.util.ArrayList;

public class Rect extends Shape {


    public Rect(int x, int y, int width, int height) {
        super(50, 200, 150, 50);
    }


    public void draw(PApplet window) {
        window.fill(255,0, 0);
        window.rect(x,y,width,height);
    }


}
