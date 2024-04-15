public class Vehicle {
    String color;
    int numberOfWheels;
    public Vehicle(String c,int n){
      this.color=c;
      this.numberOfWheels=n;
    }
    public void start() {
      System.out.println("Started");
    }

    public void stop() {
        System.out.println("Stopped");
    }
  
    public void display() {
        System.out.println("Color: "+this.color+"\n Number of Wheels: "+this.numberOfWheels);
    }
  public static void main(String args[]){
    Vehicle car=new Vehicle("RED",4);
    car.display();
    car.start();
    car.stop();
  }
}
