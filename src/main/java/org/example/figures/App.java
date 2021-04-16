package org.example.figures;

public class App {

    public static void main(String[] args) {

        Circle circle = new Circle(1, 2, 5);
        Rectangle rectangle = new Rectangle(4, 6);

        AbstractFigure[] figures = {circle, rectangle};

        FigureArr figureArr = new FigureArr(figures);

        for (int i = 0; i < figures.length; i++) {
            figures[i].show();
        } // Circle  p = 31.41592653589793  s = 78.53981633974483  Rectangle  p = 20.0  s = 24.0  31.41592653589793

        figureArr.showPerimeter(figures); // 31.41592653589793  20.0

        figureArr.getFigureWithMaxPerimeter(figures).show(); // Circle  p = 31.41592653589793  s = 78.53981633974483
    }
}
