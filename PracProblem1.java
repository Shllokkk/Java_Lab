class Shape {
    void calculateArea() {
        System.out.println("Calculating area of a generic shape.");
    }
}

class Circle extends Shape {
    void calculateArea(int radius) {
        System.out.println("Area of Circle: "+(3.14*radius*radius)+" sq. units"); 
    }
}

class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length,int width) {
        this.length=length;
        this.width=width;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Rectangle: "+(length*width)+"sq. units");
    }
}
public class PracProblem1 {
    public static void main(String[] args) {
        Shape s= new Shape();
        s.calculateArea();

        Circle c=new Circle();
        c.calculateArea(10);

        Shape obj=new Rectangle(10, 20);
        obj.calculateArea();
    }
}
