abstract class Shape2 {
    abstract double perimeter();
    abstract double area();
}

class Circle2 extends Shape2 {
    int radius;

    Circle2(int radius) {
        this.radius=radius;
    }

    @Override
    double perimeter() {
        return 2*3.142*this.radius;
    }

    @Override
    double area() {
        return 3.142*this.radius*this.radius;
    }
}

class Rectangle2 extends Shape2 {
    int length;
    int width;

    Rectangle2(int length, int width) {
        this.length=length;
        this.width=width;
    }

    @Override
    double perimeter() {
        return 2*(this.length+this.width);
    }

    @Override
    double area() {
        return this.length*this.width;
    }
}

class Triangle2 extends Shape2 {
    int a;
    int b;
    int c;

    Triangle2(int a,int b,int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    double perimeter() {
        return (this.a+this.b+this.c);
    }

    @Override
    double area() {
        double s=this.perimeter()/2;
        return java.lang.Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class PracProblem4 {
    public static void main(String[] args) {
        Shape2 obj=new Circle2(10);
        System.out.println(obj.perimeter());
        System.out.println(obj.area());

        obj=new Rectangle2(10, 20);
        System.out.println(obj.perimeter());
        System.out.println(obj.area());

        obj=new Triangle2(10, 20, 30);
        System.out.println(obj.perimeter());
        System.out.println(obj.area());
    }
}
