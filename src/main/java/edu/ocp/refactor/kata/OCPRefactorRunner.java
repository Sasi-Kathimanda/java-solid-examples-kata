package edu.ocp.refactor.kata;

/**
 * Created by sasi-kathimanda on 21/02/16.
 */
public class OCPRefactorRunner {
    public static void main(String[] args) {
        Logger consoleLogger = new Logger(new FileLogger());
        consoleLogger.Log("SASI");
    }
}
