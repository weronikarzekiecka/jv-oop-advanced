package core.basesyntax;

class Rectangle extends Figure {
    double width, height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq. units, width: "
                + width + " units, height: "
                + height + " units, color: " + color);
    }
}
