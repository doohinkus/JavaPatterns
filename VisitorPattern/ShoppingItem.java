package VisitorPattern;

public interface ShoppingItem {
    public double accept(ShoppingCartVisitor visitor);
}
