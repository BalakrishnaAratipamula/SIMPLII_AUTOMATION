package Java_Examples;

//Shape interface (open for extension)
interface Shape {
 double area();
}

//Rectangle implements Shape
class Rectangle implements Shape {
 int length, width;
 Rectangle(int l, int w) { length = l; width = w; }
 public double area() { return length * width; }
}

//Circle implements Shape
class Circle implements Shape {
 int radius;
 Circle(int r) { radius = r; }
 public double area() { return Math.PI * radius * radius; }
}

//Area calculator uses Shape interface
class AreaCalculator {
 double calculateArea(Shape shape) {
     return shape.area();
 }
}

//Test
public class OpenClosedPrinciple {
 public static void main(String[] args) {
     Shape rect = new Rectangle(5, 10);
     Shape circle = new Circle(3);
     AreaCalculator calc = new AreaCalculator();

     System.out.println(calc.calculateArea(rect));    // 50.0
     System.out.println(calc.calculateArea(circle));  // 28.27
 }
}
