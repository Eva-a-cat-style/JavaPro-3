package Figures;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Triangle(4, 6),
                new Square(3)
        };


        double totalArea = calculateTotalArea(shapes);


        System.out.println("Сумарна площа всіх фігур: " + totalArea);
    }

    public static double calculateTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }
}

