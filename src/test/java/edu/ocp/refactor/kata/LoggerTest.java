package edu.ocp.refactor.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoggerTest {
    Logger sut;

    @BeforeEach
    void setUp() {
    }

    @Test
    void logShouldGiveAppropriateMsgForGivenLogger() {
        assertEquals("Hello writing to CONSOLE", new Logger(new ConsoleLogger()).Log("Hello"));
        assertEquals("Hello writing to FILE", new Logger(new FileLogger()).Log("Hello"));
    }
}