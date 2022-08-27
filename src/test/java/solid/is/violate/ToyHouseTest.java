package solid.is.violate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyHouseTest {
    @Test
    void toyHouseBuild() {
        var toyHouse = new ToyHouse.ToyHouseBuilder().setColour("green").setPrice(1.99).build();
        assertEquals("ToyHouse{price=1.99, colour='green'}", toyHouse.toString());
    }
}