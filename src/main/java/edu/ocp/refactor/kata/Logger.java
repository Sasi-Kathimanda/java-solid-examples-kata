package edu.ocp.refactor.kata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sasi-kathimanda on 21/02/16.
 */
public class Logger {
    List<IMessageLogger> messageLoggers = new ArrayList<IMessageLogger>();

    public Logger(IMessageLogger messageLogger) {
        messageLoggers.add(messageLogger);
    }

    public void Log(String message) {
        for(IMessageLogger msg: messageLoggers)
            msg.Log(message);
    }
}
