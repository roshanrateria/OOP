class Shape {
    // Variables to store dimensions
    private double length;
    private double width;
    private double height;
    private double radius;

    // Constructor for rectangle
    Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Constructor for cube
    Shape(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    // Constructor for cylinder
    Shape(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate volume of rectangle
    double calculateRectangleVolume() {
        return length * width;
    }

    // Method to calculate volume of cube
    double calculateCubeVolume() {
        return length * width * height;
    }

    // Method to calculate volume of cylinder
    double calculateCylinderVolume() {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        // Creating objects and calculating volumes
        Shape rectangle = new Shape(5, 10);
        System.out.println("Volume of Rectangle: " + rectangle.calculateRectangleVolume());

        Shape cube = new Shape(5);
        System.out.println("Volume of Cube: " + cube.calculateCubeVolume());

        Shape cylinder = new Shape(3, 5);
        System.out.println("Volume of Cylinder: " + cylinder.calculateCylinderVolume());
    }
}
