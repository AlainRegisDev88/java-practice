

class GrandParent {
    GrandParent(){
        System.out.println("I am 60 years old!");
    }
}

class Parent extends GrandParent{
    Parent(){
        System.out.println("I am 40 years old!");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("I am 20 years old!");
    }

    Child(String status) {
        this();
        System.out.println("I am also " + status);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        new Child("The favorite");
    }
}
