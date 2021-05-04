package InheritanceAndPolymorphism;

import oopLecture.Person;

import java.util.Locale;

public class InAndPolyTester {

    public static void main(String[] args) {
//        Person person = new Person("Douglas", "Hirsh");
//        //person.firstName = "Douglas";
//
//        System.out.println("person.joinsChat() = " + person.joinsChat());
//
//        System.out.println("person.sayHello() = " + person.sayHello());
//
//        Employee employee = new Employee("Kenneth", "Howell");
//        String greeting = employee.joinsChat();
//        //employee.firstName = "Douglas";
//
//        System.out.println("greeting = " + greeting);
//        employee.doWork();
//
//        System.out.println("employee.sayHello() = " + employee.sayHello());
//    }
        //here we are making a new instance of a vehicle and using dot notation we are implemeting the method start() on it
    Vehicle genericVehicle = new Vehicle();
    genericVehicle.start();

    Bus bus = new Bus(80);
    bus.setHeadlightsOn(true);
    bus.start();
    bus.honkHorn();
    bus.setNumberOfOccupants(2);
        System.out.println("zooming in a bus at " + bus.getMaxSpeed() + " MPH " + " with " +bus.getNumberOfOccupants() + " occupants inside!!! ");
        Jet fastJet = new Jet(2000);
        fastJet.setNumberOfOccupants(1);
        System.out.println("Borrowing jet " );
        fastJet.start();
        System.out.println("Zooming in a fast jet at " + fastJet.getMaxSpeed() + " MPH its just " + fastJet.getNumberOfOccupants() + " occupant AND IT'S  ME");

        System.out.println();
        // so when casting we remove the Vehicle class from the spawnVehicle constructor and we replace it with Bus in order to cast and be able to use the methods that aren't used in Vehicle but are used in Bus.

       Bus fasterBus = (Bus) spawnVehicle("bus",120);
       fasterBus.honkHorn();// this honkHorn method is only in the Bus.java Class and cannot be used in the Vehicle.java class but if we want to do this we can "Cast" the spawnVehicle constructor to spawnVehicle as a bus.
        fasterBus.start();
       Vehicle slowerJet = spawnVehicle("jet",700);
       slowerJet.start();
    }

   public static Vehicle spawnVehicle(String vehicleType, int maxSpeed){
        //Enhanced Switch Statement
        Vehicle vehicle = switch (vehicleType.toLowerCase()) {
            case "vehicle" -> new Vehicle(maxSpeed);
            case "bus" -> new Bus(maxSpeed);
            case "jet" -> new Jet(maxSpeed);
            default -> null;
        };
        //here we can use the .toLowerCase method to keep our

       return vehicle;
   }
   //Old way of Switch statement.
//    public static Vehicle spawnVehicle(String vehicleType, int maxSpeed){
//        Vehicle vehicle = null;
//        //here we can use the .toLowerCase method to keep our
//        switch (vehicleType.toLowerCase()){
//            case "vehicle":
//                vehicle = new Vehicle(maxSpeed);
//                break;
//            case "bus":
//                vehicle = new Bus(maxSpeed);
//                break;
//            case "jet":
//                vehicle = new Jet(maxSpeed);
//                break;
//        }
//
//        return vehicle;
//    }

}