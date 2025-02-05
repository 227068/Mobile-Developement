public class Main {
    public static void main(String[] args) {
        // Создаем объекты Circle и Rectangle
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Вычисляем и выводим площади
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
    }
}
