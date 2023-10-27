import processing.core.PApplet;

public class Rect extends Shape {

    public Rect(int x, int y) {
        super(150, 50);
        this.x = x;
        this.y = y;
    }


    public void draw(PApplet window) {
        window.fill(255,0, 0);
        window.rect(x,y,width,height);
    }


}
