package VisitorPattern;

public class Square implements Shape{
    private double radius;
    private String name;
    public Square(double radius, String name){
        this.radius =radius;
        this.name= name;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save(ShapeVisitor visitor) {
        System.out.println("saving square....");
        visitor.visit(this);
    }
}

