package solid.ocp.refactor.kata;

public class Logger {
    private final IMessageLogger messageLogger;

    public Logger(IMessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }

    public String Log(String message) {
        return messageLogger.Log(message);
    }
}
