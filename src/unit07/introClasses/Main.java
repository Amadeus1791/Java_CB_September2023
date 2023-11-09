package unit07.introClasses;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.engineRunning);
        System.out.println(car1.horsePower);
        System.out.println(car1.model);
        System.out.println(car1.manufacturer);
        car1.horsePower = 150;
        car1.manufacturer = "VW";
        car1.model = "Passat";

        car1.printCar();
        car1.startEngine();
        System.out.println(car1.engineRunning);

        Car car3 = new Car("Alfa", "Giulia");
        car3.printCar();

        Car car4 = new Car("Audi", "A7", 350);
        car4.printCar();

        Car car5 = new Car("Lamborghini", "Aventador", 700, true);
        car5.printCar();
    }
}
