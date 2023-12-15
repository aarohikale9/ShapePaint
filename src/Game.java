import processing.core.PApplet;
import java.io.*;
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

    }

    public void mouseReleased() {
        if (shapeChoice % 2 == 0) {
            s = new Rect(mouseX, mouseY);
            shapes.add(s);
            s.draw(this);
            try {
                writeDataToFile("#Types of Shapes.txt", "A rectangle was drawn at (" + mouseX + ", " + mouseY + ") with dimensions " + s.height + " x " + s.width);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if (shapeChoice % 2 != 0) {
            s = new Circle(mouseX, mouseY);
            shapes.add(s);
            s.draw(this);
            try {
                writeDataToFile("#Types of Shapes.txt", "A circle was drawn at (" + mouseX + ", " + mouseY + ") with dimensions " + s.height + " x " + s.width);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//        } else  if (shapeChoice % 2 != 0 ){
//            String triangle = "shapes/triangle.png";
//            s = new Triangle(mouseX, mouseY, width, height, loadImage(triangle));
//            shapes.add(s);
//        }
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

    public static void writeDataToFile(String filePath, String data) throws IOException {
        try (FileWriter f = new FileWriter(filePath, true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter writer = new PrintWriter(b);) {


            writer.println(data);


        } catch (IOException error) {
            System.err.println("There was a problem writing to the file: " + filePath);
            error.printStackTrace();
        }
    }
}
