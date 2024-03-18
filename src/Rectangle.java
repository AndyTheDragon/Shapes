import processing.core.PApplet;
public class Rectangle extends Shape {
    public Rectangle(float xPos, float yPos, float height, PApplet pApplet) {
        super(xPos, yPos, height, pApplet);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void displayShape() {
        pApplet.rect(getX(),getY(), getDimension(), getDimension());
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
