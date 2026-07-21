package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {

    @Test
    void testDoStringConcat() {

        DailyTasks obj = new DailyTasks();

        String actual = obj.doStringConcat("Hello", "World");

        assertEquals("Hello World", actual);
    }
}