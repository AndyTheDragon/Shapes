import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {
    ArrayList<Shape> shapes = new ArrayList<>();
    public void draw() {
        background(0);
        for (Shape shape : shapes) {
            shape.moveRight(10);
            shape.displayShape();
        }
        ArrayList<ArrayList<Shape>> listInList = new ArrayList<>();
        listInList.add(shapes);
    }
    public void settings() {
        size(760, 900);
    }

    public void setup() {
        Shape c = new Circle(30, 100, 300, this);
        Shape r = new Rectangle(100,30,200, this);
        shapes.add(c);
        shapes.add(r);

    }
    public static void main(String[] args) {
        String[] appletArgs = new String[]{"Main"};
        PApplet.main(appletArgs);
    }
}
