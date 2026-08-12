
class Vehicle {
    int wheels;
    String name;
    public Vehicle() {
        this.wheels = 4;
        this.name = "Vehicle";
    } 

    public Vehicle (int wheels, String name) {
        this.wheels = wheels;
        this.name = name;
    }

    public  String describe() {
        return "The vehicle has " + wheels + " wheels";
    }

    public static String category() {
        Vehicle obj = new Vehicle();
        return "This is a " + obj.name;
    }
}

class Motorbike extends Vehicle {
    Motorbike(){
        super(2, "Motorbike");
    }

    @Override
    public String describe() {
        return "This vehicle has " + wheels + " wheels";
    }

    public static String category() {
        Vehicle obj = new Motorbike();
        return "This is a " + obj.name;
    }

}

class Unicycle  extends Vehicle{
    public Unicycle(){
        super(1, "Unicycle");
    }

    @Override
    public String describe(){
        return "This vehicle has " + wheels + " wheel(s)";
    }

    public static String category() {
        Vehicle obj = new Unicycle();
        return "This is a " + obj.name;
    }
}


public class Overriding2 {
    public static void main (String[] args) {
        Vehicle obj = new Unicycle();

        String type = obj.describe();
        System.out.println(type);
    }
}
