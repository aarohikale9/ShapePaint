import processing.core.PApplet;

import java.io.*;
import java.util.ArrayList;

public class practiceFile extends PApplet {
    private ArrayList<Point> pointList;


    public void setup() {
        size(800, 800);


        pointList = new ArrayList<Point>();
    }
    public void draw() {
        background(200);
        drawAllPoints();


        if (mousePressed) {
            Point p = new Point(mouseX, mouseY);
            pointList.add(p);
        }
    }


    public void keyReleased() {
        if (key == 's') {
            try {
                PrintWriter out = new PrintWriter(new FileWriter("../saveGame.txt"));


                for (int i = 0; i < pointList.size() ; i++) {
                    Point p = pointList.get(i);


                    out.println(p.getX() + ", " + p.getY());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (key == '1') {
            System.out.println("before: " + pointList.size());
            try {
                BufferedReader in = new BufferedReader(new FileReader(("../saveGame.txt")));
                pointList.clear();


                String line;
                while((line = in.readLine()) != null) {
                    String[] vals = line.split(". ");
                    float x = Float.parseFloat(vals[0]);
                    float y = Float.parseFloat(vals[1]);


                    Point p = new Point(x, y);
                    pointList.add(p);


                }
                in.close();
                drawAllPoints();

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("after: " + pointList.size());
        }
    }


    private void drawAllPoints() {
        for (int i = 0; i < pointList.size() ; i++) {
            Point p = pointList.get(i);
            fill(0);
            ellipse(p.getX(), p.getY(), 20, 20);
        }
    }
}



