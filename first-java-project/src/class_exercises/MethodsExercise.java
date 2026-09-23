package class_exercises;

import java.util.Scanner;

class GetInfo {
    String name;
    int age;
    Scanner in = new Scanner(System.in);

    public String getName() {
        System.out.print("Enter the name: ");
        this.name = in.nextLine();
        return this.name;
    }

    public int getAge() {
        System.out.print("Enter your age: ");
        this.age = Integer.parseInt(in.nextLine());
        return this.age;
    }

    public void displayDetails(String name, Integer age) {
        System.out.println();
        if (name != null && age != null) {
            System.out.print("Your name is " + name + " and you are " + age + " years old.");
        }
    }

}

public class MethodsExercise {

    public static void main(String[] args) {
        GetInfo get = new GetInfo();
        String name = get.getName();
        int age = get.getAge();
        get.displayDetails(name, age);
    }
}
