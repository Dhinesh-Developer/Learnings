import java.util.*;
// VIOLATION : Adding a new shape breaks this class

class BadAreaCalculator{
    public double calculateArea(Object shape){
        if(shape instanceof BadRectangle){
            BadRectangle r = (BadRectangle) shape;
            return r.width * r.height;
        }else if(shape instanceof BadCircle){ // Modifying working code to add Circle
            BadCircle c = (BadCircle) shape;
            return Math.PI * c.radius;
        }
        return 0;
    }
}

class BadRectangle{
    public double width = 5;
    public double height =4;
}

class BadCircle{
    public double radius = 3;
}

// Following the OCP : Open for extension but close for modification

interface Shape{
    double calculateArea();
}

class Rectangle implements Shape{
    private final double width;
    private final double height;

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return width * height;
    }
}


class Circle implements Shape{
    private final double radius;
    private static final double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return PI * radius;
    }
}

class GoodAreaCalculator{
    public double totalArea(List<Shape> shape){
        double sum = 0;
        for(Shape x : shape){
            sum += x.calculateArea();
        }
        return sum;
    }
}

public class OpenClosePrinciple {
    public static void main(String[] args) {
        System.out.println("-- Open/Closed Principle--");
        GoodAreaCalculator calc = new GoodAreaCalculator();
        List<Shape> shapes = List.of(new Rectangle(5,4), new Circle(3));
        System.out.println("Total Calculated Area: "+calc.totalArea(shapes));

    }
}
/*
-- Open/Closed Principle--
Total Calculated Area: 29.42
*/