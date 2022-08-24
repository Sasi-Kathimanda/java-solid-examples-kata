package edu.ocp.violate.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoggerTest {
    Logger sut;

    @BeforeEach
    void setUp() {
        sut = new Logger();
    }

    @Test
    void givenLoggerProduceLogMessage() {
        Assertions.assertAll("should return appropriate logger",
                () -> assertEquals("Hello writing to CONSOLE", sut.Log("Hello", LogType.CONSOLE)),
                () -> assertEquals("Hello writing to FILE", sut.Log("Hello", LogType.FILE)));
    }
}