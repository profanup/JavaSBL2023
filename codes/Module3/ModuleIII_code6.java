/* Problem Statement : 
Create an interface vehicle and classes like bicycle, car, bike having 
common functionalities and put all the common functionalities in the interface. 
Classes like Bicycle, Bike, car implement all these functionalities in their 
own class in their own way.

*/

// Interface defining common functionalities works as an abstract base class
interface Vehicle {
    void start();
    void accelerate();
    void brake();
    void stop();
}

// Class representing a Bicycle
class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle: Start pedaling");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle: Pedal faster");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle: Apply brakes");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle: Stop pedaling");
    }
}

// Class representing a Car
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car: Turn on the ignition");
    }

    @Override
    public void accelerate() {
        System.out.println("Car: Press the gas pedal");
    }

    @Override
    public void brake() {
        System.out.println("Car: Apply brakes");
    }

    @Override
    public void stop() {
        System.out.println("Car: Turn off the ignition");
    }
}

// Class representing a Bike
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike: Start pedaling");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike: Pedal faster");
    }

    @Override
    public void brake() {
        System.out.println("Bike: Apply brakes");
    }

    @Override
    public void stop() {
        System.out.println("Bike: Stop pedaling");
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle(); // note the difference in the way object is defined
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("Bicycle:");
        bicycle.start();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.stop();

        System.out.println("\nCar:");
        car.start();
        car.accelerate();
        car.brake();
        car.stop();

        System.out.println("\nBike:");
        bike.start();
        bike.accelerate();
        bike.brake();
        bike.stop();
    }
}
