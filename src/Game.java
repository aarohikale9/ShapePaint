import processing.core.PApplet;

import java.util.ArrayList;

public class Game extends PApplet {
    ArrayList<Shape> shapes = new ArrayList<>();
    // TODO: declare game variables

    Shape s;


    public void settings() {
        size(800, 800);// set the window size

    }

    public void setup() {
        // TODO: initialize game variables

        background(255);    // paint screen white

    }

    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
    }

    public void mouseReleased() {
        s = new Rect(mouseX, mouseY);
        shapes.add(s);
        s.draw(this);
    }


    public static void main(String[] args) {
        PApplet.main("Game");
    }
}
