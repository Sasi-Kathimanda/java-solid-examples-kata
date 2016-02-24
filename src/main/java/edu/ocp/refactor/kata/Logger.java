package edu.ocp.refactor.kata;

/**
 * Created by sasi-kathimanda on 21/02/16.
 */
public class Logger {
    IMessageLogger messageLogger;

    public Logger(IMessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }

    public void Log(String message) {
        messageLogger.Log(message);
    }
}
