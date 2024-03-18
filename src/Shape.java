import processing.core.PApplet;

public abstract class Shape implements IShape {
    private float xPos;
    private float yPos;
    private float dimension;
    protected PApplet pApplet;

    public Shape(float xPos, float yPos, float dimension, PApplet pApplet) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.dimension = dimension;
        this.pApplet = pApplet;
    }


    public float getX() {
        return xPos;
    }

    public void setX(float xPos) {
        this.xPos = xPos;
    }
    public void moveRight(int steps) {
        this.xPos += steps;
    }
    public void moveLeft(int steps) {
        this.xPos -= steps;
    }
    public void moveUp(int steps) {
        this.yPos -= steps;
    }
    public void moveDown(int steps) {
        this.yPos += steps;
    }
    public float getY() {
        return yPos;
    }

    public void setY(float yPos) {
        this.yPos = yPos;
    }

    public float getDimension() {
        return dimension;
    }

    public void setDimension(float dimension) {
        this.dimension = dimension;
    }
}
