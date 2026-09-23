package class_exercises;

class Car{
    String color;

    Car(String color){
        this.color = color;
    }
}

public class PassArguments {
    public static void main(String[] args) {
        Car obj = new Car("Grey");
        System.out.println(obj.color);
        changeColor(obj);

        System.out.println(obj.color);

    }

    public static void changeColor(Car ref){
        ref.color = "Blue";
    }
    
    
    
}
