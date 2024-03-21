import java.util.Scanner;

class Car {
    private String name;
    private int topSpeed;

    public Car(String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    // @Override
    public String toString() {
        return "Car: " + name + ", Top Speed: " + topSpeed + " km/h";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = new Car[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter car name: ");
            String name = scanner.nextLine();
            System.out.println("Enter top speed (km/h): ");
            int topSpeed = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            cars[i] = new Car(name, topSpeed);
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
