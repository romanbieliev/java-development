package engine;

import javafx.scene.canvas.GraphicsContext;

public class Triangle extends Figure {

    public Triangle(GraphicsContext gc) {
        super(gc);
    }

    public String getName() {
        return "Triangle";
    }

    public void draw(Point[] points) {
        double[] pointsX = new double[points.length];
        double[] pointsY = new double[points.length];

        for (int i = 0; i < points.length; ++i) {
            // pointsX[i] = points[i].getCoordinateX();
            // pointsY[i] = points[i].getCoordinateY();

            System.out.println(pointsX[i]);
        }

        gc.strokePolygon(pointsX, pointsY, points.length);
    }
}
