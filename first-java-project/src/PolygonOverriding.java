class Polygon{
    int sides;
    String name;
    String color;
    public Polygon(){
        this.sides = 0;
        this.name = "UNKNOWN";
        this.color = "WHITE";
    }

    public Polygon(int sides,String name, String color){
        this.sides = sides;
        this.name = name;
        this.color = color;
    }

    public String describe(){
        return "The Polygon is "+name+ " It has " + sides + " sides and it is "+ color +".";
    }
}

class Rectangle extends Polygon{
    public Rectangle() {
        super(3, "Rectangle", "Blue");
    }

    @Override 
    public String describe(){
        return "The Polygon is "+name+ " It has " + sides + " sides and it is "+ color +".";
    }
}


public class PolygonOverriding {
    public static void main(String[] args){
        Polygon rectangle = new Rectangle();

        String rectangle_description = rectangle.describe();
        System.out.println(rectangle_description);
        
        Polygon poly =  new Polygon();
        String defaultPolygon = poly.describe();
        System.out.println(defaultPolygon);
    }
    


}
