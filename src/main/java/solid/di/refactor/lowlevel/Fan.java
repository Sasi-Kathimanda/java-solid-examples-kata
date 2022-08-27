package solid.di.refactor.lowlevel;

import solid.di.refactor.highlevel.Switchable;

public class Fan implements Switchable {
    @Override
    public String turnON() {
        return "Fan turned ON";
    }

    @Override
    public String turnOFF() {
        return "Fan turned OFF";
    }
}
