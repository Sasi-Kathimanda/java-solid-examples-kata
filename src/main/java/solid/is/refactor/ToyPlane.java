package solid.is.refactor;

public class ToyPlane implements Toy, Movable {
    private double price;
    private String colour;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }


    @Override
    public String move() {
        return "ToyPlane can move";
    }
}
