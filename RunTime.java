class Vehicle{
  public void drive(){
    System.out.println("Driving vehicle ...");
  }
}
 
class Car extends Vehicle{
  
  public void drive(){
    System.out.println("Driving car...");
  }
}
 
class Truck extends Vehicle{
  
  public void drive(){
    System.out.println("Driving truck...");
  }
   
  public void load(){
    System.out.println("Loading truck...");
  }
}
public class RunTime {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    vehicle.drive();
     
    Vehicle carVehicle = new Car();
    carVehicle.drive();
     
    Vehicle truckVehicle = new Truck();
    truckVehicle.drive();
     
    
     
    Truck truck = new Truck();
    truck.load();
  }
}