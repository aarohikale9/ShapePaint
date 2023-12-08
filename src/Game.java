import processing.core.PApplet;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Game extends PApplet {
    ArrayList<Shape> shapes = new ArrayList<>();
    // TODO: declare game variables

    Shape s;

    Shape c;


    public void settings() {
        size(800, 800);// set the window size


    }

    public void setup() {
        // TODO: initialize game variables

        background(255); //paint screen white

    }

    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        if (keyPressed == true) {
            if (key == 'b') {
                c = new Circle (mouseX, mouseY);
                shapes.add(c);
                c.draw(this);
            }
        }
    }

    public void mouseReleased() {
        s = new Rect(mouseX, mouseY);
        shapes.add(s);
        s.draw(this);

    }

    public static void main(String[] args) {
        PApplet.main("Game");

    }
    public void writeText() throws IOException {
        PrintWriter writer = new PrintWriter("#Types of Shapes.txt");
        writer.println("Number of types of shapes: ");

        writer.close();
    }
}
