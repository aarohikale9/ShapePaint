import processing.core.PApplet;

public class Rect extends Shape {

    int red, green, blue;
    public Rect(int x, int y) {
        super(150, 50);
        this.x = x;
        this.y = y;
        red = (int) (Math.random()*255);
        green = (int) (Math.random()*255);
        blue = (int) (Math.random()*255);
    }


    public void draw(PApplet window) {
        window.fill(255,0, 0);
        window.rect(x,y,width,height);
    }


}
