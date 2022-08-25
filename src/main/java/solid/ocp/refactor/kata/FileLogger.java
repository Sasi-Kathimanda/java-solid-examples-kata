package solid.ocp.refactor.kata;

public class FileLogger implements IMessageLogger {
    @Override
    public String Log(String message) {
        return String.format("%s writing to FILE", message);
    }
}
