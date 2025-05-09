//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Drawing d = new Drawing();
        d.addShape(new Triangle());
        d.addShape(new Rectangle());

        CompoundShape cs = new CompoundShape();
        cs.addShape(new Rectangle());
        cs.addShape(new Rectangle());
        cs.addShape(new Circle());

        d.addShape(cs);

        d.draw(0, "yellow"); // Triangle
        d.draw(2, "yellow"); // CompoundShape: Rectangle, Rectangle, Circle
    }
}