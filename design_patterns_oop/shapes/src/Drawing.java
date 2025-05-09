import java.util.ArrayList;
import java.util.List;

class Drawing  {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s) {
        this.shapes.add(s);
    }

    public void draw(int what, String fillColor) {
        if (what >= 0 && what < shapes.size()) {
            shapes.get(what).drow(fillColor);
        } else {
            System.out.println("Nieprawidłowy indeks: " + what);
        }
    }


    public void drow(String fillColor) {
        for (Shape s : shapes) {
            s.drow(fillColor);
        }
    }
}