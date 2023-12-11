import processing.core.PApplet;
public class Circle extends Shape {
    private int red;
    private int blue;
    private int green;


    public Circle(int x, int y) {
        super(150, 150);
        this.x  = x;
        this.y = y;
        this.red = (int) (Math.random()*255);
        this.green = (int) (Math.random()*255);
        this.blue = (int) (Math.random() * 255);
    }

    @Override
    public void draw(PApplet window) {
        window.fill(red, green, blue);
        window.ellipse(x, y, width, height);
    }
}
