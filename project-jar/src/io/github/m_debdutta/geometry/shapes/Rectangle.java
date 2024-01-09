public class Rectangle implements TwoDShapes{
  private double length;
  private double breadth;

  public Rectangle(double side) {
    this(side, side);
  }

  public Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public double area() {
    return this.length * this.breadth;
  }

  public double perimeter() {
    return 2 * (this.length + this.breadth);
  }
}