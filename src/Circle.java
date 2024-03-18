import processing.core.PApplet;

public class Circle extends Shape{
    public Circle(float xPos, float yPos, float dimension, PApplet pApplet) {
        super(xPos, yPos, dimension, pApplet);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void displayShape() {
        pApplet.ellipse(getX(),getY(),getDimension(),getDimension());

    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
