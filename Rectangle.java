// Rectangle.java
public class Rectangle extends Shape {
    private final double width;
    private final double height;

    // Конструктор
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // Реализация метода getArea для прямоугольника
    public double getArea() {
        return width * height; // Площадь прямоугольника: w * h
    }
}


