package class_exercises;
import java.awt.Point;

public class ReferenceArguments2 {
    public static void main(String[] args) {
        Point position = new Point(2, 4);

        System.out.println("Start Location: "+ position.x + " "+  position.y);

        movePlayer(position);

        System.out.println("EndLocation: "+ position);
    }

    public static void movePlayer(Point ref){
        ref.translate(10, 10);
    }

}
