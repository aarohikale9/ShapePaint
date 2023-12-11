import processing.core.PApplet;

import java.util.ArrayList;


public class Shape {
    protected int x, y;
    protected int width, height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw (PApplet window) {
        if (window.keyPressed) {
            if (window.key == window.CODED) {
                if (window.keyCode == window.UP) {
                    this.height+=5;
                }
                if (window.keyCode == window.DOWN) {
                    this.height-=5;
                }

                if (window.keyCode == window.RIGHT) {
                    this.width+=5;
                }

                if (window.keyCode == window.LEFT) {
                    this.width-=5;
                }
            }
        }
    }


}
