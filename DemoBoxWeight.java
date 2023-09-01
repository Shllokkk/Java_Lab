class Box {
    private double width;
    private double height;
    private double depth;

    // Constructor for initializing width, height, and depth
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Default constructor using constructor chaining with default values
    Box() {
        this(-1, -1, -1);
    }

    // Constructor for initializing width, height, and depth with a common length
    Box(double len) {
        this(len, len, len);
    }

    // Calculate the volume of the box
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    private double weight;

    // Constructor for initializing width, height, depth, and weight
    BoxWeight(double w, double h, double d, double weight) {
        super(w, h, d); // Call the parent class constructor
        this.weight = weight;
    }

    // Constructor for initializing width, height, depth with a common length, and weight
    BoxWeight(double len, double weight) {
        super(len); // Call the parent class constructor
        this.weight = weight;
    }

    // Get the weight of the box
    double getWeight() {
        return weight;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        // Create instances of BoxWeight
        BoxWeight b1 = new BoxWeight(20, 30, 40, 50);
        BoxWeight b2 = new BoxWeight(2, 3, 4, 5);

        // Calculate volume and display information for b1
        double vol = b1.volume();
        System.out.println("Volume of b1 is " + vol);
        System.out.println("Weight of b1 is " + b1.getWeight());
        System.out.println();

        // Calculate volume and display information for b2
        vol = b2.volume();
        System.out.println("Volume of b2 is " + vol);
        System.out.println("Weight of b2 is " + b2.getWeight());
        System.out.println();
    }
}
