package VisitorPattern;

public interface ShapeVisitor {
    public void visit(Circle circle);
    public void visit(Square square);
}
