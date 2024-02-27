
public class Square extends Rectangle{
	private double side;

    public Square() {
        super();
        this.side = 1.0;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square[Shape[color=" + color + ", filled=" + filled + "], side=" + side + "]";
    }

}
