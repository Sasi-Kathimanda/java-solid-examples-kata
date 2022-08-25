package solid.di.violate;

public class ElectricPowerSwitch {
    private boolean isOn;
    private LightBulb lightBulb;

    public ElectricPowerSwitch(boolean isOn, LightBulb lightBulb) {
        this.isOn = isOn;
        this.lightBulb = lightBulb;
    }

    public boolean isOn() {
        return isOn;
    }


    public String press() {
        if (isOn) {
            isOn = false;
            return lightBulb.turnedOFF();
        } else {
            isOn = true;
            return lightBulb.turnON();
        }
    }
}
