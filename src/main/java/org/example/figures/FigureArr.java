package org.example.figures;

import org.example.figures.AbstractFigure;

public class FigureArr {

    private AbstractFigure[] figuresArr;
    private int count;

    public FigureArr() {
        this.figuresArr = new AbstractFigure[10];
        this.count = 0;
    }

    public FigureArr(AbstractFigure[] figures) {
        this.figuresArr = figures;
        this.count = figuresArr.length;
    }

    public void add(AbstractFigure figure) {
        if (count == figuresArr.length) throw new ArrayIndexOutOfBoundsException();
        figuresArr[count] = figure;
        count++;
    }

    public void showPerimeter(AbstractFigure... figures) {
        for (AbstractFigure figure : figures) {
            System.out.println(figure.perimeter());
        }
    }

    public AbstractFigure getFigureWithMaxPerimeter(AbstractFigure... figures) {
        AbstractFigure figureWithMaxPerimeter = figures[0];
        for (AbstractFigure figure : figures) {
            if (figure.perimeter() > figureWithMaxPerimeter.perimeter()) {
                figureWithMaxPerimeter = figure;
            }
        }
        return figureWithMaxPerimeter;
    }
}
