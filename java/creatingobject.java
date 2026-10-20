class Car {
    String brand;
    int year;

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
public class creatingobject {
    public static void main(String[] args) {

        Car car1 = new Car();  // Creating first object
        car1.brand = "Toyota";
        car1.year = 2020;
        car1.display();

        Car car2 = new Car();  // Creating second object
        car2.brand = "Ford";
        car2.year = 2018;
        car2.display();
    }
}