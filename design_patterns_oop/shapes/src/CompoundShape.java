import java.util.ArrayList;
import java.util.List;
class CompoundShape implements Shape {
    private List<Shape> elements = new ArrayList<>();

    public void addShape(Shape s) {
        this.elements.add(s);
    }

    public void drow(String fillColor) {
        for (Shape s : elements) {
            s.drow(fillColor);
        }
    }
}