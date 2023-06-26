class Figure {
    double a;
    double b;

    Figure(double x, double y) {
        a = x;
        b = y;
    }

    double area() {
        System.out.println("Area of Figure is unknonw");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double x, double y) {
        super(x, y);
    }

    double area() {
        System.out.println("Area of rectangle is");
        return a * b;
    }

}

class Triangle extends Figure {
    Triangle(double x, double y) {
        super(x, y);

    }

    double area() {
        System.out.println("Area of Triangle is ");
        return a * b / 2;
    }
}

class FindArea {
    public static void main(String args[]) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure fig;
        fig = r;
        System.out.println("Area of Rectangle is " + fig.area());
        fig = t;
        System.out.println("Area of Triangle is " + fig.area());
        fig = f;
        System.out.println("Area of figur eis " + fig.area());
    }
}