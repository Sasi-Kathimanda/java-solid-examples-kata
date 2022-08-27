package solid.di.refactor.lowlevel;

import solid.di.refactor.highlevel.Switchable;

public class LightBulb implements Switchable {
    @Override
    public String turnON() {
        return "LightBulb turned ON";
    }

    @Override
    public String turnOFF() {
        return "LightBulb turned OFF";
    }
}
