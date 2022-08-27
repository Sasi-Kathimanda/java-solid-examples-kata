package solid.is.violate;

public class ToyHouse implements Toy {
    private double price;
    private String colour;

    public ToyHouse(ToyHouseBuilder toyHouseBuilder) {
        this.setColour(toyHouseBuilder.colour);
        this.setPrice(toyHouseBuilder.price);
    }

    @Override
    public String toString() {
        return "ToyHouse{" +
                "price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }

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
        return null;  //ToyHouse doesn't need to MOVE
    }

    @Override
    public String fly() {
        return null; //ToyHouse doesn't need to FLY
    }

    public static class ToyHouseBuilder {
        double price;

        String colour;

        public ToyHouseBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public ToyHouseBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Toy build() {
            return new ToyHouse(this);
        }
    }
}
