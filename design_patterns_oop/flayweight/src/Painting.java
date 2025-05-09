public class Painting {
    private static ShapeFactory.ShapeType[] shapes = {
            ShapeFactory.ShapeType.LINE,
            ShapeFactory.ShapeType.OVAL_FILL,
            ShapeFactory.ShapeType.OVAL_NO_FILL
    };

    private String[] colors = {"red", "blue", "green", "orange", "violet"};
    private int areaWidth = 100;
    private int areaHeight = 100;

    public Painting(int width, int height) {
        areaWidth = width;
        areaHeight = height;
    }

    public void paint() {
        for(int i=0 ; i<10;i++) {
            Shape shape = ShapeFactory.getShape(getRandomShape());
            int[] params = getShapeParams();
            String color = getRandomColor();

            shape.draw(params[0], params[1], params[2], params[3], color);
            System.out.println("------------------");
        }
    }

    private ShapeFactory.ShapeType getRandomShape() {
        int i = (int)(Math.random() * shapes.length);
        return shapes[i];
    }

    private String getRandomColor() {
        int i = (int)(Math.random() * colors.length);
        return colors[i];
    }

    private int[] getShapeParams() {
        int x = (int)(Math.random() * areaWidth);
        int y = (int)(Math.random() * areaHeight);
        int w = (int)(Math.random() * areaWidth);
        int h = (int)(Math.random() * areaHeight);

        return new int[]{x, y, w, h};
    }
}
