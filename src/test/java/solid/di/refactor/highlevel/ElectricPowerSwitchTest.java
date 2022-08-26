package solid.di.refactor.highlevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solid.di.refactor.lowlevel.LightBulb;

class ElectricPowerSwitchTest {
    ElectricPowerSwitch sut;

    @BeforeEach
    void setUp() {
    }

    @Test
    void pressShouldTurnOnALightBulb() {
        //given
        sut = new ElectricPowerSwitch(false, new LightBulb());
        //when
        Assertions.assertFalse(sut.isOn());
        var actual = sut.press();
        //then
        Assertions.assertEquals("", actual);
    }
}