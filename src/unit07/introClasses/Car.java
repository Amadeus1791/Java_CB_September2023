package unit07.introClasses;

public class Car {
    // fields ==> What am I?
    String manufacturer;
    String model;
    short horsePower;
    boolean engineRunning;


    // Constructor(s)
    public Car() {
        model = "Unknown";
        manufacturer = "Standard";
        horsePower = 100;
    }

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        horsePower= 200;
      //  this(manufacturer, model, 200, false);
    }

    public Car(String manufacturer, String model, int horsePower) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.horsePower = (short) horsePower;
       // this(manufacturer, model, horsePower, false);
    }

    public Car(String manufacturer, String model, int horsePower, boolean engineRunning) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.horsePower = (short) horsePower;
        this.engineRunning = engineRunning;
    }

    // methods ==> What can I do?
    void startEngine() {
        if (engineRunning) {
            System.out.println("engine is already running");
        } else {
            System.out.println("engine is starting ...");
        }
        engineRunning = true;
    }

    void printCar() {
        System.out.println("manufacturer= "+ manufacturer );
        System.out.println("model= "+ model );
        System.out.println("horsePower= "+ horsePower );
        System.out.println("engineRunning= "+ engineRunning );
    }
}
