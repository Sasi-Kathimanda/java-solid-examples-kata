package solid.is.refactor;

public class ToyHouse implements Toy {
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
}
