import processing.core.PApplet;

import java.util.ArrayList;

public class Game extends PApplet {
    ArrayList<Shape> shapes = new ArrayList<>();
    // TODO: declare game variables

    int x;
    int y;
    int width;
    int height;

    Shape s;


    public void settings() {
        size(800, 800);// set the window size


    }

    public void setup() {
        // TODO: initialize game variables

        int x = mouseX;
        int y = mouseY;

        s = new Rect(x, y, width, height);
        shapes.add(s);
    }

    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        background(255);    // paint screen white

    }

    public void mousePressed() {
        s.draw(this);
    }


    public static void main(String[] args) {
        PApplet.main("Game");
    }
}
