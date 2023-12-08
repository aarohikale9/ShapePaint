import processing.core.PApplet;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Game extends PApplet {
    ArrayList<Shape> shapes = new ArrayList<>();
    // TODO: declare game variables
    Shape s;
    int shapeChoice;

    public void settings() {
        size(800, 800);// set the window size

    }

    public void setup() {
        // TODO: initialize game variables
        background(255); //paint screen white
        shapeChoice = 1;


    }

    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        if (keyPressed == true) {
            if (key == CODED) {
                if (keyCode == UP) {
                    shapeLength++;
                }
                if (keyCode == DOWN) {
                    shapeLength--;
                }

                if (keyCode == RIGHT) {
                    shapeWidth++;
                }

                if (keyCode == LEFT) {
                    shapeWidth--;
                }
            }
        }
    }

    public void mouseReleased() {
        if (shapeChoice % 2 == 0) {
            s = new Rect(mouseX, mouseY);
            shapes.add(s);
            s.draw(this);
        } else if (shapeChoice % 2 != 0) {
            s = new Circle (mouseX, mouseY);
            shapes.add(s);
            s.draw(this);
        }

    }

    public void keyReleased() {
       if (key == 'b') {
          shapeChoice++;
       }

       if (key == 'c') {
           background(255);
       }
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
