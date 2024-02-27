
public class TestShape {
	public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5.0, "red", false);
        shapes[1] = new Rectangle(4.0, 6.0, "green", true);
        shapes[2] = new Square(3.0, "blue", false);
        shapes[3] = new Shape() {
            @Override
            public double getArea() {
                return 10.0;
            }

            @Override
            public double getPerimeter() {
                return 14.0;
            }

            @Override
            public String toString() {
                return "Hình dạng không xác định";
            }
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Diện tích: " + shape.getArea());
            System.out.println("Chu vi: " + shape.getPerimeter());
            System.out.println();
        }
    }
}
